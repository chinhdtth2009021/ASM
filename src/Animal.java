import java.util.Scanner;

public abstract class Animal {
    private String ten;
    private int tuoi;
    private String mota;

    public Animal(String ten) {
        this.ten = ten;
    }

    public Animal(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public Animal(String ten, int tuoi, String mota) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.mota = mota;
    }

    public Animal() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    public abstract String tiengkeu();
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên con vật : " );
        this.ten = scanner.nextLine();
        System.out.println("Nhập mô tả : ");
        this.mota = scanner.nextLine();
        do {
            try {
                System.out.println("Nhập vào tuổi : ");
                this.tuoi = scanner.nextInt();
                if (this.tuoi<=0 ){
                    System.out.println("Nhập không chính xác mời nhập lại : ");
                }
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Nhập vào định dạng không phải số : ");
            }
        }while (this.tuoi <=0);
    }
    public abstract String eat();
    public abstract String descript();
}
