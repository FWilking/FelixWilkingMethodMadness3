package FelixWilking;

public class FelixWilkingLib {
    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length(); ++i) {
            if (!str.substring(i, i + 1).equals(str.substring(str.length() - i - 1, str.length() - i))) {
                return false;
            }
        }

        return true;
    }
    public static String cutout(String strMain, String strSub){
        return strMain.substring(0,strMain.indexOf(strSub)) + strMain.substring(strMain.indexOf(strSub)+strSub.length());
    }
    public static String vigCipher(String Message, String Key){
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Message = Message.toUpperCase();
        Key = Key.toUpperCase();
        String CypherText = "";
        for(int i = 0; i < Message.length(); i++){
            if(!(abc.contains(Message.substring(i,i+1)))) Message = Message.substring(0,i) + Message.substring(i+1);//Removes characters not in abc

            String charAtMessageIndex = Message.substring(i,i+1);
            String charAtKeyIndex = Key.substring(i%Key.length(),i%Key.length()+1);

            int MessageIndexInAbc = abc.indexOf(charAtMessageIndex);
            int KeyIndexInAbc = abc.indexOf(charAtKeyIndex);

            CypherText += abc.substring((MessageIndexInAbc+KeyIndexInAbc)%26,(MessageIndexInAbc+KeyIndexInAbc)%26+1);
        }
        return CypherText;
    }
    public static int stringUnion(String word1, String word2, String word3){
        int count = 0;
        for(int i = 0;(i < word1.length())&&(i < word2.length())&&(i < word3.length()); i++){
            String CharAtIndex1 = word1.substring(i,i+1);
            String CharAtIndex2 = word2.substring(i,i+1);
            if(word2.contains(CharAtIndex1)||(word3.contains(CharAtIndex1))) count++;
            else if(word3.contains(CharAtIndex2)) count++;
        }
        return count;
    }
    public static boolean isFibonnaci(int num){
        int firstNum = 1;
        int secondNum = 1;
        while((firstNum < num)&&(secondNum < num)){ //If either of the numbers is greater
            firstNum = secondNum + firstNum;
            secondNum = secondNum + firstNum;
        }
        return (firstNum == num)||(secondNum == num); //and neither is equal then it is not in the fibonnaci sequence
    }
    public static boolean isPrime(int num){ //I used this method in the primePrinter method
        for(int i = 2; i < num; i++){
            if((num%i) == 0) return false;
        }
        return true;
    }
    public static void primePrinter(int num){
        for(int i = 1; i < num; i++){
            if(FelixWilkingLib.isPrime(i)){
                System.out.print(i + ", ");
                num--; //This makes sure it prints "num" primes instead of all the primes between 0 and num
            }
            num++;
        }
    }
    public static int sumUpTo(int num){
        int output = 0;
        for(int i = 1; i < num; i++){
            output += i;
        }
        return output;
    }
}