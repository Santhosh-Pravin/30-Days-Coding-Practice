class String {
	String(String name){
		this.name = name;
	}
}
public class StringManipulation{
	public static void main(String[] args) {
		String name = "Java Programming";
		System.out.println(name);
		String[] array = {"Java","Programming"};
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		String obj = new String("Java Programming");
	}
}