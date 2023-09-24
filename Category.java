import java.util.ArrayList;

public class Category {
    private String nameCategory;
    private ArrayList<Product> products = new ArrayList<>();

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }
    protected void movedBasked(Product product){
        products.remove(product);
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public String getNameCategory() {
        return nameCategory;
    }

    @Override
    public String toString() {
        return "\nКатегория: " + nameCategory + products.toString();
    }
}
