package org.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Temp {
    private List<String> friends;
    private Map<String,String> menu;

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getMenu() {
        return menu;
    }

    public void setMenu(Map<String, String> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "friends=" + friends +
                ", menu=" + menu +
                ", properties=" + properties +
                '}';
    }
}
