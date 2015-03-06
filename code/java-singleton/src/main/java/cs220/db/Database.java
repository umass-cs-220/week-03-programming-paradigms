package cs220.db;

import java.util.*;

public class Database {
    private static Database db = null;
    
    public static Database get() {
	if (db == null) {
	    db = new Database();
	}
	return db;
    }

    private Map<String, String> map;
    
    private Database() {
	map = new HashMap<String, String>();
    }

    public String add(String key, String value) {
	map.put(key, value);
	return value;
    }

    public String get(String key) {
	return map.get(key);
    }

    public String remove(String key) {
	return map.remove(key);
    }
}
