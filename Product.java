import java.util.Map;

public class Product{
    String name;
    int rating;
    int price;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        if (rating > 10){
            this.rating = 10;
        }
    }

    @Override
    public String toString() {
        return "\nИмя товара: " + name + ", цена: " + price + " руб, рейтинг " + rating;
    }
}
