package lesson4hmw3;

public class Sales implements Entity{
	private int id;
	private String salesName;
	
	public Sales()
	{
		
	}
	public Sales(int id, String salesName) {
		super();
		this.id = id;
		this.salesName = salesName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalesName() {
		return salesName;
	}
	public void setSalesName(String salesName) {
		this.salesName = salesName;
	}

}
