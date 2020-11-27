import java.util.Scanner;

public class CylinderDemo {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(4,3);
        c1.printArea();
        c1.printVolume();
        c1.printColour();

        c1.setColour("Green");
        c1.printColour();

        System.out.println("----------------------------");

        Cylinder c2 = new Cylinder(2,3);
        c2.printColour();

        c2.setColour("Yellow");
        c2.printColour();
    }
}
