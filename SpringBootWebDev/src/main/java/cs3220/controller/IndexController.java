package cs3220.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cs3220.model.Event;
import cs3220.model.Item;




@Controller
public class IndexController {
    @Autowired
    private EventManager eventManager; 

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("events", eventManager.getEvents()); 
        return "index";
    }

	@GetMapping("/addEvent")
	public String add(Model model) {
		model.addAttribute(new Event("", null, ""));
		return "addEvent";
	}
	
	@PostMapping("/addEvent")
    public String result(@ModelAttribute("entry") Event entry) {
        eventManager.addEvent(entry);
        return "redirect:/";
    }
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("event", eventManager.findEventById(id));
		return "edit";
	}
	
	@PostMapping("/edit/{id}")
	public String edit(@PathVariable int id, @ModelAttribute Event event) {
		Event existingEvent = eventManager.findEventById(event.getId());
		existingEvent.setName(event.getName());
		existingEvent.setDate(event.getDate());
		existingEvent.setUser(event.getUser());
		return "redirect:/";
	}
	
	@GetMapping("/viewEventItems/{id}")
	public String viewEventItem(@PathVariable int id, Model model) {
		model.addAttribute("event", eventManager.findEventById(id));
		return "viewEventItems";
	}
	
	@PostMapping("/viewEventItems/{id}")
	public String viewEventItem(@PathVariable int id, @ModelAttribute Event event) {
		return "redirect:/";
	}
	
	@GetMapping("/viewEventItems/{eventId}/assignPerson/{id}")
	public String viewAssignPerson(@PathVariable int id, @PathVariable int eventId, Model model) {
		model.addAttribute("item", eventManager.findItemById(id));
		model.addAttribute("event", eventManager.findEventById(eventId));
		return "assignPerson";
	}
	
	@PostMapping("/viewEventItems/{eventId}/assignPerson/{id}")
	public String submitAssignPerson(@PathVariable int id, @PathVariable int eventId, @ModelAttribute("personName") String personName) {
	    Item item = eventManager.findItemById(id);
	    item.setPersonName(personName);
	    return "redirect:/viewEventItems/{eventId}";
	}
	
	@GetMapping("/addItem/{id}")
	public String viewAddItem(@PathVariable int id, Model model) {
		model.addAttribute("event", eventManager.findEventById(id));
		return "addItem";
	}
	
	@PostMapping("/addItem/{id}")
	public String sumbitAddItem(@PathVariable int id, @ModelAttribute("name") String itemName, @ModelAttribute("num") int num) {
		Event event = eventManager.findEventById(id);
		while(num > 0) {
			Item i = new Item(itemName);
			event.getItems().add(i);
			eventManager.getItems().add(i);
			num--;
		}
		return "redirect:/viewEventItems/" + id;
	}
	@GetMapping("/viewEventItems/{eventId}/delete/{itemId}")
	public String delete(@PathVariable int eventId, @PathVariable int itemId) {
		Event e = eventManager.findEventById(eventId);
		Item i = eventManager.findItemById(itemId);
		e.getItems().remove(i);
		eventManager.getItems().remove(i);
		return "redirect:/viewEventItems/" + eventId;
	}

}
