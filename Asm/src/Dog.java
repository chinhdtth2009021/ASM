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
        return "nhau...nhau...nhau...nhau...";
    }
    @Override
    public String eat() {
        return "nó ăn cơm chó";
    }

    @Override
    public String descript() {
        return "thích sủa nhau nhau, nằm ở góc nhà";
    }
}
