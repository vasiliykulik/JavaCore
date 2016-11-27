package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.questions;

public class DAOImpl implements DAO {
    @Override
    public Order save(Order order) {
        System.out.println(order + " saved");
        return order;
    }
}
