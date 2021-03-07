import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class TestTableJDBC extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String password = "mama071991";
        String user = "postgres";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
             resultSet = statement.executeQuery("SELECT name FROM test_table");
             while (resultSet.next()){
                 printWriter.println(resultSet.getString("name"));
             }
            connection.close();
            statement.close();
        }catch (SQLException  throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
