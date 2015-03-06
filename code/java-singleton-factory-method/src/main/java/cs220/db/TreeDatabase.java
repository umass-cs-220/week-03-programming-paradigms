package cs220.db;

import java.util.*;

class TreeDatabase implements Database {
    private Map<String, String> db;
    
    TreeDatabase() {
	db = new TreeMap<String, String>();
    }

    public String add(String key, String value) {
	db.put(key, value);
	return value;
    }

    public String get(String key) {
	return db.get(key);
    }

    public String remove(String key) {
	return db.remove(key);
    }
}
