/**
 * @authors Tony Chen & Austin O'Connor
 * @version May 31, 2013
 */
package assignment2;

import java.util.GregorianCalendar;

public class LibraryBookGeneric<Type> extends Book {

	/**
	 * Constructor.
	 * @param isbn
	 * @param author
	 * @param title
	 */
	public LibraryBookGeneric(long isbn, String author, String title) 
	{
		super(isbn, author, title);
		// TODO Auto-generated constructor stub
	}

	protected boolean isCheckedIn = true;
	protected Type holder;
	protected GregorianCalendar dueDate;
		
	/**
	 * Accessor method.
	 * @return the holder.
	 */
	public Type getHolder()
	{
		if(isCheckedIn == true){
			return null; 
		}
		
		return holder;
		
	}
	/**
	 * Accessor method.
	 * @return the dueDate.
	 */
	public GregorianCalendar getDueDate()
	{
		if(isCheckedIn == true){
			return null; 
		}
		
		return dueDate;
	}
	
	public void checkedIn()
	{
		isCheckedIn = true;
	}
	public void checkedOut()
	{
		isCheckedIn = false;
	}
	
}
