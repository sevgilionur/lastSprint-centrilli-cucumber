package com.centrilli.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private static Properties properties = new Properties();

    static{

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();

        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);
    }
}
