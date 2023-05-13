public class Tiger extends Animal{
    public Tiger(String ten) {
        super(ten);
    }

    public Tiger(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public Tiger(String ten, int tuoi, String mota) {
        super(ten, tuoi, mota);
    }

    public Tiger() {
    }

    @Override
    public String tiengkeu() {
        return "gào...gào...gào...";
    }
    @Override
    public void input(){
        super.input();
    }
    @Override
    public String eat() {
        return "ăn thịt";
    }
    @Override
    public String descript() {
        return "con hổ sống trong rừng, ăn no là thích đuổi ong bắt bướm....";
    }
}
