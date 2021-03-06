public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastDigit + number;
    }
}

// The method finds the first and last digit of the parameter number
// and return their sum using a loop.


/*
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int num=number;
        int lastDigit = num%10;
        while(num>9){
            num = num/10;
        }
        System.out.println(lastDigit+num);
        return lastDigit+num;
    }*/
