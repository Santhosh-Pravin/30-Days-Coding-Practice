import java.util.Scanner;
class Sign {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] num=new int[5];
        for (int i=0;i<5;i++){
            num[i]=input.nextInt();
        }
        for (int j=0;j<num.length;j++){
            if (num[j]<0){
                System.out.println("The number is Negative");
            }
            else if(num[j]>0){
                System.out.println("The number is Positive");
            }
            else{
                System.out.println("The number is 0");
            }
            if (num[j]%2==0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
        }
        if (num[0]==num[4]){
            System.out.println("Both elements are equal");
        }
        else if(num[0]<num[4]){
            System.out.println(num[0]+" is lesser than "+num[4]);
        }
        else{
            System.out.println(num[0]+" is greater than "+num[4]);
        }
        input.close();
    }
}