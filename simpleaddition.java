// open.kattis.com/problems/simpleaddition
// python3 submit.py simpleaddition.java
import java.util.Scanner;
import java.math.BigInteger;

public class simpleaddition {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());
        BigInteger c = a.add(b);
        System.out.println(c);
    }
}
