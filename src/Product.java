public class Product {
    private final String name;
    private double price;
    private int number;

    public Product(String name, double price, int number){
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double countPriceProducts(){
        return price * number;
    }
    public void addNumber(int add){
        number +=add;
    }
    public void decreaseNumber(int dec){
        number -=dec;
    }
}
