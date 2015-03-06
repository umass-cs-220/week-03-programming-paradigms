package cs220.db;

public interface Database {
    public String add(String key, String value);
    public String get(String key);
    public String remove(String key);
}
