package Baslangic;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int distance, age, tripType;
        double totalPrice = 0;
        boolean isError = false;
        System.out.println("Halis Hava Yollarına hoşgeldiniz");
        Scanner scan = new Scanner(System.in);
        System.out.println("Yolculuk etmek istediğiniz mesafeyi giriniz");
        distance = scan.nextInt();
        System.out.println("yaşınızı giriniz");
        age = scan.nextInt();
        System.out.println("Gidiş için\n1\nGidiş ve dönüş için\n2\nseçiniz");
        tripType = scan.nextInt();
        if (tripType==2){
            if ((age>=0)){
                if (age<12){
                    totalPrice = (distance*0.10)*0.50*2*0.80;
                }else if (age>12&&age<=24){
                    totalPrice = (distance*0.10)*0.90*2*0.80;
                }else if (age>65){
                    totalPrice = (distance*0.10)*0.7*2*0.8;
                }



            }else{
                isError = true;


            }
        }else if (tripType==1){
            if ((age>=0)){
                if (age<12){
                    totalPrice = (distance*0.10)*0.5;
                }else if (age>12&&age<=24){
                    totalPrice = (distance*0.10)*0.90;
                }else if (age>65){
                    totalPrice = (distance*0.10)*0.7;
                }



            }else{
                isError = true;


            }
        }else{
            isError = true;
        }
        if (isError){
            System.out.println("Hatalı veri girdiniz tekrar deneyiniz");
        }else System.out.println("Ödemeniz gerek tutar : "+totalPrice+" Bizi seçtiğiniz için teşekkür ederiz");
        System.out.println("Halis hava Yolları!!! Uçuşta bir marka");

    }
}
