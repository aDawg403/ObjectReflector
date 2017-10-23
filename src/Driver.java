
public class Driver {
	public static void main(String args[]) {
		String myStr = new String("Hello World");
		
		try {
			Inspector.inspect(myStr, true);
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}catch(IllegalAccessException e) {
			System.out.println(e);
		}
	}
}
