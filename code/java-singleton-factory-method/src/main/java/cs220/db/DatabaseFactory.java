package cs220.db;

public class DatabaseFactory {
    private static Database db = null;
    
    public static Database get() {
	if (db == null) {
	    db = new MapDatabase();
	}
	return db;
    }
}
