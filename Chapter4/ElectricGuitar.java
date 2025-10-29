
class ElectricGuitar {

    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    public static void main(String[] args) {
        ElectricGuitar NewElectricGuitar = new ElectricGuitar();
        NewElectricGuitar.brand = "sony";
        NewElectricGuitar.numOfPickups = 2;
        NewElectricGuitar.rockStarUsesIt = true;

        
        // System.out.println(NewElectricGuitar.brand);
        NewElectricGuitar.setBrand("misubitshi");
        NewElectricGuitar.getBrand();
        System.out.println(NewElectricGuitar.brand);
        
        System.out.println(NewElectricGuitar.numOfPickups);
        NewElectricGuitar.setNumOfPickups(4);
        NewElectricGuitar.getNumOfPickups();
        System.out.println(NewElectricGuitar.numOfPickups);
        
        System.err.println(NewElectricGuitar.rockStarUsesIt);
        NewElectricGuitar.setRockStarUsesIt(false);
        NewElectricGuitar.getRockStarUsesIt();
        System.err.println(NewElectricGuitar.rockStarUsesIt);

    }

    String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
