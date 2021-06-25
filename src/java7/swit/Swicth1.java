package java7.swit;

public class Swicth1 {

	public static void main(String[] args) {
		
		args = new String[]{"a", "a", "a", "a", "a"};

		int t = args.length;
		switch (t) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		default:
			System.out.println("+++");
		}
	}
}
