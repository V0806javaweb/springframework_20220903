package demo.model;

public class User {
	private String username;
	private String password;
	private String address;
	private boolean receivePaper;
	private String [] favoriteFrameworks;
	
	public User() {
		
	}

	public User(String username, String password, String address, boolean receivePaper, String[] favoriteFrameworks) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.receivePaper = receivePaper;
		this.favoriteFrameworks = favoriteFrameworks;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isReceivePaper() {
		return receivePaper;
	}

	public void setReceivePaper(boolean receivePaper) {
		this.receivePaper = receivePaper;
	}

	public String[] getFavoriteFrameworks() {
		return favoriteFrameworks;
	}

	public void setFavoriteFrameworks(String[] favoriteFrameworks) {
		this.favoriteFrameworks = favoriteFrameworks;
	}   
	
	
}
