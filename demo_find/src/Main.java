public class Main {

    /*ЗАДАНИЕ 5.3.1 СТР 703*/

    public static void main(String[] args) {
        String pat = "AAB";
        String txt = "jujujuvAABtyvkikit";
        System.out.println(txt);
        Brute brute = new Brute(pat);
        int offset = brute.search(txt);
        for (int i = 0; i < offset; i++) {
            System.out.print(" ");
        }
        System.out.println(pat);
    }
}
