package object;

public class Cat implements Hewan {
    public void Run(){
        System.out.println("Run so Fast");
    }
    @Override
    public void Makan() {
        System.out.println("Makan Ikan");
    }
    @Override
    public String Nama(){
        return "Miaw";
    }

    @Override
    public Integer Umur(){
        return 20;
    }
}
