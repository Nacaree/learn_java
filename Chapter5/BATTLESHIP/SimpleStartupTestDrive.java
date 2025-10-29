
public class SimpleStartupTestDrive {

    public static void main(String[] args) {

        SimpleStartup dot = new SimpleStartup();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        int userGuess = 4;
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }

}

class SimpleStartup {

    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "miss";
        for (int cell : locationCells) { // for each element in array locationsCells 
            if (guess == cell) {        // assign it to int cell
                result = "hit";
                numOfHits++;
                break;
            }
        } // end for
        if (numOfHits == locationCells.length) {
            result = "kill";
        } // end if
        System.out.println(result);
        return result;
    }
}
