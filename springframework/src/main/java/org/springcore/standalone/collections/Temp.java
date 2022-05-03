package org.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Temp {
    private List<String> friends;
    private Map<String,String> menu;

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
                '}';
    }
}
