package HackerRank.POO.JavaAbstractClass;

public class Main {
    public static void main (String []args) {
        String title = "Just a example";
        MyBook novel = new MyBook();
        novel.setTitle(title);
        System.out.println("The title is: "+novel.getTitle());
    }
}
