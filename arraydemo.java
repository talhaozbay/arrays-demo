import java.util.Scanner;

public class arraydemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfStudent[] = new String[100];
        String surnameOfStudent[] = new String[100];
        int noteOfStudent[] = new int[100];

        int add = 0;

        while (true) {

            System.out.println("\n\n\n---------Hoşgeldiniz---------");
            System.out.println("[1] Ogrenci Ekleme");
            System.out.println("[2] Ogrenci Listeleme");
            System.out.println("[3] Ogrenci Bulma");
            System.out.println("[4] Ogrenci Silme");
            System.out.print("Sayi giriniz : ");
            int menu = scanner.nextInt();
            // Öğrenci Ekleme
            if (menu == 1) {
                System.out.print("Ogrencinin Adini Giriniz : ");
                nameOfStudent[add] = scanner.next();
                System.out.print("Ogrencinin Soyadini Giriniz : ");
                surnameOfStudent[add] = scanner.next();
                System.out.print("Ogrencinin Ortalamasini Giriniz : ");
                noteOfStudent[add] = scanner.nextInt();
                add++;
            }
            // Öğrenci Listeleme
            else if (menu == 2) {
                if (add == 0) {
                    System.out.println("Henuz Bir Veri tanimlanmamis");
                } else {
                    System.out.println("Tum Ogrenciler");
                    for (int f = 0; f < add; f++) {
                        System.out.println(nameOfStudent[f] + "  " + surnameOfStudent[f] + " :  " + noteOfStudent[f]);
                    }
                }
            }
            // Öğrenci Bulma
            else if (menu == 3) {
                boolean find = false;
                System.out.print("Aramak Istediginiz Ogrencinin Adini Yaziniz : ");
                String search = scanner.next();
                for (int f = 0; f < add; f++) {
                    if (nameOfStudent[f].equals(search)) {
                        System.out.print("Ogrenci Bulundu : ");
                        find = true;
                        System.out.println(nameOfStudent[f] + "  " + surnameOfStudent[f] + " :  " + noteOfStudent[f]);
                    }
                }
                if (find == false) {
                    System.out.println("Ogrenci Bulunamadi.");
                }
            } else if (menu == 4) {
                System.out.print("Silmek Istediginiz Ogrencinin Adini Yaziniz : ");
                String seach = scanner.next();
                for (int f = 0; f < add; f++) {
                    if (nameOfStudent[f].equals(seach)) {
                        while (f <= add) {
                            nameOfStudent[f] = nameOfStudent[f + 1];
                            surnameOfStudent[f] = surnameOfStudent[f + 1];
                            noteOfStudent[f] = noteOfStudent[f + 1];
                            f++;
                        }
                        add--;
                    }
                }
            }
            // Çıkış
            else if (menu == 0) {
                break;
            } else
                System.out.println("Yanlis deger Girdiniz");
        }
    }
}