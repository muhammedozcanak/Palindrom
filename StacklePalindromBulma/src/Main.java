
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //Palindrom kelime yazılış ile tersten yazılışı aynı olan kelimedir. kasaylabalyasak gibi. stacklar ile bunu yapacaz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir Cümle Giriniz.");
        String cumle = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cumle.length() / 2; i++) {

            stack.push(cumle.charAt(i));
        }

        if (polindromKontrol(cumle, stack)) {
            System.out.println("Cümle Palindrom'dur ");
        } else {
            System.out.println("Cümle Palindrom Değildir");
        }
    }

    public static boolean polindromKontrol(String cumle, Stack<Character> stack) {
    //Return komple döngüyü kırar. Bütün Metod biter.
        for (int i = (cumle.length() / 2) + 1; i < cumle.length(); i++) {
            if (stack.pop() == cumle.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
