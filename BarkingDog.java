public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // if (hourOfDay < 0 || hourOfDay > 23) {
        //     return false; // validation condition
        // }

        // return (barking && (hourOfDay < 8 || hourOfDay > 22)); // test condition
        return (hourOfDay >=0 && hourOfDay <= 23) && (barking && (hourOfDay < 8 || hourOfDay > 22));
        // combined validation and test condition
    }
}

/*
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return (barking && hourOfDay >=0 && hourOfDay<8 || hourOfDay==23);
    }
}*/
