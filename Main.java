import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Product product = new Product("ACER 1", 50, 20);
        Product product2 = new Product("ASUS 2", 50, 8);
        Product product6 = new Product("ASUS 3", 50, 8);
        Product product3 = new Product("Клавиатура", 50, 20);
        Product product4 = new Product("Мышь", 50, 20);
        Product product5 = new Product("Наушники", 50, 20);

        Category category = new Category("Аксессуары");
        Category category2 = new Category("Ноутбуки");

        category.addProduct(product3);
        category.addProduct(product4);
        category.addProduct(product5);
        category2.addProduct(product);
        category2.addProduct(product2);
        category2.addProduct(product6);

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(category);
        categories.add(category2);


        User user = new User("Вася", "qwerty");
        user.addProduct(category, product4);
        user.addProduct(category2, product);


        User user2 = new User("Андрей", "poiuyt");
        user2.addProduct(category2, product6);

        System.out.println(categories);
        System.out.println();
        System.out.println(user);
        System.out.println();
        System.out.println(user2);

    }
}