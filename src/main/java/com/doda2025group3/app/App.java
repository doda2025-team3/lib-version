package com.doda2025group3.app;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IOException {

        VersionUtil versionUtil = new VersionUtil();

        System.out.println("Version: " + versionUtil.getVersion());
        System.out.println("Artifact id: " + versionUtil.getArtifactId());

    }
}
