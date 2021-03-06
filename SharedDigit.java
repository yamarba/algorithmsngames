public class SharedDigit {

    public static boolean hasSharedDigit(int x,int y) {
        if((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
            return false;
        }else {
            return((x/10 == y/10)||(x/10 == y % 10)||(y/10 == x % 10)||(x%10 == y%10));
        }
    }
}


/*    public static boolean hasSharedDigit( int x, int y) {
        if((x < 10) || (x >99) || (y < 10) || (y >99)) {
            return false;
        } else {
            int lastDigitOfX = x % 10;
            int firstDigitOfX = x / 10;
            int lastDigitOfY = y % 10;
            int firstDigitOfY = y / 10;
            if((lastDigitOfX == lastDigitOfY) || (firstDigitOfX == firstDigitOfY)) {
                return true;
            } else if ((lastDigitOfX == firstDigitOfY) || (firstDigitOfX == lastDigitOfY)) {
                return true;
            } else {
                return false;
            }
        }
    }*/
