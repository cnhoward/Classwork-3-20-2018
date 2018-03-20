import java.util.Scanner;
public class Backwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner word = new Scanner(System.in);
System.out.println("Enter a word");
String input = word.nextLine();

for(int i = input.length()-1; i >=0; i--) {
	System.out.println(input.charAt(i));
}

	}

}
