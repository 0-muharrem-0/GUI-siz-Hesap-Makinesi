import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sayi1, sayi2, sonuc;
        char operator;

        System.out.print("İlk sayıyı girin: ");
        sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        sayi2 = scanner.nextDouble();

        System.out.print("İşlemi girin (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata! Sıfıra bölme hatası.");
                    return;
                }
                break;
            default:
                System.out.println("Hatalı işlem girişi!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }

}