package ProductStore.product;

import java.time.LocalDate;

public abstract class Product {

    private int ID;
    private String name;
    private String companyName;
    private LocalDate date;

    public Product(int ID, String name, String companyName, LocalDate date) {
        this.ID = ID;
        this.name = name;
        this.companyName = companyName;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", date=" + date +
                '}';
    }
}
