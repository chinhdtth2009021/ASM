public class Dog extends Animal{
    public Dog(String ten) {
        super(ten);
    }

    public Dog(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Dog(String ten, int tuoi, String mota) {
        super(ten, tuoi, mota);
    }

    @Override
    public void input() {
        super.input();
    }

    public Dog() {
    }

    @Override
    public String tiengkeu() {
        return "gâu...gâu...gâu...gâu...";
    }
    @Override
    public String eat() {
        return "nó ăn cơm chó";
    }

    @Override
    public String descript() {
        return "ngày ngủ,đêm thức trông nhà ";
    }
}
