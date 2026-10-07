import java.util.Scanner;
import java.util.Arrays;
public class Angaram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = sc.nextLine();

        System.out.print("Enter word2: ");
        String word2 = sc.nextLine();

        word1 = word1.toLowerCase().replaceAll("\\s", "");
        word2 = word2.toLowerCase().replaceAll("\\s", "");

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The words are Anagrams");
        } else {
            System.out.println("The words are Not Anagrams");
        }

        sc.close();
    }
}