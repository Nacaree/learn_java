
public class valueTest {

    public static void main(String[] args) {
        int x = 7;
        Goo foo = new Goo();
        foo.go(x);
        System.err.println("after method ends " + x);

    }
}

class Goo {

    void go(int z) {
        System.out.println("before change in method " + z);
        z = 0;
        System.out.println("after change in method " + z);
    }

}
