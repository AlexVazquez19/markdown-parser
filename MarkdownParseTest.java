import static org.junit.Assert.*; //imports the assert library from JUnit
import org.junit.*; //imports the JUnit library as a whole

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    
    @Test //tells JUnit that the following method is a unit test
    public void Addition() { //test method
        //Asserts that the first and second arguments should be equal
        assertEquals(2, 1 + 1);  
    }

    @Test
    public void testGetLinks() throws IOException {
        assertEquals(List.of("https://something.com","some-thing.html"),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    @Test
    public void testGetLinks2() throws IOException {
        assertEquals(List.of("https://something.com","some-thing.html"),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md"))));
    }

    @Test
    public void testGetLinks3() throws IOException {
        assertEquals(List.of(),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))));
    }

    @Test
    public void testGetLinks4() throws IOException {
        assertEquals(List.of("google.com"),
            MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md"))));
    }
}


