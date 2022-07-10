package seleniumCoreFeature;

class PenNotFoundException extends RuntimeException {

	public PenNotFoundException(String s) {
		super(s);
	}
	/*
	 * public void penFoundException() { throw new penFoundException;
	 * 
	 * }
	 */
}

public class TestException {

	public static void main(String[] args) { // TODO Auto-generated method stub
		throw new PenNotFoundException("pen not found");
	}

}
