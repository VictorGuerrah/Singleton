import javax.xml.crypto.Data;

public class Database {

    private Database() {};

    private static Database database = new Database();

    public static Database getDatabase() {
        return database;
    }

    private String connection;
    private String password;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
