package FelixWilking;

public class Main {

    public static void main(String[] args) {
        System.out.println(FelixWilkingLib.isPalindrome("tacocat")); //tacocat is a palindrome and should return true
        System.out.println(FelixWilkingLib.cutout("catatonic cat", "cat")); //after removing the first instance on "cat": "atonic cat" should print
        System.out.println(FelixWilkingLib.vigCipher("ATTACKATDAWN", "LEMON")); //wikipedia's example cypher says this should return LXFOPVEFRNHR
        System.out.println(FelixWilkingLib.stringUnion("hello", "hola", "nihao")); //Returns int number of unique letters shared by at least two of the words.
        System.out.println(FelixWilkingLib.isFibonnaci(6765)); //6765 is in the Fibonnaci sequence, this should return True
        System.out.println(FelixWilkingLib.sumUpTo(10)); //Sum of numbers between 1 and 10 is 45
        FelixWilkingLib.primePrinter(23); //prints the first 23 prime numbers

    }
}