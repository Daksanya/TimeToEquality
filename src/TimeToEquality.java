import java.util.Scanner;

public class TimeToEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]=new int[n];
        for (int i=0;i<n;i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(equality(array, n));
    }

    static int equality(int array[], int n) {
        int max=Integer.MIN_VALUE,count=0;
        for (int i=0;i<n;i++) {
            if (max<array[i]) {
                max=array[i];
            }
        }
        for(int i=0;i<n;i++){
            count+=(max-array[i]);
        }
        return count;
    }
}

