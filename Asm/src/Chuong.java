import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Chuong {
    private String maChuong;
    private List<Animal> animals = new ArrayList<>();

    public Chuong() {
    }

    public Chuong(String maChuong, List<Animal> animals) {
        this.maChuong = maChuong;
        this.animals = animals;
    }

    public String getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(String maChuong) {
        this.maChuong = maChuong;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
    public void nhapmachuong(){ // theem max chuoongf
        System.out.println("nhap vao ma chuong : ");
        Scanner scanner = new Scanner(System.in);
        this.maChuong = scanner.nextLine();
    }
    public void addanimal(Animal animal){
        animals.add(animal);
    } //theem con vaatj
    public void delete(String ten){ // xoas con vaayj
        Iterator<Animal> iterator = animals.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getTen().equalsIgnoreCase(ten)) {
                iterator.remove(); // xóa phần tử hiện tại bởi iterator
                count++;
            }
        }
        if (count > 0) {
            System.out.println("xoa thanh cong " + ten);
        } else {
            System.out.println("khong the tim thay ten con vat");
        }

    }
    public void diemdanhchuong(){ // danh scahs ddoongj vatj trong chuoongf
        for (Animal animal : animals){
            System.out.println("ten : " + animal.getTen() + "; mo ta : "+ animal.getMota() + "; tuoi : " + animal.getTuoi() + "; keu : "+ animal.tiengkeu()) ;
        }
    }
}
