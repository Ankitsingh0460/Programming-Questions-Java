import java.util.Scanner;

class ReverseWords {

  public static void main(String[] args) {
    Scanner r = new Scanner(System.in);
    System.out.println("Enter String");
    String str = r.nextLine();

    String[] words = str.split("");

    StringBuilder reversed = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {

      reversed.append(words[i]).append("");

    }

    System.out.println("Reversed Words: " + reversed.toString().trim());

  }

}