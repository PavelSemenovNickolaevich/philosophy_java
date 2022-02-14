package jdbc.starter;

import jdbc.starter.util.ConnectionManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.SQLException;

public class BlobRunner {

    public static void main(String[] args) throws IOException, SQLException {
//        blob - bytea
//        clob - TEXT
        getImage();
 //       saveImage();
    }

    private static void getImage() throws SQLException, IOException {
        var sql = "select image from flight_repository.public.aircraft where id = ?";
        try (var connection = ConnectionManager.get();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, 1);
            var resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                var image = resultSet.getBytes("image");
                Files.write(Path.of("resources", "boing_new.jpg"), image, StandardOpenOption.CREATE);
            }
        }
    }

    private static void saveImage() throws SQLException, IOException {
        var sql = "update  flight_repository.public.aircraft set image = ?" +
                "where id = 1";
        try (var connection = ConnectionManager.get();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setBytes(1, Files.readAllBytes(Path.of("resources", "boing.jpg")));
            preparedStatement.executeUpdate();
        }
    }

//    private static void saveImage() throws SQLException, IOException {
//        var sql = """
//                UPDATE aircraft
//                SET image = ?
//                WHERE id = 1
//                """;
//        try (var connection = ConnectionManager.open();
//             var preparedStatement = connection.prepareStatement(sql)) {
//            connection.setAutoCommit(false);
//            var blob = connection.createBlob();
//            blob.setBytes(1, Files.readAllBytes(Path.of("resources", "boing777.jpg")));
//
//            preparedStatement.setBlob(1, blob);
//            preparedStatement.executeUpdate();
//            connection.commit();
//        }
//    }
}
