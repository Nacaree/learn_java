public class VetTest {
    void main() {
        PetOwner owner = new PetOwner();
        owner.Start();
    }
}

class Vet {
    public void giveShot(Animal a) {
        // do things to animal
        a.makeNoise();
    }
}

class PetOwner {
    public void Start() {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();
        vet.giveShot(dog);
        vet.giveShot(hippo);
    }

}
