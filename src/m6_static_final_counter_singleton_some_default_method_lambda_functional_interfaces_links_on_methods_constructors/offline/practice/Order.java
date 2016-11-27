package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.offline.practice;

/**
 * Created by Стрела on 19.09.2016.
 */
public class Order {
    private long id;
    private String itemName;
    private boolean isActive;
    private boolean isDone;
    private int price;
    private User user;

    public Order(long id, String itemName, boolean isActive, boolean isDone, int price) {
        this.id = id;
        this.itemName = itemName;
        this.isActive = isActive;
        this.isDone = isDone;
        this.price = price;
    }

    public void setUser(User user){
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isDone() {
        return isDone;
    }

    public int getPrice() {
        return price;
    }

    public User getUser() {
        return user;
    }
}
