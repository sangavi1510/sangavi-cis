package customException;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class FileReaderTest {
    FileReader fileReader = new FileReader();
    @Test
    public void testFileReader() {
        String output = fileReader.readFile("C:\\Users\\KEMA SANGAVI\\Downloads\\sangavi-cis\\Javafiles2");
        Assert.assertEquals("Hello I am Sangavi", output);
    }
    @Test
    public void testFileException() {
        Exception exception = Assert.assertThrows(RuntimeException.class,
                () -> fileReader.readFile("data.txt"));
        Assert.assertEquals(exception.getMessage(), "File not found");
    }
}
