import object.Cat;
import object.UserAnimal.CatUser;
import object.Dog;

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}

public class Main {
    protected void sayHelloFromMainClass(){
        System.out.println("Hello From Class Main");
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.sayHelloFromMainClass();
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.printf("Animal : Cat\nName : %s\nAge : %d\n", cat.Nama(), cat.Umur());
        cat.Makan();
        cat.Run();
        System.out.printf("Animal : Dog\nName : %s\nAge : %d\n", dog.Nama(), dog.Umur());
        dog.Makan();
        String user = "Rayyy";
        Size sz = Size.LARGE;
        System.out.printf("Size From UserName : %s is %s", user, sz);
    }
}