/*
 * 
 */
package library;

/**
 *
 * @author Mihai
 */
public class Book {
    // the atributes of the Books class
    private  String title;
    private  int numberOfPages;

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    
    // method to display the books on the console
   
    public void displayBooks(){

       System.out.println(getTitle()+" "+getNumberOfPages());
          
}
}
