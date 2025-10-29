
class Dog {

    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff! ");
    }
}

public class DogTestDrive {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.breed = "Husky";
        d.name = "kan";
        d.bark();
        System.out.println(d.size);
        System.out.println(d.breed);
        System.out.println(d.name);
    }
}
