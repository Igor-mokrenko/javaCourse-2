package hw3;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "лань",
                "лань",
                "фотолиз",
                "раскидчик",
                "раскидчик",
                "раскидчик",
                "стойбище",
                "нефтескважина",
                "нефтескважина",
                "гамма-железо",
                "хмельник",
                "хмельник",
        };

        Words wordsMap = new Words(words);
        wordsMap.printUniqueWords();
        System.out.println("");
        wordsMap.printWordsInfo();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петренко", "+79995557675");
        phoneBook.add("Петренко", "+79995557775");
        phoneBook.add("Пупкин", "+79995553476");
        System.out.println("");
        phoneBook.printContacts(phoneBook.get("петренко"));
        System.out.println("");
        phoneBook.printContacts(phoneBook.get("Пупкин"));
        System.out.println("");
        phoneBook.printContacts(phoneBook.get("asdf"));
    }
}
