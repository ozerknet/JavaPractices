public class Book {
    private String title;
    private String author;
    private String tableOfContents = "";
    private int nextPage = 1;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTableOfContents() {
        return tableOfContents;
    }
    public int getPage() {
        return nextPage;
    }
    public void addChapter(String title, int pages) {
        String newChapter = title + "..." + nextPage + "\n";
        tableOfContents = tableOfContents + newChapter;
        nextPage = nextPage + pages;
    }

    @Override
    public String toString() {
        return title + "\n" +
                author;
    }

    public static void main(String[] args) {
        Book story = new Book("Last Story", "James Mahmut");
        story.addChapter("Future",10);
        System.out.println(story);

        System.out.println(story.getTableOfContents());

        story.addChapter("Adalet",20);

        System.out.println(story.getTableOfContents());

    }


}
/*
Write a [class](https://pearson.turingscraft.com/codelab/jsp/core_dhtml.jsp?#) [named](https://pearson.turingscraft.com/codelab/jsp/core_dhtml.jsp?#) Book containing:

Instance variables :
title, author, tableOfContents as String (initialize to empty String)
nextPage as int ( initialize it to 1)

Constructor :
a constructor to accept 2 parameter as title and author to set the corresponding fields value


Methods :
getter method for tableOfContents

getPage() : has no parameter and return the page count

toString() : has no parameter and return the title and author in separate line ("\n" is the key)

addChapter() : accept parameters : String title , int pages

**The method is for building table of content in below format :**
**- new line character followed by title then followed by ... then next page**
**- pages parameter is used to increase the value of nextPage instance variable by the number of pages in the chapter.**
**F_or example :_**
**_if current nextPage is 1 and 3 pages chapter is added,_**
**_nextPage will be 4._**
 */