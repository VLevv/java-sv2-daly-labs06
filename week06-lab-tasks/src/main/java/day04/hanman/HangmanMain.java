package day04.hanman;

import java.util.Scanner;

public class HangmanMain {
    public static void main(String[] args) {
        System.out.println("Adja meg a szót:");
        HangmanMain hangman = new HangmanMain();
        Scanner scanner = new Scanner(System.in);
        String wordToFind=scanner.nextLine();
        String guess;
        int chances=8;
        String status=new String(new char[wordToFind.length()]);
        do{
            System.out.println("Mi a következő tipp?");
            guess=scanner.nextLine();
            if(wordToFind.contains(guess)){
            status=hangman.updateWordFound(wordToFind,status,guess);
            }
            else {
                chances--;
            }
            System.out.println(status);
            System.out.println(chances+" próbálkozás maradt");
        }
        while(!wordToFind.equals(status)&&chances>0);
        if(wordToFind.equals(status)){
            System.out.println("Szép volt!");
        }
        else {
            System.out.println("Vesztettél!");
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }
}
