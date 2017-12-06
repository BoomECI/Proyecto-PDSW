package com.BoomECI.javamail.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EmailConfiguration {

    private final Properties properties;

    public EmailConfiguration() {
        this(getDefaults());
    }

    public EmailConfiguration(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    private static Properties getDefaults() {
        InputStream inputStream;
        try {
            Properties properties = new Properties();
            final String file = "javamail.properties";
            final String directory = System.getenv("EMAIL_CONFIG_DIR");
            if (directory == null || directory.trim().isEmpty()) {
                ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                inputStream = classLoader.getResourceAsStream(file);
            } else {
                inputStream = new FileInputStream(directory + File.separator + file);
            }
            properties.load(inputStream);
            inputStream.close();
            return properties;
        } catch (IOException e) {
            throw new RuntimeException("Could not load mail configuration properties", e);
        }
    }

}