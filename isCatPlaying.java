public class isCatPlaying {

    public class PlayingCat {
        public static boolean isCatPlaying(boolean summer, int temp) {
            return summer ? temp <= 45 && temp >= 25 ?  true : false :  temp <= 35 && temp >= 25 ?  true : false;
        }
        // write your code here
    }

}

// Conditional Statements samples below

/*
    public static void printNumberInWord(int num){
        System.out.println((num==0)? "ZERO":(num==1)? "ONE": (num==2)? "TWO": (num==3)? "THREE": (num==4)? "FOUR": (num==5)? "FIVE": (num==6)? "SIX": (num==7)? "SEVEN": (num==8)? "EIGHT": (num==9)? "NINE": "OTHER");
    }*/


/*
public class NumberInWord {
    public static void printNumberInWord(int number) {
        String toWord;
        switch (number) {
            case 0:toWord = "zero";
                break;
            case 1:toWord = "one";
                break;
            case 2:toWord = "two";
                break;
            case 3:toWord = "three";
                break;
            case 4:toWord = "four";
                break;
            case 5:toWord = "five";
                break;
            case 6:toWord = "six";
                break;
            case 7:toWord = "seven";
                break;
            case 8:toWord = "eight";
                break;
            case 9:toWord = "nine";
                break;
            default:toWord = "other";
                break;
        }
        System.out.print(toWord.toUpperCase());
    }

}
*/
