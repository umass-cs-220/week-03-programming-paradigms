package cs220;

import cs220.db.*;

public class Main {

    public static void addStuff() {
	Database db = DatabaseFactory.get();
	db.add("John", "23456789");
	db.add("Mia", "98765432");
    }

    public static void getStuff() {
	Database db = DatabaseFactory.get();
	System.out.println(db.get("John"));
	System.out.println(db.get("Mia"));
    }
    
    public static void main(String[] args) {
	addStuff();
	getStuff();
    }
    
}
