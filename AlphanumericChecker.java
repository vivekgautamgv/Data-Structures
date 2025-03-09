import java.util.*;

// public class practice1 {
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<Integer>();

//         s.push(6);
//         s.push(570);
//         s.push(890);
//         s.push(590);

//         System.out.println(s);
//     }
// }


import java.util.Scanner;

public class AlphanumericChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Alphanumeric Character Checker");
        System.out.println("-----------------------------");
        
        // Get user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            System.out.println("You didn't enter anything!");
        } else {
            System.out.println("\nAnalyzing each character:");
            
            // Process each character
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                System.out.printf("Character '%c': ", c);
                
                if (Character.isLetterOrDigit(c)) {
                    System.out.print("Is alphanumeric");
                    
                    if (Character.isLetter(c)) {
                        System.out.print(" (Letter)");
                        if (Character.isUpperCase(c)) {
                            System.out.print(" [Uppercase]");
                        } else {
                            System.out.print(" [Lowercase]");
                        }
                    } else if (Character.isDigit(c)) {
                        System.out.print(" (Digit)");
                    }
                } else {
                    System.out.print("Not alphanumeric");
                    if (Character.isWhitespace(c)) {
                        System.out.print(" (Whitespace)");
                    } else {
                        System.out.print(" (Special character)");
                    }
                }
                System.out.println();
            }
            
            // Overall statistics
            int alphanumericCount = 0;
            int letterCount = 0;
            int digitCount = 0;
            
            for (char c : input.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    alphanumericCount++;
                    if (Character.isLetter(c)) {
                        letterCount++;
                    } else if (Character.isDigit(c)) {
                        digitCount++;
                    }
                }
            }
            
            System.out.println("\nSummary:");
            System.out.println("Total characters: " + input.length());
            System.out.println("Alphanumeric characters: " + alphanumericCount);
            System.out.println("Letters: " + letterCount);
            System.out.println("Digits: " + digitCount);
            System.out.println("Non-alphanumeric characters: " + (input.length() - alphanumericCount));
        }
        
        scanner.close();
    }
}
