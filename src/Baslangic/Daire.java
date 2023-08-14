package Baslangic;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner halis = new Scanner(System.in);
        System.out.print("yarıcap?");
        r = halis.nextInt();
        double cevre = 2*pi*r;
        double alan = pi*r*r;
        System.out.println("dairenin cevresi : "+cevre+" dairenin alani : "+alan);
    }
}
