public class Cylinder2 {

    int radius;
    int height;
    String color;
    Cylinder2(int radius, int height){
        this.radius = radius;
        this.height = height;
        this.color = "Red";
    }
    static void printArea(Cylinder c){
    // To-do: complete the code lines here
        double area=2 * 22/7 * c.radius * ( c.radius + c.height);
        System.out .println("Area= " + area);
    }
    static void printVolume(Cylinder c){
    // To-do: complete the code lines here
        double volume = 22/7 * (c.radius * c.radius) * c.height;
        System.out .println("Volume= " + volume);
    }
    void setColor(String color){
        this.color = color;
    }
    void printColor(){
        System.out .println(color);
    }
}

