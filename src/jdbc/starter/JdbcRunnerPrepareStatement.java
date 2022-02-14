package jdbc.starter;

import jdbc.starter.util.ConnectionManager;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JdbcRunnerPrepareStatement {

    public static void main(String[] args) throws SQLException {
//        Long flightId = 2L;
//        var result = getTicketsByFlightId(flightId);
//        System.out.println(result);
        long c1 = 123456789123456L;

       try {
           var result = getFlightsBetween(LocalDate.of(2020, 1, 1).atStartOfDay(), LocalDateTime.now());
           System.out.println(result);
           checkMetaData();
       } finally {
           ConnectionManager.closePool();
       }
    }

    private static void checkMetaData() throws SQLException {
        try (var connection = ConnectionManager.get()) {
            var metaData = connection.getMetaData();
            var catalogs = metaData.getCatalogs();
            while (catalogs.next()) {
                var catalog = catalogs.getString(1);
                var schemas = metaData.getSchemas();
                while (schemas.next()) {
                    var schema = schemas.getString("TABLE_SCHEM");
                    var tables = metaData.getTables(catalog, schema, "%", new String[] {"TABLE"});
                    if (schema.equals("public")) {
                        while (tables.next()) {
                            System.out.println(tables.getString("TABLE_NAME"));
                        }
                    }
                }
            }
        }
    }

    private static List<Long> getFlightsBetween(LocalDateTime start, LocalDateTime end) throws SQLException {
//        String sql = """
//                SELECT id
//                FROM flight
//                WHERE departure_date BETWEEN ? AND ?
//                """;
        String sql = " SELECT id FROM flight_repository.public.flight WHERE departure_date between ? and ?";
        List<Long> result = new ArrayList<>();
        try (var connection = ConnectionManager.get();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setFetchSize(50);
            preparedStatement.setQueryTimeout(10);
            System.out.println(preparedStatement);
            preparedStatement.setTimestamp(1, Timestamp.valueOf(start));
            System.out.println(preparedStatement);
            preparedStatement.setTimestamp(2, Timestamp.valueOf(end));
            System.out.println(preparedStatement);

            var resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                result.add(resultSet.getLong("id"));
            }
        }

        return result;
    }

    private static List<Long> getTicketsByFlightId(Long flightId) throws SQLException {
//        String sql = """
//                SELECT id
//                FROM ticket
//                WHERE flight_id = ?
//                """;
        String sql = " SELECT id FROM flight_repository.public.ticket WHERE flight_id = ?";
        List<Long> result = new ArrayList<>();
        try (var connection = ConnectionManager.get();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, flightId);

            var resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
//                result.add(resultSet.getLong("id"));
                result.add(resultSet.getObject("id", Long.class)); // NULL safe
            }
        }

        return result;
    }
}
