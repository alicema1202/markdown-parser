//imports junit Assert methods
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//imports junit library
import org.junit.*;
//creates new class called MarkdownParseTest
public class MarkdownParseTest {
    //tester method
    @Test
    //method called addition that returns void
    public void addition() {
        //check that 2 is equal to 1 + 1
        assertEquals(2, 1 + 1);
    }
    @Test

    public void testFile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);

        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com","some-page.html"));
    }
    @Test
    public void testFile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> empty = new ArrayList<>();

        assertEquals(MarkdownParse.getLinks(content), empty);
    }

    @Test

    public void testFile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> empty = new ArrayList<>();

        assertEquals(MarkdownParse.getLinks(content), empty);
    }

    @Test
    //error
    public void testFile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> empty = new ArrayList<>();

        assertEquals(MarkdownParse.getLinks(content), empty);
    }

    @Test
    //error
    public void testFile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> empty = new ArrayList<>();

        assertEquals(MarkdownParse.getLinks(content), empty);
    }

    @Test
    //error
    public void testFile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> empty = new ArrayList<>();

        assertEquals(MarkdownParse.getLinks(content), empty);
    }

    @Test
    //error
    public void testFile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> empty = new ArrayList<>();

        assertEquals(MarkdownParse.getLinks(content), empty);
    }
    @Test
    public void fail() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        
        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com","some-page.html"));
    }

}