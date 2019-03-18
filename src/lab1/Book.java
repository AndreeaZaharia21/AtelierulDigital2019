package lab1;

public class Book {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int price;
    public Book(int price)
        {this.price = price;}
        public String getName()
        {return name;}

}
