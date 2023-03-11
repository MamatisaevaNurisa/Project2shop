package ProductStore.product.milkProduct;

import ProductStore.product.Product;

import java.time.LocalDate;

public class MilkProduct extends Product {
    public MilkProduct(int ID, String name, String companyName, LocalDate date) {
        super(ID, name, companyName, date);
    }
}
