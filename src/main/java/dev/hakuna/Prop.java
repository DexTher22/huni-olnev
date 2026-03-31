package dev.hakuna;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Prop {

    public static String GetFileName() {
        try {
            return tryGetFileName();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static String tryGetFileName() throws IOException {
        Properties pro = new Properties();
        String configFileName = "Program.config";
        InputStream inputStream = new FileInputStream(configFileName);
        pro.load(inputStream);
        return pro.getProperty("Filename");
    }
}
