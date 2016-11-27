package src.m2basetypes.selfedu2basetypes;

/**
 * Created by Стрела on 21.08.2016.
 */
public class Division {
    public static void main(String[] args) {
        int q=21; // если объявить int то результат будет 2.0
        int w=8;
        int result = q/w;
        int resultModule = q%w;
        System.out.println(q+" / "+w+" = "+result+" и "+resultModule+" в остатке" );
    }
}
