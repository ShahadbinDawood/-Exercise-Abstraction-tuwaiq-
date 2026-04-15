public class Book extends Product{
    private  String author ;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public double getDiscount() {
        return getPrice()-(getPrice()*0.2);
    }
    //added method
    public double addDiscount(int persent ) {
        double p = (double) persent /100;
        return getPrice()-(getPrice()*p);
    }

    @Override
    public String toString() {
        return getName()+" is written by "+author + "priced at "+getPrice();
    }
}
