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
                System.out.println("xoa chuong co ma : " + machuong);
                in++;
            }
        }
        if (in == 0) {
            System.out.println("khong the tim thay ma chuong");
        }
    }

    public void addtiger() {
        System.out.print("Nhập tên chuồng để thêm Tiger: ");
        Scanner scanner = new Scanner(System.in);

        String maChuong = scanner.nextLine();
        for (Chuong c : this.chuongs) {
            if (c.getMaChuong().equals(maChuong)) {
                Tiger tiger = new Tiger();
                tiger.input();
                c.addanimal(tiger);
                System.out.println("Đã thêm Tiger vào chuồng có mã " + maChuong);
                break;
            }
        }
    }
        public void addog() {
            System.out.print("Nhập tên chuồng để thêm Dog: ");
            Scanner scanner1 = new Scanner(System.in);

            String ma = scanner1.nextLine();
            for (Chuong c : this.chuongs) {
                if (c.getMaChuong().equals(ma)) {
                    Dog dog = new Dog();
                    dog.input();
                    c.addanimal(dog);
                    System.out.println("Đã thêm Dog vào chuồng có mã " + ma);
                    break;
                }
            }
        }
            public void addcat() {
                System.out.print("Nhập tên chuồng để thêm Cat: ");
                Scanner scanner1 = new Scanner(System.in);

                String ma = scanner1.nextLine();
                for (Chuong c : this.chuongs) {
                    if (c.getMaChuong().equals(ma)) {
                        Cat dog = new Cat();
                        dog.input();
                        c.addanimal(dog);
                        System.out.println("Đã thêm Cat vào chuồng có mã " + ma);
                        break;
                    }
                }
            }
            public void remove(){
                System.out.println("nhap ma chuong");
                Scanner scanner = new Scanner(System.in);
                String ma = scanner.nextLine();
                int timchuong=0;
                for (Chuong chuong: chuongs
                ) {
                    if (ma.equals(chuong.getMaChuong())){
                        timchuong ++;
                        String loai;
                        do {
                            System.out.println("nhap vao loai con vat (tiger,dog,cat)");
                             loai = scanner.nextLine();
                             if (!loai.equals("tiger")&&!loai.equals("cat")&&!loai.equals("dog")){
                                 System.out.println("nhap loai khong chinh xac");
                             }
                        }while (!loai.equals("tiger")&&!loai.equals("cat")&&!loai.equals("dog"));
                        System.out.println("nhap vao ten con vat");
                        String ten = scanner.nextLine();
                        if (loai.equals("cat")){
                            for (Animal a:chuong.getAnimals()
                                 ) {
                                if (a instanceof Cat && a.getTen().equals(ten)){
                                    chuong.delete(ten);
                                }
                            }
                        }else if (loai.equals("tiger")){
                            for (Animal a:chuong.getAnimals()
                            ) {
                                if (a instanceof Tiger && a.getTen().equals(ten)){
                                    chuong.delete(ten);
                                }
                            }
                        }else if (loai.equals("dog")){
                            for (Animal a:chuong.getAnimals()
                            ) {
                                if (a instanceof Dog && a.getTen().equals(ten)){
                                    chuong.delete(ten);
                                }
                            }
                        }
                        break;
                    }
                }
                if (timchuong ==0){
                    System.out.println("khong the tim thay chuong");
                }
            }
//    public void addanimal() {
//
//        int timchuong=0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("moi nhap ma chuong");
//        String machuong = scanner.nextLine();
//        for (Chuong chuong : chuongs) {
//            if (chuong.getMaChuong().contains(machuong)) {
//                int in = 0;
//                System.out.println("moi nhap loai con vat muon them :");
//                System.out.println("1: con ho");
//                System.out.println("2 :con meo");
//                System.out.println("3 :con cho");
//                in = scanner.nextInt();
//                switch (in) {
//                    case 1:
//                        Tiger tiger = new Tiger();
//                        tiger.input();
//                        chuong.addanimal(tiger);
//                        break;
//                    case 2:
//                        Cat cat = new Cat();
//                        cat.input();
//                        chuong.addanimal(cat);
//                        break;
//                    case 3:
//                        Dog dog = new Dog();
//                        dog.input();
//                        chuong.addanimal(dog);
//                        break;
//                }
//                break;
//            }
//        }
//        if (timchuong ==0){
//            System.out.println("khong the tim thay chuong");
//        }
//    }
//
//    public void removeAnimal() {
//        System.out.println("nhap ma chuong");
//        Scanner scanner = new Scanner(System.in);
//        String machuong = scanner.nextLine();
//        System.out.println("nhap vao ten con vat");
//        String ten = scanner.nextLine();
//        int timchuong = 0;
//        for (Chuong chuong : chuongs) {
//            if (chuong.getMaChuong().equals(machuong)) {
//                timchuong++;
//                chuong.delete(ten);
//                break;
//            }
//        }
//        if (timchuong == 0){
//            System.out.println("khong tim thay ma chuong");
//        }
//    }
    public void diemdanhsothu(){
        for (Chuong chuong:chuongs
        ) {
            System.out.println("ma chuong so : " + chuong.getMaChuong());
            chuong.diemdanhchuong();
        }
    }
    }
