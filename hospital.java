
class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void showDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor d : doctors) d.display();
    }

    void showPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient p : patients) p.display();
    }
}
