package Module_4_Advanced_Java_Concepts;
public class GarbageCollection {
    public static void main(String[] args) {
        GarbageCollection obj1 = new GarbageCollection();
        obj1 = null;

        System.gc();
        System.out.println("Garbage Collection Requested");
    }


    public void finalize() {
        System.out.println("Garbage Collected");
    }
}

