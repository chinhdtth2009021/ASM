public class Cat extends Animal{

    public Cat(String ten) {
        super(ten);
    }

    public Cat(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Cat(String ten, int tuoi, String mota) {
        super(ten, tuoi, mota);
    }

    public Cat() {
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public String tiengkeu() {
        return "meo....meo...meo....";
    }
    @Override
    public String eat() {
        return "ăn cá";
    }

    @Override
    public String descript() {
        return "Nuôi mèo tốn lắm ";
    }
}
