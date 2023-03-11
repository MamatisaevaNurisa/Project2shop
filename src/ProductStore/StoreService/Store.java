package ProductStore.StoreService;

import ProductStore.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
  private    List<Product>products1=new ArrayList<>();
  private   List<Product>products2=new ArrayList<>();

    public List<Product> getProducts1() {
        return products1;
    }

    public void setProducts1(List<Product> products1) {
        this.products1 = products1;
    }

    public List<Product> getProducts2() {
        return products2;
    }

    public void setProducts2(List<Product> products2) {
        this.products2 = products2;
    }

    @Override
    public String toString() {
        return "ProductStore.StoreService.Store{" +
                "products1=" + products1 +
                ", products2=" + products2 +
                '}';
    }
}
