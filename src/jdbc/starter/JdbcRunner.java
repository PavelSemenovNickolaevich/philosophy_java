package jdbc.starter;

import jdbc.starter.util.ConnectionManager;
import org.postgresql.Driver;

import java.sql.SQLException;

public class JdbcRunner {

    public static void main(String[] args) throws SQLException {

        Class<Driver> driverClass = Driver.class;
//        String sqlCreate = "create table if not exists info(" +
//                "id serial primary key," +
//                "data text not null )";
 //       String sqlInsert = "insert into table ";
        String sqlUpdate = "update flight_repository.public.info " +
                "set data = 'TestTest' where id=5";
        try (var connection = ConnectionManager.open()) {
            var statement = connection.createStatement();
            System.out.println(connection.getSchema());
            System.out.println(connection.getTransactionIsolation());
            var executeResult = statement.execute(sqlUpdate);
            System.out.println(executeResult);
            System.out.println(statement.getUpdateCount());
        }
    }
}
