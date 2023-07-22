import java.util.Scanner;

public class NumberOf1Bits {
    static int check(int n){
        int count=0;
        for(int i=0;i<32;i++){
            if(n == (n | (1<<i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(check(n));
    }
}
