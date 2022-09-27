
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* ЗАДАНИЕ 5.2.14 СТР 679 */

public class Main {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        String text;
        int L;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите текст");
        text= scanner.next();
        System.out.println("введите длинну строки");
        L =scanner.nextInt();
        for (int i = 0; i < text.length()-L; i++) {
            String sbs = text.substring(i,i+L);
            strings.add(sbs);
        }
        System.out.println("количество подстрок" +strings.size());

    }
}
