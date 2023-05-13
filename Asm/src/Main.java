import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        Zoo zoo = new Zoo();
        int chose = 0;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("moi ban dua ra lua chon :");
            System.out.println("1:them chuong");
            System.out.println("2 :xoa chuong");
            System.out.println("3 :them con tiger vao chuong");
            System.out.println("4 :them con dog vaof chuong");
            System.out.println("5 :them con cat vaof chuong");
            System.out.println("6 :xoa con vat");
            System.out.println("7 :xem tat ca con vat");
            System.out.println("8 :thoat chuog trinh");
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("them vao 1 chuong");
                    zoo.addchuong();
                    break;
                case 2:
                    System.out.println("xoa chuong theo ma chuong");
                    zoo.removechuong();
                    break;
                case 3:
                    System.out.println("them con tiger vao chuong");
                    zoo.addtiger();
                    break;
                case 4:
                    System.out.println("them con dog vao chuong ");
                    zoo.addog();
                    break;
                case 5:
                    System.out.println("them co cat vao chuong ");
                    zoo.addcat();
                    break;
                case 6:
                    System.out.println("xoa con vat theo loai va theo ten");
                    zoo.remove();
                    break;
                default:
                    break;
                case 7 :
                    System.out.println("diem danh so thu");
                    zoo.diemdanhsothu();
                    break;
                case 8:
                    System.out.println("bye bye");
            }
        }while (chose!= 8);
    }
}
