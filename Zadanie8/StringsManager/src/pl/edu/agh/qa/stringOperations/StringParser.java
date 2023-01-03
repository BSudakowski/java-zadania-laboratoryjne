package pl.edu.agh.qa.stringOperations;

public class StringParser {
    private String text;

    public static void main(String[] args) {
        String textToParse = "Print the longest word";
        StringParser parser = new StringParser(textToParse);
        parser.pintVertical();
        System.out.println(parser.longestWord());

        String palindrome = "madam";
        String notPalindrome = "adam";
        System.out.println("Palindrom " + Palindrome.isPalindrome(palindrome));
        System.out.println("Nie palindrom " + Palindrome.isPalindrome(notPalindrome));
    }

    public StringParser(String text) {
        this.text = text;
    }

    public void pintVertical() {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public String longestWord() {
        String words[] = text.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
