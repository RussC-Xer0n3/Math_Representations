package Math_Representations;
/**
 * A base class for defining therefore statements according to type definition
 * in example - use this class when working with autonomous data where the
 * return type and value from the calling method is uncertain, write each variant
 * of this class according to your desired processing requirements per type
 */

public class Therefor {

	public static String stringproc( String A) {
		/**
		 * 
		 */
		return A;
	}
	
	public static int intproc( int A) {
			/**
			 * 
			 */
			return A;
	}
		
	public static double doubleproc( double A) {
		/**
		 * 
		 */
		return A;
	}
	
	@SuppressWarnings("unused")
	public static boolean boolproc(boolean A) {
		/**
		 * If true return true else is false 
		 */
		if(A == true) {
			return true;
		}
		
		return false;
	}
	
	public static char charproc( char A) {
		/**
		 * 
		 */
		return A;
	}
	
	public static long longproc( long A) {
		/**
		 * 
		 */
		return A;
	}
	
	public static float floatproc( float A) {
		/**
		 * 
		 */
		return A;
	}
	
	public static short shortproc( short A) {
		/**
		 * 
		 */
		return A;
	}
	
	public static byte byteproc( byte A) {
		/**
		 * 
		 */
		return A;
	}
	/**
	 * Assesses the type definition and calls the appropriate method
	 * @param A
	 */
	public static void type(Object A) {
		// Ascertain the type definition of the variable and send to correct processor
		if (A instanceof String) {
			stringproc((String) A);
		} else if (A instanceof Integer) {
			intproc((int) A);
		} else if (A instanceof Double) {
			doubleproc((double) A);
		} else if (A instanceof Boolean) {
			boolproc((boolean) A);
		} else if (A instanceof Character) {
			charproc((char) A);
		} else if (A instanceof Long) {
			longproc((long) A);
		} else if(A instanceof Float) {
			floatproc((float) A);
		} else if (A instanceof Short) {
			shortproc((short) A);
		} else {
			byteproc((byte) A);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Send in the args one at a time
		type(args);
	}

}
