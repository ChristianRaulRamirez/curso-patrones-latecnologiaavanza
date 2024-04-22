package com.lta.patronescreacionales.singleton.ejemplo1;

public class Main {
    public static void main(String[] args) {
        // Obtenemos la instancia del Singleton
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // Verificamos que ambas instancias sean iguales
        if (connection1 == connection2) {
            System.out.println("Ambas instancias son iguales (Singleton funciona correctamente)");
        } else {
            System.out.println("Error: Singleton no funciona correctamente");
        }

        // Realizamos operaciones con la base de datos
        connection1.connect();
        // ...
        connection1.disconnect();
    }
}


/*
*
* Escenario:

Supongamos que estás desarrollando una aplicación de registro de eventos en la que necesitas una clase para manejar la conexión a una base de datos. Deseas asegurarte de que solo haya una instancia de la clase de conexión a la base de datos en toda la aplicación para evitar conexiones múltiples y redundantes.
Problema:

El problema es que si permites que la aplicación cree múltiples instancias de la clase de conexión a la base de datos, podría resultar en un uso ineficiente de los recursos y podría causar problemas de concurrencia y coherencia de datos.
Solución con el patrón Singleton:

El patrón Singleton garantiza que solo haya una instancia de una clase y proporciona un punto de acceso global a esa instancia. En el contexto del escenario anterior, el Singleton se utilizará para la clase de conexión a la base de datos, asegurando que solo haya una instancia de esa clase en toda la aplicación.
*
* */