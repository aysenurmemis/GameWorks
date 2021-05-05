package ödev4;

public class Campaign {
	private int id;
	private String name;
	public int sale;
	
	
	public Campaign() {
		
	}


	public Campaign(int id, String name, int sale) {
		super();
		this.id = id;
		this.name = name;
		this.sale = sale;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSale() {
		return sale;
	}


	public void setSale(int sale) {
		this.sale = sale;
	}
	
	
	
}
