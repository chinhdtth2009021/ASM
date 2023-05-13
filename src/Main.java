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
            System.out.println("Mời bạn nhập lựa chọn :");
            System.out.println("---------------------------------");
            System.out.println("1 :Thêm chuồng ");
            System.out.println("2 :Xóa chuồng ");
            System.out.println("3 :Thêm con Tiger vào chuồng");
            System.out.println("4 :Thêm con Dog vào chuồng ");
            System.out.println("5 :Thêm con Cat vào chuồng");
            System.out.println("6 :Xóa con vật");
            System.out.println("7 :Xem tất cả con vật");
            System.out.println("8 :Thoát chương trình");
            System.out.println("-------------------------------");
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("Thêm một mã chuồng ");
                    zoo.addchuong();
                    break;
                case 2:
                    System.out.println("Nhập mã chuồng muốn xóa ");
                    zoo.removechuong();
                    break;
                case 3:
                    System.out.println("Thêm con Tiger vào chuồng ");
                    zoo.addtiger();
                    break;
                case 4:
                    System.out.println("Thêm con Dog vào chuồng ");
                    zoo.addog();
                    break;
                case 5:
                    System.out.println("Thêm con Cat vào chuồng ");
                    zoo.addcat();
                    break;
                case 6:
                    System.out.println("Xóa con vật theo loại và theo tên");
                    zoo.remove();
                    break;
                default:
                    break;
                case 7 :
                    System.out.println("Điểm danh số thú ");
                    zoo.diemdanhsothu();
                    break;
                case 8:
                    System.out.println("Tạm biệt ");
            }
        }while (chose!= 8);
    }
}
