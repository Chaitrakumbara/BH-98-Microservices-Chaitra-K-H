package Collection;

public class Creditcard {

	private String name;
	private int number;
	private int expirydate;
	
	public Creditcard(String name, int number, int expirydate) {
	
		this.name = name;
		this.number = number;
		this.expirydate = expirydate;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(int expirydate) {
		this.expirydate = expirydate;
	}

	@Override
	public String toString() {
		return "Creditcard [name=" + name + ", number=" + number + ", expirydate=" + expirydate + "]";
	}
	
	
}