/**
 * @authors Tony Chen & Austin O'Connor
 * @version May 31, 2013
 */
package assignment2;

import java.util.GregorianCalendar;

public class LibraryBook extends Book {

	protected boolean isCheckedIn;
	protected String holder;
	protected GregorianCalendar dueDate = null;
	
	/**
	 * Constructor.
	 * @param isbn
	 * @param author
	 * @param title
	 */
	public LibraryBook(long isbn, String author, String title)
	{
		super(isbn, author, title);
	}
		
	/**
	 * Accessor method.
	 * @returns the holder.
	 */
	public String getHolder()
	{
		if(isCheckedIn == true){
			return null; 
		}
		
		return holder;
		
	}
	/**
	 * Accessor method.
	 * @returns the dueDate.
	 */
	public GregorianCalendar getDueDate()
	{
		if(isCheckedIn == true){
			return null; 
		}
		
		return dueDate;
	}
}
