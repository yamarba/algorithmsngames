public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int first_num = (int) (num1 * 1000);
        int second_num = (int) (num2 * 1000);

        return (first_num - second_num == 0);
    }
}




/*
public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println( areEqualByThreeDecimalPlace(3.157,3.156));

    }

    public static boolean areEqualByThreeDecimalPlace(double num1, double num2)
    {
        num1 = Math.round(num1 * 1000);
        num1= num1 /(double)1000;
        num1 = Math.round(num2 * 1000);
        num1= num1 / (double)1000;
        if (num1 == num2) {
            return true;
        }
        else {
            return false;
        }
    }
}*/
