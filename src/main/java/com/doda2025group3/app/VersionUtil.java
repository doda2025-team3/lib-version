package com.doda2025group3.app;

import java.io.IOException;
import java.util.Properties;

public class VersionUtil {

    public String getVersion() throws IOException {
        final Properties properties = new Properties();
        properties.load(this.getClass(). getClassLoader().getResourceAsStream(".properties"));
        return properties.getProperty("version");
    }

    public String getArtifactId() throws IOException {
        final Properties properties = new Properties();
        properties.load(this.getClass(). getClassLoader().getResourceAsStream(".properties"));
        return properties.getProperty("artifactId");
    }

}
