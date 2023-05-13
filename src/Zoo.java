import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    private List<Chuong> chuongs = new ArrayList<>();


    public Zoo() {

    }

    public void addchuong() { // theem chuoongf mowis
        Chuong chuong = new Chuong();
        chuong.nhapmachuong();
        chuongs.add(chuong);
    }

    public void removechuong() { // xoas chuong
        Scanner scanner = new Scanner(System.in);
        String machuong = scanner.nextLine();
        Iterator<Chuong> iter = chuongs.iterator();
        int in = 0;
        while (iter.hasNext()) {
            Chuong chuong = iter.next();
            if (chuong.getMaChuong().contains(machuong)) {
                iter.remove();
                System.out.println("Xóa chuồng có mã  : " + machuong);
                in++;
            }
        }
        if (in == 0) {
            System.out.println("Không thể tìm thấy chuồng : ");
        }
    }

    public void addtiger() {
        System.out.print("Nhập tên chuồng để thêm Tiger: ");
        Scanner scanner = new Scanner(System.in);
        int timchuong=0;
        String maChuong = scanner.nextLine();
        for (Chuong c : this.chuongs) {
            if (c.getMaChuong().equals(maChuong)) {
                Tiger tiger = new Tiger();
                tiger.input();
                timchuong++;
                c.addanimal(tiger);
                System.out.println("Đã thêm Tiger vào chuồng có mã " + maChuong);
                break;
            }
        }
        if (timchuong==0){
            System.out.println("không tìm thấy mã chuồng");
        }
    }

    public void addog() {
        System.out.print("Nhập tên chuồng để thêm Dog: ");
        Scanner scanner1 = new Scanner(System.in);
        int timchuong=0;
        String ma = scanner1.nextLine();
        for (Chuong c : this.chuongs) {
            if (c.getMaChuong().equals(ma)) {
                Dog dog = new Dog();
                dog.input();
                timchuong++;
                c.addanimal(dog);
                System.out.println("Đã thêm Dog vào chuồng có mã " + ma);
                break;
            }
        }
        if (timchuong==0){
            System.out.println("không tìm thấy mã chuồng");
        }
    }

    public void addcat() {
        System.out.print("Nhập tên chuồng để thêm Cat: ");
        Scanner scanner1 = new Scanner(System.in);
        int timchuong=0;
        String ma = scanner1.nextLine();
        for (Chuong c : this.chuongs) {
            if (c.getMaChuong().equals(ma)) {
                timchuong++;
                Cat dog = new Cat();
                dog.input();
                c.addanimal(dog);
                System.out.println("Đã thêm Cat vào chuồng có mã " + ma);
                break;
            }
        }
        if (timchuong==0){
            System.out.println("không tìm thấy mã chuồng");
        }
    }

    //    public void remove() {
//        System.out.println("Nhập mã chuồng muốn xóa : ");
//        Scanner scanner = new Scanner(System.in);
//        String ma = scanner.nextLine();
//        int timchuong = 0;
//        for (Chuong chuong : chuongs
//        ) {
//            if (ma.equals(chuong.getMaChuong())) {
//                timchuong++;
//                String loai;
//                do {
//                    System.out.println("Nhập vào loại vật (tiger,dog,cat)");
//                    loai = scanner.nextLine();
//                    if (!loai.equals("tiger") && !loai.equals("cat") && !loai.equals("dog")) {
//                        System.out.println("Nhập loại không chính xác : ");
//                    }
//                } while (!loai.equals("tiger") && !loai.equals("cat") && !loai.equals("dog"));
//                System.out.println("Nhập vào tên con vật : ");
//                String ten = scanner.nextLine();
//                if (loai.equals("cat")) {
//                    for (Animal a : chuong.getAnimals()
//                    ) {
//                        if (a instanceof Cat && a.getTen().equals(ten)) {
//                            chuong.delete(ten);
//                        }
//                    }
//                } else if (loai.equals("tiger")) {
//                    for (Animal a : chuong.getAnimals()
//                    ) {
//                        if (a instanceof Tiger && a.getTen().equals(ten)) {
//                            chuong.delete(ten);
//                        }
//                    }
//                } else if (loai.equals("dog")) {
//                    for (Animal a : chuong.getAnimals()
//                    ) {
//                        if (a instanceof Dog && a.getTen().equals(ten)) {
//                            chuong.delete(ten);
//                        }
//                    }
//                }
//                break;
//            }
//        }
//        if (timchuong == 0) {
//            System.out.println("Không thể tìm thấy chuồng : ");
//        }
//    }
    public void remove() {
        System.out.println("Nhập mã chuồng muốn xóa: ");
        Scanner scanner = new Scanner(System.in);
        String ma = scanner.nextLine();
        int timchuong = 0;
        int timconvat =0;
        for (Iterator<Chuong> iterator = chuongs.iterator(); iterator.hasNext(); ) {
            Chuong chuong = iterator.next();
            if (ma.equals(chuong.getMaChuong())) {
                timchuong++;
                String loai;
                do {
                    System.out.println("Nhập vào loại vật (tiger, dog, cat): ");
                    loai = scanner.nextLine();
                    if (!loai.equals("tiger") && !loai.equals("cat") && !loai.equals("dog")) {
                        System.out.println("Nhập loại không chính xác!");
                    }
                } while (!loai.equals("tiger") && !loai.equals("cat") && !loai.equals("dog"));

                System.out.println("Nhập vào tên con vật: ");
                String ten = scanner.nextLine();

                if (loai.equals("cat")) {
                    Iterator<Animal> animalIterator = chuong.getAnimals().iterator();
                    while (animalIterator.hasNext()) {
                        Animal animal = animalIterator.next();
                        if (animal instanceof Cat && animal.getTen().equals(ten)) {
                            animalIterator.remove();
                            System.out.println("Xóa thành công ");
                            timconvat++;
                        }
                    }
                } else if (loai.equals("tiger")) {
                    Iterator<Animal> animalIterator = chuong.getAnimals().iterator();
                    while (animalIterator.hasNext()) {
                        Animal animal = animalIterator.next();
                        if (animal instanceof Tiger && animal.getTen().equals(ten)) {
                            animalIterator.remove();
                            System.out.println("Xóa thành công ");
                            timconvat++;
                        }
                    }
                } else if (loai.equals("dog")) {
                    Iterator<Animal> animalIterator = chuong.getAnimals().iterator();
                    while (animalIterator.hasNext()) {
                        Animal animal = animalIterator.next();
                        if (animal instanceof Dog && animal.getTen().equals(ten)) {
                            animalIterator.remove();
                            System.out.println("Xóa thành công ");
                            timconvat++;
                        }
                    }
                }

            }
        }
        if (timchuong == 0) {
            System.out.println("Không thể tìm thấy chuồng!");
        }
        if (timconvat ==0){
            System.out.println("không tìm thấy con vật xóa không thành công");
        }
    }

    public void diemdanhsothu() {
        for (Chuong chuong : chuongs
        ) {
            System.out.println("Mã chuồng số  : " + chuong.getMaChuong());
            chuong.diemdanhchuong();
        }
    }
}
