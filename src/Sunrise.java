import java.util.Scanner;

public class Sunrise {
   
        // TODO: Read n
        // TODO: Read the array of heights
        // TODO: Iterate through the array and count how many buildings are taller than the current maximum height encountered so far.
        // TODO: Print the count
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int h[] = new int[n]; no need to get this array, we can use a variable to track the input and calculate the answer
        int currMaxHeight = 0;
        int count = 0;
        for (int i = 0; i < n;i++) {
            int temp = sc.nextInt();
            if (temp>currMaxHeight) {
                currMaxHeight=temp;
                count++;
            }
        }
        System.out.print(count);
    }
    
}
