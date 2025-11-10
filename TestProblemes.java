import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestProblemes {

    @Test
    void testProblema1a() {

        System.setIn(new java.io.ByteArrayInputStream("3\nsol\nordenador\ncable\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema1.main(new String[]{});

        assertEquals("[sol, ordenador, cable] -> [3, 9, 5]", outContent.toString().trim());
    }

    @Test
    void testProblema1b() {

        System.setIn(new java.io.ByteArrayInputStream("1\n1\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema1.main(new String[]{});

        assertEquals("[1] -> [1]", outContent.toString().trim());
    }

    @Test
    void testProblema2a() {
        
        System.setIn(new java.io.ByteArrayInputStream("2\ncacatua\ncotxe\nc\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema2.main(new String[]{});

        assertEquals("[2, 1]", outContent.toString().trim());
    }

    @Test
    void testProblema2b() {
        
        System.setIn(new java.io.ByteArrayInputStream("3\ncacatua\nx\ncotxe\nw\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema2.main(new String[]{});

        assertEquals("[0, 0, 0]", outContent.toString().trim());
    }

    @Test
    void testProblema3a() {
        
        System.setIn(new java.io.ByteArrayInputStream("3\nacatua\ncotxe\nc\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema3.main(new String[]{});

        assertEquals("[true, false, true]", outContent.toString().trim());
    }

    @Test
    void testProblema3b() {
        
        System.setIn(new java.io.ByteArrayInputStream("0\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema3.main(new String[]{});

        assertEquals("[]", outContent.toString().trim());
    }

    @Test
    void testProblema4a() {
        
        System.setIn(new java.io.ByteArrayInputStream("3\nprograma\npro\nram\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema4.main(new String[]{});

        assertEquals("[true, true, true]\n[false, true, false]\n[false, false, true]", outContent.toString().trim());
    }

    
    @Test
    void testProblema4b() {
        
        System.setIn(new java.io.ByteArrayInputStream("2\npro\nram\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema4.main(new String[]{});

        assertEquals("[true, false]\n[false, true]", outContent.toString().trim());
    }


    @Test
    void testProblema5a() {
        
        System.setIn(new java.io.ByteArrayInputStream("3\njava\nc\npython\nhola\nadeu\nbon\nzoo\nanimal\ngos\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema5.main(new String[]{});

        assertEquals("[0, 1]\n[1, 1]\n[2, 1]", outContent.toString().trim());
    }
       
    @Test
    void testProblema5b() {
        
        System.setIn(new java.io.ByteArrayInputStream("2\nj\nj\np\np\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema5.main(new String[]{});

        assertEquals("[0, 1]\n[1, 1]", outContent.toString().trim());
    }
}
