package com.myapp.util;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * 读取配置
 * @author 竹
 * date 2017/11/5
 */
public class PageConfig {
    private static Logger logger = Logger.getLogger(PageConfig.class);

    public static final String pages ;
    public static final List<String> list;

    static {
        InputStream resourceAsStream = PageConfig.class.getResourceAsStream("/page.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        pages = properties.getProperty("page");
        list = Arrays.asList(pages.split("\\|"));
    }
}
