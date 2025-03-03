import java.util.*;

public class practice1 {
    public static void main(String[] args) {
        String name  = "Vivek";
        String name2 = "Gagam";
        int age = 30;
        int age2 = 25;
   
  
        
        int[] arr = {1,2,3,4,6,3,5,24,25632534,23452,424,24,25,5};
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));

        int[] arr2 = new int[10];
        arr2[0] = 97;
        arr2[1] = 98;

        Scanner sc = new Scanner(System.in);

        int n  = new Scanner(System.in).nextInt();
        System.out.println(n);

        int[] arr3 = new int[n];

        for (int i = 0;i<n;i++){
            arr3[i] = sc.nextInt();
    
        }
    
        for (int i = 0;i<n;i++){
            System.out.print(arr3[i]);
    
        }
    
    
    }

}