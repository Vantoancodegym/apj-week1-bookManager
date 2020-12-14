import java.util.Scanner;

public class Main {
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
            System.out.println("0. exit");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    int index;
                    do {
                        System.out.println("input position in array books");
                        index = input.nextInt();
                    }while (index<0||index>=20);
                    bookManager.addNewBook(index);
                    break;
                case 2:
                    int index1;
                    do {
                        System.out.println("input position in array books");
                        index1 = input.nextInt();
                    }while (index1<0||index1>=20);
                    bookManager.editBookByIndex(index1);
                    break;
                case 3:
                    System.out.println("Max price is" +bookManager.getMaxPrice());
                    break;
                case 4:
                    System.out.println("sum is "+bookManager.getSumPrice());
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
}
}
