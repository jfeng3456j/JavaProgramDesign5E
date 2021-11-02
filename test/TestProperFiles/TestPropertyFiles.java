package TestProperFiles;

import ReadProperties.ReadPropertiesFileMain;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.util.Properties;

import static junit.framework.Assert.assertEquals;

public class TestPropertyFiles {

    ReadPropertiesFileMain rpf = new ReadPropertiesFileMain();
    Properties properties = new Properties();
    FileInputStream file;
    @Test
    public void testProperty() throws Exception{
        file = new FileInputStream(System.getProperty("user.dir") + "/src/resource/config.properties");
        properties.load(file);
        System.out.println(properties.getProperty("username").getClass());
        assertEquals("username", properties.getProperty("username"));
    }
}
