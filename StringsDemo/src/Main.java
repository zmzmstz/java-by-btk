import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String message = "Today weather is really good.";

        System.out.println(message);

        /*System.out.println("Character number: " + message.length());

        String reverse = "";
        for (int i = 0; i < message.length(); i++) {
            System.out.println(i + 1 + ". character is " + message.charAt(i));
            reverse = message.charAt(i) + reverse;
        }
        System.out.println(message.concat(" Oleyyy!"));
        System.out.println("-------------------------");
        System.out.println(reverse);

        System.out.println(message.startsWith("t"));
        System.out.println(message.endsWith("."));

        char[] characters = new char[20];
        message.getChars(7, 11, characters, 6);
        System.out.println(characters);
        System.out.println(message.indexOf("y") + 1);
        System.out.println(message.lastIndexOf("y") + 1);*/

        // nearly all the string functions does not change the string, u need to assign them to a new variable
        System.out.println(message.replace(" ", "_"));
        System.out.println(message.substring(2, 5));
        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String lastMessage = "   " + message + "   ";
        System.out.println(lastMessage);
        System.out.println(lastMessage.trim());
    }
}