
public class Driver {
	public static void main(String args[]) throws Exception {
		ClassB b = new ClassB();
		
		try {
			Inspector.inspect(b, true);
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}catch(IllegalAccessException e) {
			System.out.println(e);
		}
	}
}
