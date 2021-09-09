import java.sql.*;

public class DbUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "U77gfh44ccxv99";
    private static String sql = "SELECT id FROM users";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
    public static void insert(Connection conn, String query, String... params) {
        PreparedStatement preStmt = null;
        try {
            preStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        } catch (SQLException s) {
            s.printStackTrace();
        }
        try {
            ResultSet rs = preStmt.getGeneratedKeys();
            if (rs.next()) {
                long id = rs.getLong(1);
                System.out.println("Inserted ID: " + id);
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }
    }
}
