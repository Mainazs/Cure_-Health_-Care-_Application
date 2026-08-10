import java.util.*;

class Patient {
    int id;
    String name;
    String disease;

    Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    void display() {
        System.out.println("Patient ID: " + id + ", Name: " + name + ", Disease: " + disease);
    }
}
