/**
 * @authors Tony Chen & Austin O'Connor
 * @version May 31, 2013
 */
package assignment2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Testing class for LibraryGeneric.
 *
 */
public class LibraryGenericTest {

  public static void main(String[] args) {

    // test a library that uses names (String) to id patrons
    LibraryGeneric<String> lib1 = new LibraryGeneric<String>();
    lib1.add(9780374292799L, "Thomas L. Friedman", "The World is Flat");
    lib1.add(9780330351690L, "Jon Krakauer", "Into the Wild");
    lib1.add(9780446580342L, "David Baldacci", "Simple Genius");

    String patron1 = "Jane Doe";

//    if (!lib1.checkout(9780330351690L, patron1, 1, 1, 2008))
//      System.err.println("TEST FAILED: first checkout");
//    if (!lib1.checkout(9780374292799L, patron1, 1, 1, 2008))
//      System.err.println("TEST FAILED: second checkout");
//    ArrayList<LibraryBookGeneric<String>> booksCheckedOut1 = lib1
//        .lookup(patron1);
//    if (booksCheckedOut1 == null
//        || booksCheckedOut1.size() != 2
//        || !booksCheckedOut1.contains(new Book(9780330351690L, "Jon Krakauer",
//            "Into the Wild"))
//        || !booksCheckedOut1.contains(new Book(9780374292799L,
//            "Thomas L. Friedman", "The World is Flat"))
//        || !booksCheckedOut1.get(0).getHolder().equals(patron1)
//        || !booksCheckedOut1.get(0).getDueDate().equals(
//            new GregorianCalendar(2008, 1, 1))
//        || !booksCheckedOut1.get(1).getHolder().equals(patron1)
//        || !booksCheckedOut1.get(1).getDueDate().equals(
//            new GregorianCalendar(2008, 1, 1)))
//      System.err.println("TEST FAILED: lookup(holder)");
//    if (!lib1.checkin(patron1))
//      System.err.println("TEST FAILED: checkin(holder)");

//    // test a library that uses phone numbers (PhoneNumber) to id patrons
//    LibraryGeneric<PhoneNumber> lib2 = new LibraryGeneric<PhoneNumber>();
//    lib2.add(9780374292799L, "Thomas L. Friedman", "The World is Flat");
//    lib2.add(9780330351690L, "Jon Krakauer", "Into the Wild");
//    lib2.add(9780446580342L, "David Baldacci", "Simple Genius");
//
//    PhoneNumber patron2 = new PhoneNumber("801.555.1234");
//
//    if (!lib2.checkout(9780330351690L, patron2, 1, 1, 2008))
//      System.err.println("TEST FAILED: first checkout");
//    if (!lib2.checkout(9780374292799L, patron2, 1, 1, 2008))  
//      System.err.println("TEST FAILED: second checkout");
//    ArrayList<LibraryBookGeneric<PhoneNumber>> booksCheckedOut2 = lib2
//        .lookup(patron2);
//    if (booksCheckedOut2 == null
//        || booksCheckedOut2.size() != 2
//        || !booksCheckedOut2.contains(new Book(9780330351690L, "Jon Krakauer",
//            "Into the Wild"))
//        || !booksCheckedOut2.contains(new Book(9780374292799L,
//            "Thomas L. Friedman", "The World is Flat"))
//        || !booksCheckedOut2.get(0).getHolder().equals(patron2)
//        || !booksCheckedOut2.get(0).getDueDate().equals(
//            new GregorianCalendar(2008, 1, 1))
//        || !booksCheckedOut2.get(1).getHolder().equals(patron2)
//        || !booksCheckedOut2.get(1).getDueDate().equals(
//            new GregorianCalendar(2008, 1, 1)))
//      System.err.println("TEST FAILED: lookup(holder)");
//    if (!lib2.checkin(patron2))                           
//      System.err.println("TEST FAILED: checkin(holder)");
    
    System.out.println(lib1.getInventoryList());
    System.out.println(lib1.getOrderedByAuthor());
    lib1.checkout(9780330351690L, patron1, 1, 1, 2008);
    lib1.checkout(9780374292799L, patron1, 5, 7, 2008);
    
    //lib1.checkin(patron1);
    System.out.println("overdue list: "+ lib1.getOverdueList(5, 6, 2008));
    
    System.out.println("Generic Testing done.");
    

  }
  
 
}
