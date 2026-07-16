public class Calculator{
    int a;
    int b;
    public int Add(int a,int b){
        System.out.println("The sum of the given numbers is"+(a+b));
        return a+b;
    }
    public int Substraction(int a,int b){
        System.out.println("The difference of the given numbers is"+ (a-b));
        return a-b;
    }
    public int Multiply(int a,int b){
        System.out.println("The multiplication between given numbers is"+ (a*b));
        return a*b;
    }
    public int Divide(int a,int b){
        System.out.println("The quotient between given numbers is"+ (a/b));
		return a/b;
    }
    public static void main(String[] args){
        Calculator obj = new Calculator();
        obj.Add(8,4);
        obj.Substraction(8,4);
        obj.Multiply(8,4);
        obj.Divide(8,4);
    }
}