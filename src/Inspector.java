import java.lang.reflect.Method;


public class Inspector {
	public static void inspect(Object myObject, boolean recurse) throws IllegalArgumentException, IllegalAccessException {
		Class classObject = myObject.getClass();
		
		String declaringClass = myObject.getClass().getSimpleName();
		System.out.println("The name of the declaring class is: " + declaringClass);
		
		String superClass = myObject.getClass().getSuperclass().getSimpleName();
		System.out.println("The name of the immediate superclass is: " + superClass);
		
		//name of interfaces implemented
		inspectInterfaces(classObject);
		inspectMethods(classObject);
		
		
	}
	
	public static void  inspectInterfaces(Class myObject){
		Class[] interfaces= myObject.getInterfaces();
		String className = myObject.getSimpleName();
		if (interfaces.length != 0) {
			for (Class i : interfaces) {
				String interfaceName = i.getSimpleName();
				System.out.println(className + " implements: " + interfaceName);
			
				//print methods and fields?
			}
		}
		else {
			System.out.println(className + " does not implement any interfaces");
		}
	}
	
	public static void inspectMethods(Class myObject) {
		Method[] methods = myObject.getDeclaredMethods();
		String className = myObject.getSimpleName();
		if (methods.length != 0) {
			int count = 0;
			for (Method m: methods){
				String methodName = m.getName();
				System.out.println("Method " + count + ": " + methodName);
				
				//Output Exceptions
				Class[] exceptions = m.getExceptionTypes();
				if (exceptions.length != 0) {
					for(Class e: exceptions) {
						System.out.println(methodName + " throws exception: " + e.getSimpleName());
					}
				}
				else {
					System.out.println(methodName + " does not throw any exceptions");
				}
				
				//Output Parameter types
				
				
				
				
				
				
				count++;
				
				
			}
		}
		else {
			System.out.println(className + " does not have any methods");
		}
	}
	
	
	
	
}
