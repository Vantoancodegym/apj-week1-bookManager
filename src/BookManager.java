import java.util.Scanner;

public class BookManager {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner input= new Scanner(System.in);
        int choice;
        do {
        System.out.println("choose your choice");
        System.out.println("1. add new book");
        System.out.println("2. edit book by index");
        System.out.println("3. get Max price");
        System.out.println("4. get sum price");
        choice = input.nextInt();
        switch (choice){
            case 1:
                int index;
                System.out.println("input position in array books");
                index=input.nextInt();
                bookManager.addNewBook(index);
                break;
            case 2:
                int index1;
                System.out.println("input position in array books");
                index1=input.nextInt();
                bookManager.editBookByIndex(index1);
                break;
            case 3:
                System.out.println(bookManager.getMaxPrice());
                break;
            case 4:
                System.out.println(bookManager.getSumPrice());
                break;
            case 0:
                System.exit(0);
        }
        }while (choice!=0);
    }
    Book[] books=new Book[20];
    public void addNewBook(int index){
        books[index]=new Book();
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
