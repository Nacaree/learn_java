
@SuppressWarnings("unused")
public class Doctor {
    boolean worksAtHospital;

    void treatPatient() {
        // perform checkup
    }
}

@SuppressWarnings("unused")
public class FamilyDoctor extends Doctor {
    boolean makesHouseCalls;

    @SuppressWarnings("unused")
    void giveAdvice() {
        // gives homespun advice
    }
}

public class Surgeon extends Doctor {
    @Override
    void treatPatient() {
        // perform surgery
    }

    @SuppressWarnings("unused")
    void makeIncision() {
        // make incision
    }
}
