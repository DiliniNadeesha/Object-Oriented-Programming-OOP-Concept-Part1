public class CylinderDemo {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(5,10);
        // To do: print c1's volume here
        Cylinder.printVolume(c1.radius,c1.height);

        // To do: print the c1's area here
        Cylinder.printArea(c1.radius,c1.height);

        System.out.println("---------------------------------");

        Cylinder c2 = new Cylinder(10,20);
        // To do: print c2's volume here
        Cylinder.printVolume(c2.radius,c2.height);
        // To do: print the c2's area here
        Cylinder.printArea(c2.radius,c2.height);
    }
}


