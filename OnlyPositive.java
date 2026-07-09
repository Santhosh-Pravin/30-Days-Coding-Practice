import java.util.Scanner;
class OnlyPositive{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double total=0;
		double[] num=new double[10];
		while(true){
			int i=0;
			num[i]=input.nextDouble();
			if (num[i]==0){
				System.out.println("The number is 0");
				break;
			}
			else if(num[i]<0){
				System.out.println("The number is negative");
				break;
			}
			if(num.length==10){
				System.out.println("The limit has been reached");
				break;
			}
			i++;
		}
		for(int j=0;j<num.length;j++){
			total+=num[j];
		}
		System.out.println("The total value in array is "+total);
		input.close();
	}
}
			
			
			
			