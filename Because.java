package Math_Representations;

/**
 * Recurrently call Therefor.type() because Object A is not defined and not null else 
 * write more bespoke autonomy and logic
 */

public class Because {

	public static void main(Object args) {
		
		if (args != null) {
			try {
				while (args != null) {
				Therefor.main(args);
				}
			} catch (NullPointerException E) {
				System.err.println(E);
			} finally {
				System.out.println("There was an issue:\t" + System.err + "\n....Please refer to developers for debugging");
				try {
					Therefor.type(args);
				} catch (Exception E) { 
					System.err.println(E);
					System.out.println("There was an issue:\t" + System.err + "\n" + E +"\r\n....Please refer to developers for debugging");
				} finally {
					System.out.println(System.getenv((String) args));
				}
			}
		}
	}
}