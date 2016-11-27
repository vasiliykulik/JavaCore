package src.m5_object_equals_hashcode_class_relationships_uml_kiss_dry_solid_patterns_booking_employee.practice.Zadacha4_1;

import java.util.Arrays;

/**
 * Created by Стрела on 12.09.2016.
 * Може бути две ссылки на один
 * и два объекты в двух местах
 * контракы в спецификации Oracle
 * Alt + Insert b все выделяем
 */
public class ViewHash {
    private int currentIndex = 0;
    private View[] views = new View[10];
    public void addView(View view){
        views[currentIndex]=view;
        currentIndex++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ViewHash)) return false;

        ViewHash viewHash = (ViewHash) o;

        if (currentIndex != viewHash.currentIndex) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(views, viewHash.views);

    }

    @Override
    public int hashCode() {
        int result = currentIndex;
        result = 31 * result + Arrays.hashCode(views);
        return result;
    }
}

/*
public void addView(View view){
        if(views != null){
            int length = views.length;
            View[]tempViews=views;
            views = new View [length+1];

            for (int i=0; i<tempViews.length;i++){
            views[i]=tempViews[i];

        }
    }
 */