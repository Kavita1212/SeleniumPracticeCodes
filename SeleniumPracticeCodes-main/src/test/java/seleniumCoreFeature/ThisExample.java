package seleniumCoreFeature;

public class ThisExample {

	int a;
	
	/*
	 * int :4 byte short :2 byte
	 * 
	 * 
	 * float: 4 byte double:8 byte long :8 byte
	 * 
	 * byte =8 bit (1 byte)
	 * 
	 * char: 2 byte
	 * 
	 * boolean : true/false
	 */
	
	
	public int ThisExample(int rollNo) {
		// TODO Auto-generated constructor stub
		this.a = rollNo;
		return a;

	}

	/*
	 * public int ThisExample(int a) { // TODO Auto-generated constructor stub
	 * this.a = a; return a;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample s = new ThisExample();
		int ans = s.ThisExample(10);
		System.out.println(ans);

	}
	
	
	 
	//this() : current class 
	//super() : parennt call constructor

}
