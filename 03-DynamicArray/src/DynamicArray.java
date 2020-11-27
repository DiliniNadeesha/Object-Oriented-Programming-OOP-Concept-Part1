import java.util.Arrays;

public class DynamicArray {

    int[] values;

    DynamicArray() {values = new int[0];}

    void add(int value){

        int[] temepValues = new int[values.length + 1];
        for (int i = 0; i < values.length ; i++) {
            temepValues[i] = values[i];
        }
        temepValues[temepValues.length-1] = value;
        values = temepValues;
    }

    int get(int index){

        int value = 0;
        for (int i = 0; i < values.length; i++) {
            if (i == index){
                value = values[i];
                break;
            }
            if (i == values.length){
                System.out.println("Invalid index");
                break;
            }
        }
        return value;
    }

    void remove(int index){

        int[] temepValues = new int[values.length - 1];
        for (int i = 0; i < temepValues.length ; i++) {
            if (index > values.length - 1){
                System.out.println("Invalid index");
                break;
            }

            System.out.println(values[i]);
            if (i >= index){
                temepValues[i] = values[i+1];
            }else {
                temepValues[i] = values[i];
            }
        }
    }

    void printAll(){

        System.out.println(Arrays.toString(values));
    }

    public int getSize() {

        return 0;
    }
}
