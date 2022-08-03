public class Main {
    public static void main(String[] args) {
        
        int i1 = 10;
        int i2 = 20;
        float f1 = 10.5f;
        float f2 = 20.5f;
        double d1 = 59.9d;
        char c1 = 'a';
        char c2 = 'b';
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello World";
        boolean b1 = true;
        boolean b2 = false;
        
        long l1 = 100L;
        long l2 = 200L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1 != i2: " + (i1 != i2));
        System.out.println("i1 > i2: " + (i1 > i2));
        System.out.println("i1 <= i2: " + (i1 <= i2));

        System.out.println("f1 == f2: " + (f1 == f2));
        System.out.println("f1 != f2: " + (f1 != f2));
        System.out.println("f1 >= f2: " + (f1 >= f2));
        System.out.println("f1 < f2: " + (f1 < f2));

        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 != c2: " + (c1 != c2));
        System.out.println("c1 > c2: " + (c1 > c2));
        System.out.println("c1 <= c2: " + (c1 <= c2));

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 != s2: " + (s1 != s2));
        System.out.println("s1 == s3: " + (s1 == s3));


        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1 != b2: " + (b1 != b2));

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));

        System.out.println("l1 == i2: " + (l1 == i2));
        System.out.println("l2 >= i1: " + (l2 >= i1));
        System.out.println("y1 != h1: " + (y1 != h1));




    }
}