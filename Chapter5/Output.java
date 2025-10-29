
class Output {

    public static void main(String[] args) {
        Output output = new Output();
        output.go();
    }

    void go() {
        int value = 7; // 8 9 10 11 13 15 
        for (int i = 1; i < 8; i++) { // i = 1 2 3 4 5 6 
            value++;
            if (i > 4) {
                System.out.print(++value + " ");
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}
