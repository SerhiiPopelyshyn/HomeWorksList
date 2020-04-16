import com.sun.jndi.ldap.sasl.LdapSasl;

import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main(String args[]) {

/* 3ada4ka 2
2 * Создать массив из слов String[] words = {"apple", "orange", "lemon",
"banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
"grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
"peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
 */

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();

        int indWord = random.nextInt(words.length - 1);
        String word = words[indWord];
        int lengthWord = word.length();
        System.out.println("Я загадал слово, попробуй его отгадать -");
        System.out.println(word);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введи свой ответ: ");
            String answer = scanner.nextLine();
            if (answer.equals("")) break;
            else if (word.equals(answer)) {
                System.out.println("Вы угадали слово =)");
            }
            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < lengthWord; i++) {
                if (i >= charsAnswer.length) break;
                if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
            for (int i = comment.length(); i < 10; i++) comment.append("#");
            System.out.println(comment);
        }
        while (true);
    }
}
