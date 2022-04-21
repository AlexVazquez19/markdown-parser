import static org.junit.Assert.*; //imports the assert library from JUnit
import org.junit.*; //imports the JUnit library as a whole

public class MarkdownParseTest { //class declaration
    
    @Test //tells JUnit that the following method is a unit test
    public void Addition() { //test method
        //Asserts that the first and second arguments should be equal
        assertEquals(2, 1 + 1);  
    }
}