//imports junit Assert methods
import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//imports junit library
//creates new class called MarkdownParseTest
public class MarkdownParseTest {
    @Test
    public void testSnippet1() throws IOException {
        Path fileName = Path.of("Snippet-1.md");
        String content = Files.readString(fileName);
        List<String> links = List.of("`google.com","google.com","ucsd.edu");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void testSnippet2() throws IOException {
        Path fileName = Path.of("Snippet-2.md");
        String content = Files.readString(fileName);
        List<String> links = List.of("b.com","a.com(())", "example.com");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void testSnippet3() throws IOException {
        Path fileName = Path.of("Snippet-3.md");
        String content = Files.readString(fileName);
        List<String> links = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(links, MarkdownParse.getLinks(content));
    }



}