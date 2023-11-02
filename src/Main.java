import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //work with line
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first line: ");
        String line1 = in.nextLine();
        System.out.print("Enter the second line:");
        String line2 = in.nextLine();

        StringBuilder buffer = new StringBuilder();
        buffer.append(line1);
        buffer.append(line2);
        String result = buffer.toString();
        System.out.println("Result of concatenation: " + result);
        //work with dividers
        System.out.print("\nEnter text: ");
        String text = in.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        while (tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            System.out.println(word);
        }

        //operation with rows and StringBuffer
        System.out.print("\nEnter text: ");
        String enterText = in.nextLine();
        StringBuffer buffer1 = new StringBuffer(enterText);
        for (int i = 0; i < buffer1.length(); i++){
            char letter = buffer1.charAt(i);
            if(checkLetter(letter)){
                buffer1.deleteCharAt(i);
            }
        }
        String result1 = buffer1.toString();
        System.out.println("Result of operation with rows and StringBuffer: " + result1);

        //Method access control(class BankAccount)
        System.out.println();
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        //bankAccount.setBalance(33);

        //create class Book
        System.out.println();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281);
        Book book3 = new Book("1984", "George Orwell", 1949, 328);
        book1.getInfo();
        book2.getInfo();
        book3.getInfo();
        book1.setAuthor("Jhon Smit");
        System.out.println("Changed author of first book: " + book1.getAuthor());

        //Working with a bank account(class BankAccount2)
        System.out.println();
        BankAccount2 account = new BankAccount2(1000, 123456, "John Braun");

        account.printBalance();

        account.replenishmentBalance(500);
        System.out.println("Replenishing the account by 500.");
        account.printBalance();

        account.withdrawals(200);
        System.out.println("Withdrawing 200 from the account.");
        account.printBalance();
        
        //Driving a car
        System.out.println();
        Car car = new Car("Toyota", 200, 60);

        car.getInfo();
        car.startEngine();
        car.giveFuel();
        car.turnOffCar();

        //Store of product
        System.out.println();
        Product product1 = new Product("Phone", 500, 10);
        Product product2 = new Product("Laptop", 1000, 5);
        Product product3 = new Product("Tablet", 300, 8);

        double totalCost = product1.countPriceProducts() + product2.countPriceProducts() + product3.countPriceProducts();

        System.out.println("Total cost of all products: " + totalCost);

        // Change the quantity of the first product in stock
        product1.addNumber(5);
        System.out.println("New quantity of product '" + product1.getName() + "': " + product1.getNumber());
        product2.decreaseNumber(3);
        System.out.println("New quantity of product '" + product2.getName() + "': " + product2.getNumber());
    }
    public static boolean checkLetter(char letter){
        letter = Character.toUpperCase(letter);
        return letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }
}
