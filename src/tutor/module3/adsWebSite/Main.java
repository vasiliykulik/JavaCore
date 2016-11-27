package src.tutor.module3.adsWebSite;

public class Main {

    public static void main(String[] args) {
        //
        //User user1 = new User("Jack", "Kop", );
User user1= new User("Vasya","Software Engineer");
CarAd newcar =new CarAd();
        newcar.setCarType("red");
        System.out.println(newcar.getCarType());
        System.out.println(user1.getFirstName());
    }

}
