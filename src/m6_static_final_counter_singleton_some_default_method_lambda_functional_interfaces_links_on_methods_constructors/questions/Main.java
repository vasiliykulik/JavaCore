package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.questions;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        User user = new User(1001, "Denis", "Test", "Poltava");
        Item item = new Item();
        item.setName("BMW");
        item.setCityStored("Kiev");

        controller.makeOrder(user, item);

        controller.cancelOrder(user, item);
    }
}
