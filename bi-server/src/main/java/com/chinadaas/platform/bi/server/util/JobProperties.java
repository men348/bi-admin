package com.chinadaas.platform.bi.server.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xie on 16/7/29.
 */
public class JobProperties {

    public static String getProperties(String key) {
        Properties properties = new Properties();
        InputStream in = JobProperties.class.getClassLoader().getResourceAsStream("job.properties");
        try {
            properties.load(in);
            String value = properties.getProperty(key);
            return value;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getJobFilePath() {
        return getProperties("job.file.path");
    }

    public static String getTemplatePath() {
        return getProperties("template.path");
    }
}
