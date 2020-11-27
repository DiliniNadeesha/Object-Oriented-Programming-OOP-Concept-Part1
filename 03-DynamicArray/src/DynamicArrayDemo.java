public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();
        da.add(10);
        da.add(20);
        da.add(30);
        da.add(40);
        da.add(50);

        da.printAll();

        int value = da.get(1);
        System.out.println(value);

        da.remove(8);
        da.remove(3);
        da.printAll();
    }

    }
