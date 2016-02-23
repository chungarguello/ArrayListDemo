package p3;

import java.util.ArrayList;

/*
 * Created by carguell on 2/23/2016.
 */
public class Main {
    public static void main(String[] args){
        ArrayList<balloon> list = new ArrayList<>();

        balloon b1 = new balloon("yellow", 10);
        balloon b2 = new balloon("blue", 14);

        list.add(b1);
        list.add(b2);

        System.out.println("number of balloons = " + list.size());
        list.forEach(System.out::println);
        
        boolean isFound = false;
        String searchColor = "red";
        int searchDiameter = 10;
        for ( balloon each : list)
            if (each.color.equals(searchColor) && each.diameter == searchDiameter)
                isFound = true;

        System.out.printf("%s %d %b %n", searchColor, searchDiameter, isFound);
    }
}

class balloon {
    String color;
    int diameter;

    balloon(String c, int d){
        color = c;
        diameter = d;
    }

    @Override
    public String toString() {
        return "balloon{" +
                "color='" + color + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
