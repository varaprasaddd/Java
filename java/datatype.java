/*
public class datatype {
    public static void main(String[] args) {
        System.out.println("Hello from datatype class!");
    }
}

// PrimitiveTypes.java
public class datatype {
    public static void main(String[] args) {
        byte b = 10;
        short s = 200;
        int i = 3000;
        long l = 40000L;
        float f = 5.5f;
        double d = 123.456;
        char c = 'J';
        boolean flag = true;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + flag);
    }
}
    */

// File: ReferenceTypes.java
public class datatype {
    public static void main(String[] args) {
        String str = "Java Reference Type";
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

