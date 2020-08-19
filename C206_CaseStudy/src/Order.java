import java.util.ArrayList;

/**
 * @author 19044593
 *
 */
public class Order {

	private String username;
	private String status;
	private boolean takeaway;
	private ArrayList<MenuItem> items;

	/**
	 * @param username
	 * @param status
	 * @param menuItem
	 */
	public Order(String username, String status, boolean takeaway, ArrayList<MenuItem> items) {
		this.username = username;
		this.status = status;
		this.takeaway = takeaway;
		this.items = items;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the takeaway
	 */
	public boolean isTakeaway() {
		return takeaway;
	}

	/**
	 * @param takeaway the takeaway to set
	 */
	public void setTakeaway(boolean takeaway) {
		this.takeaway = takeaway;
	}

	/**
	 * @return the items
	 */
	public ArrayList<MenuItem> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<MenuItem> items) {
		this.items = items;
	}
	
	public String toString() {
		String i = "";
		return i;
	}
	
	

}
