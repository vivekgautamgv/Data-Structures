import java.util.Scanner;

// public class AlphanumericChecker {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Alphanumeric Character Checker");
//         System.out.println("-----------------------------");
        
//         // Get user input
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();
        
//         if (input.isEmpty()) {
//             System.out.println("You didn't enter anything!");
//         } else {
//             System.out.println("\nAnalyzing each character:");
            
//             // Process each character
//             for (int i = 0; i < input.length(); i++) {
//                 char c = input.charAt(i);
//                 System.out.printf("Character '%c': ", c);
                
//                 if (Character.isLetterOrDigit(c)) {
//                     System.out.print("Is alphanumeric");
                    
//                     if (Character.isLetter(c)) {
//                         System.out.print(" (Letter)");
//                         if (Character.isUpperCase(c)) {
//                             System.out.print(" [Uppercase]");
//                         } else {
//                             System.out.print(" [Lowercase]");
//                         }
//                     } else if (Character.isDigit(c)) {
//                         System.out.print(" (Digit)");
//                     }
//                 } else {
//                     System.out.print("Not alphanumeric");
//                     if (Character.isWhitespace(c)) {
//                         System.out.print(" (Whitespace)");
//                     } else {
//                         System.out.print(" (Special character)");
//                     }
//                 }
//                 System.out.println();
//             }
            
//             // Overall statistics
//             int alphanumericCount = 0;
//             int letterCount = 0;
//             int digitCount = 0;
            
//             for (char c : input.toCharArray()) {
//                 if (Character.isLetterOrDigit(c)) {
//                     alphanumericCount++;
//                     if (Character.isLetter(c)) {
//                         letterCount++;
//                     } else if (Character.isDigit(c)) {
//                         digitCount++;
//                     }
//                 }
//             }
            
//             System.out.println("\nSummary:");
//             System.out.println("Total characters: " + input.length());
//             System.out.println("Alphanumeric characters: " + alphanumericCount);
//             System.out.println("Letters: " + letterCount);
//             System.out.println("Digits: " + digitCount);
//             System.out.println("Non-alphanumeric characters: " + (input.length() - alphanumericCount));
//         }
        
//         scanner.close();
//     }
// }



//import java.util.Scanner;

// public class AlphanumericChecker {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Palindrome Checker");
//         System.out.println("-----------------");
        
//         // Get user input
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();
        
//         if (input.isEmpty()) {
//             System.out.println("You didn't enter anything!");
//         } else {
//             // First analyze alphanumeric characters
//             System.out.println("\nAnalyzing each character:");
            
//             // Process each character
//             for (int i = 0; i < input.length(); i++) {
//                 char c = input.charAt(i);
//                 System.out.printf("Character '%c': ", c);
                
//                 if (Character.isLetterOrDigit(c)) {
//                     System.out.print("Is alphanumeric");
                    
//                     if (Character.isLetter(c)) {
//                         System.out.print(" (Letter)");
//                         if (Character.isUpperCase(c)) {
//                             System.out.print(" [Uppercase]");
//                         } else {
//                             System.out.print(" [Lowercase]");
//                         }
//                     } else if (Character.isDigit(c)) {
//                         System.out.print(" (Digit)");
//                     }
//                 } else {
//                     System.out.print("Not alphanumeric");
//                     if (Character.isWhitespace(c)) {
//                         System.out.print(" (Whitespace)");
//                     } else {
//                         System.out.print(" (Special character)");
//                     }
//                 }
//                 System.out.println();
//             }
            
//             // Overall statistics
//             int alphanumericCount = 0;
//             int letterCount = 0;
//             int digitCount = 0;
            
//             for (char c : input.toCharArray()) {
//                 if (Character.isLetterOrDigit(c)) {
//                     alphanumericCount++;
//                     if (Character.isLetter(c)) {
//                         letterCount++;
//                     } else if (Character.isDigit(c)) {
//                         digitCount++;
//                     }
//                 }
//             }
            
//             System.out.println("\nSummary:");
//             System.out.println("Total characters: " + input.length());
//             System.out.println("Alphanumeric characters: " + alphanumericCount);
//             System.out.println("Letters: " + letterCount);
//             System.out.println("Digits: " + digitCount);
//             System.out.println("Non-alphanumeric characters: " + (input.length() - alphanumericCount));
            
//             // Check if the string is a palindrome
//             System.out.println("\nPalindrome Check:");
            
//             // Method 1: Check with original string (case-sensitive, includes all characters)
//             boolean isPalindrome1 = isPalindrome(input);
//             System.out.println("Is palindrome (case-sensitive, with all characters): " + isPalindrome1);
            
//             // Method 2: Check with alphanumeric characters only (case-insensitive)
//             boolean isPalindrome2 = isPalindromeAlphanumericOnly(input);
//             System.out.println("Is palindrome (case-insensitive, alphanumeric only): " + isPalindrome2);
            
