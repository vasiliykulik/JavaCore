package src.m6_static_final_counter_singleton_some_default_method_lambda_functional_interfaces_links_on_methods_constructors.webinar.statics;

public final class User {
    private String name;
    private int age;

    static String companyName;
    static String description = "Some text";

    static {
        System.out.println("test");
    }



    //example of static method
    static String editCompany()
    {
        if(companyName !=null) companyName = "IBM";
        return companyName;
    }


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    final void change() {
        age = 20;
        //companyName = "Toyota";
    }
}
