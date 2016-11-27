package src.m5equalshashcode.practice.Zadacha4_1;

/**
 * Created by Стрела on 12.09.2016.
 */
public class Triangle extends View {
    private boolean isShowing = false;
    @Override
    public void show() {
        if(isShowing){
            System.out.println("Sorry, this triangle is showing");
             // або з return або з else
        } else {
            System.out.println("showing triangle");
            isShowing = true;
        }
    }

    @Override
    public void hide() {
        if (!isShowing){
            System.out.println("Sorry, this triangle is not showing now");
        }else {
            System.out.println("hiding triangle");
            isShowing = false;
        }
    }
    public boolean isShowing(){
        System.out.println("Triangle is " + (isShowing ?"showing":"not showing"));
return isShowing;
    }
}
