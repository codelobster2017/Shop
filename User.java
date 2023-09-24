public class User{
    private String name;
    private String pass;
    private Basket basket = new Basket();


    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }
    public void addProduct(Category category, Product product){
        this.basket.add(product);
        category.movedBasked(product);
    }

    @Override
    public String toString() {
        return "Имя пользователя: " + name + basket.toString();
    }
}