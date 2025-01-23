package org.example.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String, Object> settings = new HashMap<>();
    private static ConfigManager instance = new ConfigManager();
    private ConfigManager(){
    }

    public Object getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, Object value) {
        settings.put(key, value);
    }

    public static ConfigManager getInstance() {
        return instance;
    }

    public static void setInstance(ConfigManager instance) {
        ConfigManager.instance = instance;
    }


}
