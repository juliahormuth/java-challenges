package HackerRank;

public class EqualsVs2Equal {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // see the reference
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        // see the content
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    }
}
