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


// import java.util.Stack;

// public class Javasts {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = {1,2,3,4,5,6,7,8};
//         int m = 4;

//         for(int i = 0;i<=8;i++){
//             if(arr[i]%2 == 0){
//                 for(int j = 0;j<m;j++){
//                     arr[i] = arr[j];
//                 }        
//         }

//         else {
//             for(int k=0; k>4 && k<=8){
//                 arr[i] = arr[k];
//             }
//         }


//         //Scanner sc= new Scanner(System.in);       

       
//     }
// }
// }
// import java.util.Scanner;

// public class Javasts {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//         int n = arr.length;

//         int[] result = new int[n];
//         int evenIndex = 0;
//         int oddIndex = n - 1;

//         for (int i = 0; i < n; i++) {
//             if (arr[i] % 2 == 0) {
//                 result[evenIndex++] = arr[i];
//             } else {
//                 result[oddIndex--] = arr[i];
//             }
//         }

//         // Print the modified array
//         for (int i = 0; i < n; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }
// }
// import java.util.Scanner;

// public class Javasts {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String is = sc.nextLine();
//         sc.close();

//         if (validstr(is)) {
//             System.out.println("The string is valid.");
//         } else {
//             System.out.println("The string is not valid.");
//         }
//     }

//     private static boolean validstr(String s) {
//         if (s.isEmpty()) {
//             return false;
//         }
//         if (s.charAt(0) == 'a') {
//             if (s.length() >= 3 && s.substring(1, 3).equals("bb")) {
//                 return true;
//             } else {
//                 return validstr(s.substring(1));
//             }
//         }
//         return false;
//     }
// }

// import java.util.*;

// public class Javasts {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 5, 5, 6, 7, 8};
//         int tar = 15; 
//         if (findTriplet(arr, tar)) {
//             System.out.println("Triplet found.");
//         } else {
//             System.out.println("No triplet found.");
//         }
//     }

//     private static boolean findTriplet(int[] arr, int tar) {
//         int n = arr.length;

//         for (int i = 0; i < n - 2; i++) {
           
//                     if (arr[i] + arr[i+2] + arr[i+3] == tar) {
//                         return true;
//                     }
             
//         }
//         return false;
//     }
// }


// import java.util.*;

// class Javasts{
//     static void dial(int[] dist , int w){

//         TreeSet<Integer> set = new TreeSet<>();
//         for(int d: dist) set.add(d/w);
//         System.out.println(set);
//     }

//     public static void main(String[] args){
//         int[] dist = {1, 3, 4, 5, 6, 7, 8, 9};
//         int w = 3;
//         dial(dist, w);
//     }   
// }


