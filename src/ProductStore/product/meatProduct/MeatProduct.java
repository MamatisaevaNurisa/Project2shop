package ProductStore.product.meatProduct;

import ProductStore.product.Product;

import java.time.LocalDate;

public class MeatProduct extends Product {
    public MeatProduct(int ID, String name, String companyName, LocalDate date) {
        super(ID, name, companyName, date);
    }
}
