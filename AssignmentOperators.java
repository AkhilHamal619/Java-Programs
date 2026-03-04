//javaOperators

public class AssignmentOperators
 {
    static int a = 10;  // static variable

    public static void main(String[] args) {
        System.out.println("a = " + a);

        a += 5;
        System.out.println("a += 5 → " + a);

        a -= 3;
        System.out.println("a -= 3 → " + a);

        a *= 2;
        System.out.println("a *= 2 → " + a);

        a /= 4;
        System.out.println("a /= 4 → " + a);

        a %= 3;
        System.out.println("a %= 3 → " + a);
    }
}