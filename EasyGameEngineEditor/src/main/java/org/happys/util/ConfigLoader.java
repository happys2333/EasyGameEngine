package org.happys.util;

import org.happys.model.Config;
import org.happys.model.uitext.UIText;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Locale;

public final class ConfigLoader {
    private static ConfigLoader instance = new ConfigLoader();
    private static final String configPath = "config.yml";

    public UIText uiText;
    public Config config;


    public ConfigLoader() {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("lang/" + Locale.getDefault() + ".yml");
        uiText = yaml.loadAs(inputStream,UIText.class);
        File configFile = new File(configPath);
        Yaml y = new Yaml();
        if (!configFile.exists()){
            config = new Config();
            try {
                configFile.createNewFile();
                PrintWriter writer = new PrintWriter(configFile);
                y.dump(config,writer);
            }catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                InputStream stream = new FileInputStream(configFile);
                config = y.loadAs(stream,Config.class);
            }catch (FileNotFoundException f){
                f.printStackTrace();
            }

        }
    }

    private void loadConfig(){

    }


    public static ConfigLoader getInstance() {
        return instance;
    }

}

