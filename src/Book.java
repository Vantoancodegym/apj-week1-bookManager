import java.util.Scanner;

public class Book {
    String name;
    String author;
    int price;
    int amount;
    double weight;
    public void setInformation(){
        Scanner input= new Scanner(System.in);
        System.out.println("input nam of book");
        name=input.nextLine();
        System.out.println("input author of book");
        author=input.nextLine();
        System.out.println("input pice");
        price=input.nextInt();
        System.out.println("input amount");
        amount=input.nextInt();
        System.out.println("input weight");
        weight=input.nextInt();
    }
    public double geTotalPrice(){
        return this.amount*this.price;
    }
    public double geTotalWeight(){
        return this.amount*this.weight;
    }

}
