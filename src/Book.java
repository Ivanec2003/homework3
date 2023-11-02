public class Book {
   private String name;
   private String author;
   private int yearPublicate;
   private int numberPage;

   public Book(String name, String author, int yearPublicate, int numberPage){
       this.name = name;
       this.author = author;
       this.yearPublicate = yearPublicate;
       this.numberPage = numberPage;
   }

   public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublicate() {
        return yearPublicate;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublicate(int yearPublicate) {
        this.yearPublicate = yearPublicate;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }
    public void getInfo(){
        System.out.println("Title: " +name);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearPublicate);
        System.out.println("Number of Pages: " + numberPage);
        System.out.println("---------------------");
    }
}
