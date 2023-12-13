package Math_Representations;

/**
 * Recurrently call Therefor.type() because Object A is not defined and not null else 
 * write more bespoke autonomy and logic
 */

public class Because {

	public static void because(Object...objects) {
		
		if (objects != null) {
			try {
				while (objects != null) {
					Therefor.therefor(objects);
				}
			} catch (NullPointerException E) {
				System.err.println(E);
			} finally {
				System.out.println("There was an issue:\t" + System.err + "\n....Please refer to developers for debugging");
				try {
					Therefor.type(objects);
				} catch (Exception E) { 
					System.err.println(E);
					System.out.println("There was an issue:\t" + System.err + "\n" + E +"\r\n....Please refer to developers for debugging");
				} finally {
					System.out.println(System.getenv(objects.toString()));
				}
			}
		}
	}
}