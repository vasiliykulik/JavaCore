package src.m6staticfinal.offline.practice_equals_refactoring_DZ_practice;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (getId() != order.getId()) return false;
        if (isActive() != order.isActive()) return false;
        if (isDone() != order.isDone()) return false;
        if (getPrice() != order.getPrice()) return false;
        if (!getItemName().equals(order.getItemName())) return false;
        return getUser().equals(order.getUser());

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getItemName().hashCode();
        result = 31 * result + (isActive() ? 1 : 0);
        result = 31 * result + (isDone() ? 1 : 0);
        result = 31 * result + getPrice();
        result = 31 * result + getUser().hashCode();
        return result;
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
