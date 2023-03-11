package ProductStore.StoreService;

public class Manager {
    private final String login = "nur_22";
    private final String password = "2206";

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ProductStore.StoreService.Manager{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
