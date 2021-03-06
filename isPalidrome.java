public class isPalidrome {

    public static boolean yesPalindrome(int number) {
        int reverse = 0;
        number = number < 0 ? number*(-1) : number;
        int palindrome = number;
        while (number != 0) {
            // if not clear do the below operation. it will reverse string
            reverse = (reverse*10) + (number%10);
            number = number / 10;
        }
        return palindrome == reverse ? true : false;
    }
}
// palidrome 1221,