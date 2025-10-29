
public class arrayDog {

    public static void main(String[] args) {
        Dog[] pets;
        pets = new Dog[7];

        pets[0] = new Dog();
        pets[1] = new Dog();

        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);
        int y = pets[1].getSize();

        System.out.println(y);
        System.out.println(x);
    }
}

class Dog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int Asize) {
        size = Asize;
    }
}
