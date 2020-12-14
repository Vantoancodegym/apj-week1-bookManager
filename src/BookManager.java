import java.util.Scanner;

public class BookManager {
    static Book[] books=new Book[20];
    public void addNewBook(int index){
        if (books[index]==null){
        books[index]=new Book();}
    }
    public void editBookByIndex(int index){
        if (books[index]==null){
            System.out.println("obj is not declared");
        }else {
            books[index].setInformation();
        }
    }
    public int getMaxPrice(){
        int maxPrice=0;
        for (int i = 0; i < books.length; i++) {
            if (books[i]!=null){
                if (books[i].price>maxPrice){
                    maxPrice=books[i].price;
                }
            }
        }
        return maxPrice;

    }
    public int getSumPrice(){
        int sum=0;
        for (int i = 0; i < books.length; i++) {
            if (books[i]!=null){
                sum+=books[i].geTotalPrice();
            }
        }
        return sum;
    }
}
