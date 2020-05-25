package JC_Lesson3;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        String[] setOfWords = {
                "Same word",
                "Not same word",
                "Collections",
                "Same word",
                "Not same same word",
                "Not same same same word",
                "Same word with 'space'",
                "Final Fantasy",
                "Word №9",
                "Word №10",
                "Word №11",
                "Word №10",
                "Word №13",
                "Word №14",
                "Word №10",
                "Word №16",

        };
        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : setOfWords) {
            Integer res = hm.get(word);
            hm.put(word, res == null ? 1 : res + 1);
        }
        System.out.println(hm);


        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Serhii", "+3519111111");
        phoneBook.add("Fanzil", "+3519222222");
        phoneBook.add("Andrea", "+3519333333");
        phoneBook.add("Serhii", "+3519555555");
        phoneBook.add("Fanzil", "+3519777777");
        phoneBook.add("Antoni", "+3519888888");

        phoneBook.info();

       System.out.println("Sr(a) Serhii's number : " + phoneBook.get ("Serhii"));
    }
}
