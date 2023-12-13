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
		//some other math algebraic symbol
		Because.because(A);
		return A;
	}
	
	public static int intproc( int A) {
		/**
		 * 
		 */
		Because.because(A);
		return A;
	}
		
	public static double doubleproc( double A) {
		/**
		 * 
		 */
		Because.because(A);
		return A;
	}
	
	@SuppressWarnings("unused")
	public static boolean boolproc(boolean A) {
		/**
		 * If true return true else is false because if it's not true it is false
		 * no need for a because here, it is pure logic
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
		Because.because(A);
		return A;
	}
	
	public static long longproc( long A) {
		/**
		 * 
		 */
		Because.because(A);
		return A;
	}
	
	public static float floatproc( float A) {
		/**
		 * 
		 */
		Because.because(A);
		return A;
	}
	
	public static short shortproc( short A) {
		/**
		 * 
		 */
		Because.because(A);
		return A;
	}
	
	public static byte byteproc( byte A) {
		/**
		 * 
		 */
		Because.because(A);
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
	public static void therefor(Object args) {
		try {
			type(args);			
		} catch (NullPointerException E) {
			System.err.println(E);
		} finally {
			System.out.println("There was an error:\t" + System.err + "\nPlease contact developer");
		}
		return;
		
	}
	
	public static void thereforArray(Object[] args) {
		for (int a = 0; a < args.length; a++) {
			try {
				Object n = args[a];
				type(n);
			} catch (NullPointerException N) {
				System.err.print(N);
				System.out.println(N);
				continue;
			} finally {
				Object n = args[a];
				type(n);
			}
			continue;
		}
	}
	
	public static void thereforAArray(Object[][] args) {
		
		System.out.println(args.length);
		
		for (int a = 0; a < args.length; a++) {
			for(int b = 0; b < args[a].length; b++) {
				try {
					Object n = args[a][b];
					type(n);
				} catch (NullPointerException N) {
					System.err.print(N);
					System.out.println(N);
					continue;
				} finally {
					Object n = args[a][b];
					type(n);
				}
				continue;
			}
		}
	}
	
	public static void thereforBArray(Object[][][] args) {
	for(int a = 0; a < args.length; a++) {	
		for (int b = 0; b < args[a].length; b++) {
			for(int c = 0; c < args[a][b].length; c++) {
				try {
					Object n = args[a][b][c];
					type(n);
				} catch (NullPointerException N) {
					System.err.print(N);
					System.out.println(N);
					continue;
				} finally {
					Object n = args[a][b][c];
					type(n);
				}
				continue;
			}
		}
	}
	}

}
