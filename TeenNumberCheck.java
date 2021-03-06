public class TeenNumberCheck {

    public static boolean hasTeen(int firstTeen, int secondTeen, int thirdTeen) {

        if (firstTeen >= 13 && firstTeen <= 19 || secondTeen >= 13 && secondTeen
                <= 19 || thirdTeen >= 13 && thirdTeen <= 19) {
            return true;
        } else {
            return false;
        }
    }
}



//boolen with 3 parameters all must be in range 13-19.

/*
public class TeenNumberChecker {

    public static boolean hasTeen (int a, int b, int c) {
        int [] age = {a, b, c};
        boolean isTeen = false;
        for(int i = 0; i < age.length; i ++) {
            isTeen = age[i]>=13 && age[i]<=19 ? true : false;
        }
        return isTeen;
    }

    public static boolean isTeen(int a) {
        return a>=13 && a<=19 ? true : false;
    }
}*/
