package cs3220.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Event{
	private static int idSeed = 1;
	private int id;
	
	private String name;
	private LocalDate date;
	private String user;
	
	private List<Item> items;
	
	public Event(String name, LocalDate date, String user) {
		id = idSeed++;
		this.name = name;
		this.date = date;
		this.user = user;
		items = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public static int getIdSeed() {
		return idSeed;
	}

	public static void setIdSeed(int idSeed) {
		Event.idSeed = idSeed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	
}
