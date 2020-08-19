
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19026852, Aug 19, 2020 12:34:10 PM
 */

public class MenuItem extends CanteenApp{
	
	private String category ;
	private String name ;
	private double price ;

	public MenuItem(String category, String name, double price) {
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		String MIinfo = super.toString();
		return String.format("%-63s", MIinfo);
	}

}
