import java.util.Scanner;
class MultiplicationTable{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number for Multiplication Table");
        int n=input.nextInt();
        int[] table=new int[10];
        for (int i=1;i<=10;i++){
            table[i-1]=i*n;
        }
        for(int j=1;j<=10;j++){
            System.out.println(n+"*"+j+"="+table[j-1]);
        }
    }
}