
package Baslangic;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz");
        heat = scan.nextInt();
        if (heat<5){
            System.out.println("kayak yapmaya gidebilirisn");
        }else if (heat<=25){
            if (heat<=15){
                System.out.println("sinemaya gidebilirsin");
            }
            if (heat>=10){
                System.out.println("pikniğe gidebilirsin");
            }
        }else{
            System.out.println("yüzmeye gidebilirsin");
        }
    }
}
