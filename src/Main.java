import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String prices = "Armut : 2.14\n"
        +"Elma : 3.67\n"
        +"Domates : 1.11\n"
        +"Muz : 0.95\n"
        +"Patlican : 5.0";

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        System.out.print("Kac Kilo Armut almak istiyorsunuz : ");
        armutKg = sc.nextDouble();

        System.out.print("Kac Kilo Elma almak istiyorsunuz : ");
        elmaKg = sc.nextDouble();

        System.out.print("Kac Kilo Domates almak istiyorsunuz : ");
        domatesKg = sc.nextDouble();

        System.out.print("Kac Kilo Muz almak istiyorsunuz : ");
        muzKg = sc.nextDouble();

        System.out.print("Kac Kilo Patlican almak istiyorsunuz : ");
        patlicanKg = sc.nextDouble();

        double result = ((armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg));
        
        System.out.println("Hesap : " + result);
    }
}
