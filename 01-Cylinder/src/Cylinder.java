public class Cylinder {

    double radius;
    double height;
    String colour;


    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        colour = "Red";

    }

    void printArea(){
        System.out.println("Area = "+2*(22/7)*radius*(radius+height));

    }

    void printVolume() {
        System.out.println("Volume = " + (22 / 7) * radius * radius * height);
    }

    void setColour(String colour){
        this.colour=colour;

    }

    void printColour(){
        System.out.println("Colour = "+colour);
    }
}

