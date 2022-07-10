package seleniumCoreFeature;

public class ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//improperly cast a class from one type to another
		Object i = Integer.valueOf(10);
		String s = (String) i;

	}
}