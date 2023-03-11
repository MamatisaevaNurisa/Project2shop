package ProductStore.product.flourProduct;

import ProductStore.product.Product;

import java.time.LocalDate;

public class FlourProduct extends Product {
    public FlourProduct(int ID, String name, String companyName, LocalDate date) {
        super(ID, name, companyName, date);
    }
}

