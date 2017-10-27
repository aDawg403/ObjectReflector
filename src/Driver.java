
public class Driver {
	public static void main(String args[]) throws Exception {
		ClassA a = new ClassA();
		
		try {
			Inspector.inspect(a, true);
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}catch(IllegalAccessException e) {
			System.out.println(e);
		}
	}
}
