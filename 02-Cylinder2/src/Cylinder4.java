public class Cylinder4 {

    int radius;
    int height;
    String color;

    Cylinder4(int radius, int height){
        this.radius = radius;
        this.height = height;
        this.color = "Red";
    }
    public void update(int radius, int height){
        // To-do: Change the radius and height
        this.radius = radius;
        this.height = height;

    }
    static void printArea(Cylinder4 cylinder){
        // To-do: Complete the code lines here
        double area = 2 * 22/7 * cylinder.radius * ( cylinder.radius + cylinder.height);
        System.out .println("Area= " + area);
    }
    static void printVolume(Cylinder4 cylinder){
        // To-do: Complete the code lines here
        double volume = 22/7 * (cylinder.radius * cylinder.radius) * cylinder.height;
        System.out .println("Volume= " + volume);
    }
    void setColor(String color){
        this.color = color;
    }
    void printColor(){
        System.out .println(color);
    }
}

