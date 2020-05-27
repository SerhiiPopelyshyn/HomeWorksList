package JC_Lesson3;

import java.util.* ;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String tel) {
        ArrayList<String> telList = phoneBook.get(name);
        if (telList == null) telList = new ArrayList<>();
        telList.add(tel);
        phoneBook.put(name, telList);
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }

    public void info() {
        System.out.println(phoneBook);
    }
}
