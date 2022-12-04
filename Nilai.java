/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author MOKLET GAMING
 */
public class Nilai {
    public static void satu(int one) {
        if(one<=60){
            System.out.println("Nilai pertama = "+ one + "Nilai anda Kurang");
        }else if(one > 60 && one <=70){
            System.out.println("Nilai pertama ="+ one + "Nilai anda Cukup");
        }else if (one >70 && one <= 80){
            System.out.println("Nilai pertama = " + one + "Nilai anda Baik");
        }else if (one > 80){
            System.out.println("Nilai pertama = " + one + "Nilai anda luar biasa");
        }
    }
    public static void dua(int two) {
        if(two <=60){
            System.out.println("Nilai pertama = " + two + " Nilai anda Kurang");
        }else if (two > 60 && two <=70){
            System.out.println("Nilai pertama = " + two + "Nilai anda Cukup");
        }else if (two > 70 && two <=80){
            System.out.println("Nilai pertama = " + two +" Nilai anda Baik");
        }else if (two > 80){
            System.out.println("Nilai pertama = " + two + "Nilai anda Luar Biasa");
        }
    }
    public static void tiga(int three) {
        if(three <=60){
            System.out.println("Nilai pertama = " + three + " Nilai anda Kurang");
        }else if (three > 60 && three <=70){
            System.out.println("Nilai pertama = " + three + "Nilai anda Cukup");
        }else if (three >70 && three <= 80){
            System.out.println("Nilai pertama = " + three + "Nilai anda Baik");
        }else if (three>80){
            System.out.println("Bilai pertama = " + three + "Nilai anda Luar Biasa");
        }
    }
    public static void empat(int four) {
        if (four <=60){
            System.out.println("Nilai pertama = " + four + "Nilai anda Kurang");
    }else if (four > 60 && four <= 70){
            System.out.println("Nilai pertama = " + four + " Nilai anda Cukup");
}else if (four > 70 && four <=80){
            System.out.println("Nilai pertama = " + four + " Nilai anda Baik");
}else if (four > 80){
            System.out.println("Nilai pertama = " + four + " Nilai anda Luar Biasa");
}
}
    public static void lima(int five) {
        if (five <=60){
            System.out.println("Nilai pertama = " + five + " Nilai anda Kurang");
        }else if (five > 60 && five <=70){
            System.out.println("Nilai pertama = " + five + " Nilai anda Cukup");
        }else if (five >70 && five <=80){
            System.out.println("Nilai pertama = " + five + "Nilai anda Baik");
        }else if (five >80){
            System.out.println("Nilai pertama = " + five + "Nilai anda Luar Biasa");
        }
    }
    public static void total(double total) {
        if (total <=60){
            System.out.println("Nilai Rata Rata = " + total + "Nilai anda Kurang");
        }else if (total > 60 && total <=70){
            System.out.println("Nilai Rata Rata = " + total + " Nilai anda Cukup");
        }else if (total > 70 && total <= 80){
        System.out.println("Nilai Rata Rata = " + total + "Nilai anda Baik");
    }else if (total > 80){
            System.out.println("Nilai Rata Rata = " + total + "Nilai anda Luar Biasa");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
 int one, two, three, four, five;
 int angka;
 String ulang;
 do{
     System.out.println("================================");
     System.out.println("Input angka ke-1 = ");
     one = in.nextInt();
     satu(one);
     System.out.println("----------------------------------");
     System.out.println("input angka ke-2 = ");
     two = in.nextInt();
     dua(two);
     System.out.println("-----------------------------------");
     System.out.println("Input angka ke-3 = ");
     three = in.nextInt();
     tiga(three);
     System.out.println("------------------------------------");
     System.out.println("Input angka ke-4 = ");
     four = in.nextInt();
     empat(four);
     System.out.println("-------------------------------------");
     System.out.println("Input angka ke-5 = ");
     five = in.nextInt();
     lima(five);
     System.out.println("======================================");
     
     System.out.println("NILAI RATA RATA");
     double total = one + two + three + four + five;
     System.out.println("Total = " + total);
     total /= 5;
     total(total);
     System.out.println("========================================");
     System.out.println("Apakah anda mau mengulang (y/n)");
     ulang = in.next();
 }while (ulang.equalsIgnoreCase("y"));
    }
}
