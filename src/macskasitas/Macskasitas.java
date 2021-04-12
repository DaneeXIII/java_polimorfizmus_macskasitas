package macskasitas;

public class Macskasitas {

    public static void main(String[] args) {
            Cat cat1 = new Cat("Sanyi", 45);
            System.out.println(cat1.getName() + " " + cat1.getWeigth() + "kg");
            cat1.makeSound();
    }
}
