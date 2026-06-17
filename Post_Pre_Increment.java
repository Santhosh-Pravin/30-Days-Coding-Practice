import java.util.Scanner;
public class Post_Pre_Increment {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
        int i = input.nextInt(); //Variable initialization
        System.out.println("Initial i = " + i);
        int post = i++;  //Post Increment to increment next, 1 will be 1
        System.out.println("After post-increment:");
        System.out.println(" post = " + post);
        System.out.println(" i = " + i); //Will give 2
        int pre = ++i;  // Pre Incremnet to increment first, 1 will become 2
        System.out.println("After pre-increment:");
        System.out.println(" pre = " + pre);
        System.out.println(" i = " + i); //Will give 3
    }
}

