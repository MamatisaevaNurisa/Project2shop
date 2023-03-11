package ProductStore.StoreService;

import ProductStore.product.Product;

import java.util.List;

public interface Service {
    void addProduct(List<Product>products);

    void sortedByDate(List<Product>products);
    void getAllProduct(String login,String password,List<Product> productsList);
}