//             // Display the cleaned string used for the second check
//             String cleanString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//             System.out.println("Cleaned string used for second check: \"" + cleanString + "\"");
//         }
        
//         scanner.close();
//     }
    
//     // Method to check if a string is a palindrome (case-sensitive, includes all characters)
//     private static boolean isPalindrome(String str) {
//         int left = 0;
//         int right = str.length() - 1;
        
//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
    
//     // Method to check if a string is a palindrome (case-insensitive, alphanumeric only)
//     private static boolean isPalindromeAlphanumericOnly(String str) {
//         // Remove all non-alphanumeric characters and convert to lowercase
//         String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
//         int left = 0;
//         int right = cleanStr.length() - 1;
        
//         while (left < right) {
//             if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }


// import java.util.Scanner;

// public class Javasts {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Palindrome Checker");
//         System.out.println("-----------------");
        
//         // Get user input
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();
        
//         if (input.isEmpty()) {
//             System.out.println("You didn't enter anything!");
//         } else {
//             // First analyze alphanumeric characters
//             System.out.println("\nAnalyzing each character:");
            
//             // Process each character
//             for (int i = 0; i < input.length(); i++) {
//                 char c = input.charAt(i);
//                 System.out.printf("Character '%c': ", c);
                
//                 if (Character.isLetterOrDigit(c)) {
//                     System.out.print("Is alphanumeric");
                    
//                     if (Character.isLetter(c)) {
//                         System.out.print(" (Letter)");
//                         if (Character.isUpperCase(c)) {
//                             System.out.print(" [Uppercase]");
//                         } else {
//                             System.out.print(" [Lowercase]");
//                         }
//                     } else if (Character.isDigit(c)) {
//                         System.out.print(" (Digit)");
//                     }
//                 } else {
//                     System.out.print("Not alphanumeric");
//                     if (Character.isWhitespace(c)) {
//                         System.out.print(" (Whitespace)");
//                     } else {
//                         System.out.print(" (Special character)");
//                     }
//                 }
//                 System.out.println();
//             }
            
//             // Overall statistics
//             int alphanumericCount = 0;
//             int letterCount = 0;
//             int digitCount = 0;
            
//             for (char c : input.toCharArray()) {
//                 if (Character.isLetterOrDigit(c)) {
//                     alphanumericCount++;
//                     if (Character.isLetter(c)) {
//                         letterCount++;
//                     } else if (Character.isDigit(c)) {
//                         digitCount++;
//                     }
//                 }
//             }
            
//             System.out.println("\nSummary:");
//             System.out.println("Total characters: " + input.length());
//             System.out.println("Alphanumeric characters: " + alphanumericCount);
//             System.out.println("Letters: " + letterCount);
//             System.out.println("Digits: " + digitCount);
//             System.out.println("Non-alphanumeric characters: " + (input.length() - alphanumericCount));
            
//             // Check if the string is a palindrome
//             System.out.println("\nPalindrome Check:");
            
//             // Method 1: Check with original string (case-sensitive, includes all characters)
//             boolean isPalindrome1 = isPalindrome(input);
//             System.out.println("Is palindrome (case-sensitive, with all characters): " + isPalindrome1);
            
//             // Method 2: Check with alphanumeric characters only (case-insensitive)
//             boolean isPalindrome2 = isPalindromeAlphanumericOnly(input);
//             System.out.println("Is palindrome (case-insensitive, alphanumeric only): " + isPalindrome2);
            
//             // Display the cleaned string used for the second check
//             String cleanString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//             System.out.println("Cleaned string used for second check: \"" + cleanString + "\"");
//         }
        
//         scanner.close();
//     }
    
//     // Method to check if a string is a palindrome (case-sensitive, includes all characters)
//     private static boolean isPalindrome(String str) {
//         int left = 0;
//         int right = str.length() - 1;
        
//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
    
//     // Method to check if a string is a palindrome (case-insensitive, alphanumeric only)
//     private static boolean isPalindromeAlphanumericOnly(String str) {
//         // Remove all non-alphanumeric characters and convert to lowercase
//         String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
//         int left = 0;
//         int right = cleanStr.length() - 1;
        
//         while (left < right) {
//             if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }


public class Javasts{
     

    public static void main(String[] args){
     int[] arr = {1,2,3,4,4,5,6};
     int size = arr.length;
     int target= 4;
     int count=0;
    Stack<Integer> s = new Stack<>();
    s.push(6);
    s.push(570);
    System.out.println(s);
     for(int i=0; i<size;i++){
        if (arr[i] <= target){
            count++;
        }else{
            break;
        }
    }
    System.out.println("Count: " + count);

    }
}