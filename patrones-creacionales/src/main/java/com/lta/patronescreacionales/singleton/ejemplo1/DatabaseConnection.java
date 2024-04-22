package com.lta.patronescreacionales.singleton.ejemplo1;

public class DatabaseConnection {

    // Variable estática para almacenar la única instancia del Singleton
    private static DatabaseConnection instance;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private DatabaseConnection() {
        // Aquí puedes inicializar la conexión a la base de datos
    }

    // Método estático para obtener la única instancia del Singleton
    public static DatabaseConnection getInstance() {
        // Si la instancia aún no ha sido creada, la creamos
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Métodos para operaciones con la base de datos
    public void connect() {
        System.out.println("Conectado a la base de datos");
    }

    public void disconnect() {
        System.out.println("Desconectado de la base de datos");
    }

}
