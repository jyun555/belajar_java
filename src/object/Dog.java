package object;

public class Dog implements Hewan {
    @Override
    public void Makan() {
        System.out.println("Makan Daging");
    }

    @Override
    public String Nama() {
        return "Jun Dog";
    }

    @Override
    public Integer Umur() {
        return 20;
    }
}
