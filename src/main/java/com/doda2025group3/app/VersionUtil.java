package com.doda2025group3.app;

import java.io.IOException;
import java.util.Properties;

// Part of F1: Create a Version-aware library
// This class can be asked for the version
public class VersionUtil {

    private final Properties properties;

    public VersionUtil() {
        this.properties = loadProperties();
    }

    public Properties loadProperties() {
        Properties prop = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(".properties")){
            if (input==null){
                throw new IllegalStateException("Missing resource: " + ".properties");
            }
            prop.load(input);
            return prop;
        } catch (IOException e){
            throw new IllegalStateException("Failed to load: " + ".properties" + ". Exception: ", e);
        }
    }

    public String getVersion() throws IOException {
        return properties.getProperty("version");
    }

    public String getArtifactId() throws IOException {
        return properties.getProperty("artifactId");
    }

}
