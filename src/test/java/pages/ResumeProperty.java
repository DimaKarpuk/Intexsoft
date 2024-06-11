package pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ResumeProperty {
    public static String getProperty(String key){
        Properties prop = new Properties();
        try {
            File file = new File("src/test/resources/karpukSetResume.properties");
            prop.load(new FileReader(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}