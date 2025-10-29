
import java.util.ArrayList;

public class StartupTestDrive {

    public static void main(String[] args) {

        /*    Startup dot = new Startup();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        int userGuess = 4;
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult); */
    }

}

class Startup {

    private ArrayList<String> locationCells;
    // private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) { // if index is greater than or equal to 0, remove it 
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";

            } else {
                result = "hit";
            }
        }
        return result;
    }
}




