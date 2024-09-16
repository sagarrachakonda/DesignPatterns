package Singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private String url;
    private String username;
    private String password;


    // create a private constructor
    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){

        if(instance == null){
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
