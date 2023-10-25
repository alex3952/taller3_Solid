public class AppWeb {
    private Authentication authentication;
    private DatabaseConnection databaseConnection;

    public AppWeb(Authentication authentication, DatabaseConnection databaseConnection) {
        this.authentication = authentication;
        this.databaseConnection = databaseConnection;
        // Lógica
    }

    public void connectToDatabase() {
        // Utilice this.databaseConnection para conectarse a la base de datos
        // Lógica
    }
}

