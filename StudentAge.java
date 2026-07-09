import java.util.Scanner;
class StudentAge{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[] age=new int[10];
        System.out.println("Enter elements of array");
        for(int i=0; i<10;i++) {
            age[i]=input.nextInt();
        }
        for (int j=0;j<age.length;j++){
            if (age[j]<0){
                System.out.println("Invalid Age");
                continue;
            }
            else if(age[j]<18){
                System.out.println("The student with age"+age[j]+"cannot vote.");
            }
            else{
                System.out.println("The student with age"+age[j]+"can vote");
            }
        }
        input.close();
    }
}