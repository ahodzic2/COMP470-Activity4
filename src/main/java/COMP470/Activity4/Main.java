package COMP470.Activity4;

public class Main {
    public static void main(String[] args) {
        String str= "Geeks";

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        System.out.println("Reversed word: "+ reverseString(str));
    }

    public static String reverseString (String str) {
        String nstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        return nstr;
    }
}