package poly.ex5;

public class Cat implements InterfaeceAnimal{
    @Override
    public void move() {
        System.out.println("고양이 이동");
    }

    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}
