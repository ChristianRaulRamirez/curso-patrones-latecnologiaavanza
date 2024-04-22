package com.lta.patronescreacionales.singleton.ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class EventRegistrationManager {

    // Variable estática para almacenar la única instancia del Singleton
    private static EventRegistrationManager instance;

    // Lista para almacenar los participantes registrados
    private List<String> participants;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private EventRegistrationManager() {
        participants = new ArrayList<>();
    }

    // Método estático para obtener la única instancia del Singleton
    public static synchronized EventRegistrationManager getInstance() {
        // Si la instancia aún no ha sido creada, la creamos
        if (instance == null) {
            instance = new EventRegistrationManager();
        }
        return instance;
    }

    // Método para registrar un nuevo participante
    public void registerParticipant(String participantName) {
        participants.add(participantName);
        System.out.println("Se registró a " + participantName + " en el evento");
    }

    // Método para obtener la lista de participantes registrados
    public List<String> getParticipants() {
        return participants;
    }

}
