import java.util.ArrayList;
import java.util.Map;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();
    protected void add(Product product){
        products.add(product);
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
