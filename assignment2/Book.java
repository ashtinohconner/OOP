/**
 * @authors Tony Chen & Austin O'Connor
 * @version May 31, 2013
 */
package assignment2;

/**
 * Class representation of a book. The ISBN, author, and title can never change
 * once the book is created.
 * 
 * Note that ISBNs are unique.
 *
 */
public class Book {

  private long isbn;

  private String author;

  private String title;

  /**
   * Constructor.
   * @param _isbn
   * @param _author
   * @param _title
   */
  public Book(long _isbn, String _author, String _title) {
    this.isbn = _isbn;
    this.author = _author;
    this.title = _title;
  }

  /**
   * getAuthor
   * @return the author
   */
  public String getAuthor() {
    return this.author; 
  }

  /**
   * getIsbn
   * @return the ISBN
   */ public long getIsbn() {
    return this.isbn;
  }

  /**
   * getTitle.
   * @return the title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Two books are considered equal if they have the same ISBN, author, and
   * title.
   * 
   * @param other --
   *          the object begin compared with "this"
   * @return true if "other" is a Book and is equal to "this", false otherwise
   */
  public boolean equals(Object other)
  {
    // FILL IN -- do not return false unless appropriate
	  
	Book otherBook = (Book) other;
    if(isbn == otherBook.getIsbn())
    	return true;
    
    return false;
  }
  
  /**
   * Returns a string representation of the book.
   */
  public String toString() {
    return isbn + ", " + author + ", \"" + title + "\"";
  }
}
