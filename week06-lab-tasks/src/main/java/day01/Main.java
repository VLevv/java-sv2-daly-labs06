package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number= scanner.nextDouble();
        PositiveNumberContainer container = new PositiveNumberContainer();
        scanner.nextLine();
        while(number>0){
            container.addNumbers(number);
            number=scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println(container.getNumbers());
    }
}
