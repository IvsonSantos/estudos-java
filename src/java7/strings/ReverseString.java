package java7.strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String a = "joao";
		String b = new StringBuffer("joao").reverse().toString();
		
		System.out.println(a + " " + b);
	}
}
