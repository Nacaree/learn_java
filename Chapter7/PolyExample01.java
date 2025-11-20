class Animal {
    public void eat() {
        System.out.println("Eating...");
    }

    public void roam() {
        System.out.println("roaming...");
    }

    public void makeNoise() {
        System.out.println("OUch.....");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void roam() {
        System.out.println("Dog is roaming...");
    }
}

class Wolf extends Animal {
    @Override
    public void eat() {
        System.out.println("Wolf is eating...");
    }

    @Override
    public void roam() {
        System.out.println("Wolf is roaming...");
    }
}

class Hippo extends Animal {
    @Override
    public void eat() {
        System.out.println("Hippo is eating...");
    }

    @Override
    public void roam() {
        System.out.println("Hippo is roaming...");
    }
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion is eating...");
    }

    @Override
    public void roam() {
        System.out.println("Lion is roaming...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void roam() {
        System.out.println("Cat is roaming...");
    }
}

public class PolyExample01 {
    void main() {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();

        for (Animal animal : animals) {
            animal.eat();
            animal.roam();
        }
    }
}