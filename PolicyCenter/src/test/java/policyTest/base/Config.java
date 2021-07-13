package policyTest.base;

import common.WebApi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config extends WebApi {

    public Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        prop.load(fis);
        boolean useCloudEnv = Boolean.parseBoolean(prop.getProperty("module0.useCloudEnv"));
        String cloudEnvName = prop.getProperty("module0.cloudEnvName");
        String os = prop.getProperty("module0.os");
        String os_version = prop.getProperty("module0.os_version");
        String browserName = prop.getProperty("module0.browserName");
        String  browserVersion = prop.getProperty("module0.browserVersion");
        String  url = prop.getProperty("module0.url");




        setUp( useCloudEnv , cloudEnvName, os, os_version,browserName,browserVersion, url);


     return prop;

    }
}
