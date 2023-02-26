package Gun05;


import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdırınız.
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter Your Name=");
        String name=scan.next();// next() -> kelime okumak için

        System.out.println("name = " + name);
    }
}
