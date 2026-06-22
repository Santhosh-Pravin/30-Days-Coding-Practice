public class AccessModifiers {
	private int privateField = 10;
	protected double protectedField = 10.99;
	String defaultField = "Rithish";
	public boolean publicField = false;
	
	private void privateMethod(){
		System.out.println("Private Method called "+privateField);
	}
	void defaultMethod(){
		System.out.println("Default method called "+defaultField);
	}
	protected void protectedMethod(){
		System.out.println("Protected method called "+protectedField);
	}
	public void publicMethod(){
		System.out.println("Public Method called "+publicField);
	}
	
	AccessModifiers(){
	}
	
	public void testInternalAccess(){
		System.out.println("Private : "+privateField);
		System.out.println("Public : "+publicField);
		System.out.println("Default : "+defaultField);
		System.out.println("Protected :"+protectedField);
		privateMethod();
		publicMethod();
		protectedMethod();
		defaultMethod();
	}
	
	public static void main(String[] args){
		AccessModifiers obj = new AccessModifiers();
		obj.testInternalAccess();
		obj.publicField = true;
		obj.publicMethod();
		obj.defaultField = "Santhosh";
		obj.defaultMethod();
		obj.protectedField = 9.99;
		obj.protectedMethod();
		obj.privateField = 11;
		obj.privateMethod();
	}
}
class SamePackageTest {
	public static void testAccess() {
		AccessModifiers obj = new AccessModifiers();
		obj.testInternalAccess();
		obj.publicField = false;
		obj.publicMethod();
		//obj.defaultField = "Santhosh";
		//obj.defaultMethod();
		//obj.protectedField = 9.99;
		//obj.protectedMethod();
		//obj.privateField = 11;
		//obj.privateMethod();
	}
}