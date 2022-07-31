import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter a phrase: ");

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println("Upper case :" + str.toUpperCase());
        System.out.println("Lower case :" + str.toLowerCase());
        System.out.println("Character at index 3 :" + str.charAt(3));
        System.out.println("Replace 'a' with '*' :" + str.replace('a','*'));
        System.out.println("Substring 2 to 8 :" + str.substring(2,8));

        str = str.toLowerCase();
        int vowel = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowel++;
        }

        System.out.println("Number of vowels :" + vowel);
    }
}
