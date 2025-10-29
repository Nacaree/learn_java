
public class HeapQuiz {

    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x = x + 1;
            /*
              hq[0] = 0
              hq[1] = 1
              hq[2] = 2
             */
        }
        hq[3] = hq[1]; // h3 = 1 
        hq[4] = hq[1]; // h4 =  1
        hq[3] = null; // h3 = null
        hq[4] = hq[0]; // h4 = 0
        hq[0] = hq[3]; //  h0 = null
        hq[3] = hq[2]; //  h3 = 2
        hq[2] = hq[0]; // h2 = null 
        // do stuff
        System.out.println(hq[0]);  // null 
        System.out.println(hq[1].id); // id = 1
        System.out.println(hq[2]); // null 
        System.out.println(hq[3].id); // id = 2
        System.out.println(hq[4].id); // id = 0

        /*
        * hq[0] = null
        * hq[1] = id = 1
        * hq[2] = null
        * hq[3] = id = 2
        * hq[4] = id = 0
         */
    }
}
