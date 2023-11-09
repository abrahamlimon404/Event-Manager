package cs3220.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cs3220.model.Event;
import cs3220.model.Item;

@Component
public class EventManager {
    private List<Event> events = new ArrayList<>();
    private List<Item> items = new ArrayList<>();

    public EventManager() {
        Event e1 = new Event("Room 19 Valentine Party", LocalDate.of(2023, 2, 14), "Amy Frank");
        Event e2 = new Event("Room 19 Kindergarten Graduation", LocalDate.of(2023, 6, 15), "Amy Frank");

        events.add(e1);
        events.add(e2);
        
        Item i1 = new Item("Chips");
        Item i2 = new Item("Cookies");
        items.add(i1);
        items.add(i2);
        
        i1.setPersonName("Bob");
        //i2.setPersonName("Alice");
        
        e1.getItems().add(i1);
        e1.getItems().add(i2);
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> getEvents() {
        return events;
    }
    
    public Event findEventById(int id) {
        for (Event event : events) {
            if (event.getId() == id) {
                return event;
            }
        }
        return null;
    }
    
    public Item findItemById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
