package ProductStore;

import ProductStore.StoreService.ServiceImpl;
import ProductStore.StoreService.Store;
import ProductStore.product.Product;
import ProductStore.product.flourProduct.Bread;
import ProductStore.product.flourProduct.Pasta;
import ProductStore.product.flourProduct.Torment;
import ProductStore.product.meatProduct.Fish;
import ProductStore.product.meatProduct.LambMeat;
import ProductStore.product.meatProduct.Sausage;
import ProductStore.product.milkProduct.Kefir;
import ProductStore.product.milkProduct.Milk;
import ProductStore.product.milkProduct.SourCream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        products.add(new Fish(1, "Bob", "TOIBOSS", LocalDate.of(2023, 4, 11)));
        products.add(new LambMeat(2, "Meat", "TOIBOSS", LocalDate.of(2023, 3, 27)));
        products.add(new Sausage(3, "Italian Sausage", "MILKA", LocalDate.of(2023, 2, 26)));
        products.add(new Kefir(4, "Bifidoc", "NUR", LocalDate.of(2023, 4, 11)));
        products.add(new Milk(5, "Thumbelinas Milk", "NESQUIK", LocalDate.of(2023, 3, 15)));
        products.add(new SourCream(6, "Daisy", "MAKFA  ", LocalDate.of(2023, 4, 20)));
        products.add(new Bread(7, "Sourdough", "TAMSHAN", LocalDate.of(2023, 4, 13)));
        products.add(new Pasta(8, "Spaghetti", "NUR", LocalDate.of(2023, 4, 16)));
        products.add(new Torment(9, "Misery", "MILKA", LocalDate.of(2023, 3, 30)));

        ServiceImpl serviceImpl = new ServiceImpl();
        serviceImpl.addProduct(products);
        serviceImpl.sortedByDate(products);

        System.out.println("Enter login and password");
        serviceImpl.getAllProduct(scanner.nextLine(), scanner.nextLine(), products);






    }
}