package cs3220.model;

public class Item {
	private String itemName;
	private String personName;
	private int id;
	private static int idSeed = 1;
	
	public Item(String itemName) {
		this.itemName = itemName;
		this.id = idSeed++;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
