package com.lta.patronescreacionales.singleton.ejemplo2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Obtenemos la instancia del Singleton
        EventRegistrationManager manager1 = EventRegistrationManager.getInstance();
        EventRegistrationManager manager2 = EventRegistrationManager.getInstance();

        // Verificamos que ambas instancias sean iguales
        if (manager1 == manager2) {
            System.out.println("Ambas instancias son iguales (Singleton funciona correctamente)");
        } else {
            System.out.println("Error: Singleton no funciona correctamente");
        }

        // Registramos algunos participantes
        manager1.registerParticipant("Juan");
        manager1.registerParticipant("María");

        // Obtenemos la lista de participantes desde la otra instancia
        EventRegistrationManager manager3 = EventRegistrationManager.getInstance();
        List<String> participants = manager3.getParticipants();
        System.out.println("Lista de participantes registrados:");
        for (String participant : participants) {
            System.out.println(participant);
        }
    }

}

/*
*
* Escenario:

Imagina que estás desarrollando una aplicación de registro de eventos para un evento deportivo. Quieres tener una clase para gestionar el registro de participantes en el evento, pero solo quieres que exista una única lista de participantes en toda la aplicación.
Problema:

El problema es que si permites que la aplicación cree múltiples instancias de la clase de gestión de registros, podrías terminar con múltiples listas de participantes, lo que causaría inconsistencias en los datos y podría ser difícil de mantener.
Solución con el patrón Singleton:

Utilizar el patrón Singleton garantiza que solo haya una instancia de la clase de gestión de registros en toda la aplicación, lo que asegura que solo haya una lista de participantes y que esta lista sea accesible desde cualquier parte del código.
*
* */
