

public static void main(String[] args){
    Scanner sc = new Scanner(System.in());
    
    int n = sc.nextInt();

    int n[] = new int[10];

    for(int i = 0; i < n; i++){
        n[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++){
        System.out.print(n[i] + " ");
    }
    System.out.println();
    for(int i = 0; i < n; i++){
        System.out.print(n[i] + " ");
    }
    System.out.println();

    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<n;i++)){
        stack.push[n[i]];
    }
    
    int z[] = {1, 2, 3, 4, 5};
    Arrays.sort(z);
    System.out.println(Arrays.toString(z));
}
