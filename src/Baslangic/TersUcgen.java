package Baslangic;

public class TersUcgen {
    public static void main(String[] args) {
        int sembol = 10;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <sembol ; j++) {
                System.out.print("*");
            }
            System.out.println("");
            sembol--;
        }
    }

}
