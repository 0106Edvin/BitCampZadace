package ba.bitcamp.edvin.zadaca01;

public abstract class Author {
	/**
	 * Properties of author
	 */
	private String authorName;
	private String mail;
	private boolean isMale;
	
	/**
	 * Creating constructors
	 * @param authorName Name of author
	 * @param mail Author mail
	 * @param isMale Gives us opportunity to decide if author is male or female
	 */
	
	public Author(String authorName, String mail, boolean isMale) {
		this.authorName = authorName;
		this.mail = mail;
		this.isMale = isMale;
	}
	/**
	 * Returns name of author
	 * @return
	 */
	public String getName() {
		return authorName;
	}
	/**
	 * Gives user opportunity to set authors name
	 * @param authorName
	 */
	public void setName(String authorName) {
		this.authorName = authorName;
	}
	/**
	 * Return author email
	 * @return
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * Gives user opportunity to set authors email
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * Returns if author is male or female (true or false)
	 * @return
	 */
	public boolean isMale() {
		return isMale;
	}
	/**
	 * Gives user opportunity to set authors gender
	 * @param isMale
	 */
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	/**
	 * Prints information about author
	 */
	public String toString() {
		return String.format("Author name: %s \nMail: %s\nAuthor is male? %b",
				authorName, mail, isMale);
	}

}
