import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import org.junit.Test;


public class TestInspect {

	@Test
	public void TestInterfaces() {
		ClassA a = new ClassA();
		Class [] aInterfaces = a.getClass().getInterfaces();
		assertEquals(aInterfaces, Inspector.inspectInterfaces(a.getClass()));
	}
	
	@Test
	public void TestFields() {
		ClassA a = new ClassA();
		Field[] aFields = a.getClass().getDeclaredFields();
		try {
			assertEquals(aFields, Inspector.inspectFields(a.getClass(), a));
	
		}catch(Exception e) {
			
		}
	}	
	
	@Test
	public void TestMethods() {
		fail("Not yet implemented");
	}	
	
	@Test
	public void TestConstructors() {
		fail("Not yet implemented");
	}
	
}
