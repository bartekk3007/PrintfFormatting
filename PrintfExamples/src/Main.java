import java.util.Date;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        double liczba = 1234.567;
        System.out.printf("%-8g\n", liczba);

        int duzaLiczba = -12345;
        System.out.printf("%,8d\n", duzaLiczba);

        Random random = new Random();
        int losowaLiczba = random.nextInt(10000);
        System.out.printf("Octal - %1$o, Decimal - %1$d, Hexadecimal - %1$X\n", losowaLiczba);
        System.out.printf("%d == %<d\n", losowaLiczba);

        System.out.printf("%Tc\n", new Date());
    }
}