package deitel.strings;

public class StringConcat {

	public static void main(String[] args) {
		
		String string1 = "hello";
		String string2 = "BC";
		int value = 22;
		
		String s = string1 + string2 + value;
		// Primeiro, a instrução anterior cria um StringBuilder vazio, então anexa a ele as strings "hello", "BC" e o inteiro 22. Em
		// seguida, o método toString de StringBuilder converte o StringBuilder em um objeto String a ser atribuído à String
		
	}
}
