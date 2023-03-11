package ProductStore.StoreService;

import ProductStore.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ServiceImpl implements Service {


    private final Store store = new Store();

    private final Manager manager = new Manager();


    @Override
    public void addProduct(List<Product> products) {
        List<Product> products3 = products.stream().filter(r -> r.getCompanyName().equals("TOIBOSS")
                        || r.getCompanyName().equals("MILKA")
                        || r.getCompanyName().equals("NUR"))
                .filter(s -> s.getDate()
                        .isAfter(LocalDate.now().plusDays(30))).toList();

        store.getProducts1().addAll(products3);
        System.out.println("   ");
        for (Product product : store.getProducts1()) {
            System.out.println(product);
        }
    }
    @Override
    public void sortedByDate(List<Product> products) {
        products.removeIf(product -> product.getDate().isBefore(LocalDate.now()));
        List<Product> productList = products.stream().filter(r -> r.getCompanyName().equals("TOIBOSS")
                        || r.getCompanyName().equals("MILKA")
                        || r.getCompanyName().equals("NUR"))
                .filter(s -> !s.getDate().isAfter(LocalDate.now().plusDays(7))).toList();
        productList.forEach(product -> store.getProducts2().add(product));
        System.out.println("PROMOTION");

        store.getProducts2().forEach(System.out::println);
    }
    @Override
    public void getAllProduct(String login, String password,List<Product> productsList) {


        if (login.equals(manager.getLogin()) && password.equals(manager.getPassword())) {
           addProduct(productsList);
           sortedByDate(productsList);
        }
        else{
            System.out.println("Incorrect login or password");
        }

    }
}
