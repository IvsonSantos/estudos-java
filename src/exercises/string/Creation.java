package exercises.string;

public class Creation {

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3 = new String("java2");
        String s4 = new String("java2");
        System.out.println(s3 == s4);
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
