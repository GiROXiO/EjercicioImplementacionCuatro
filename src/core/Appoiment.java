package core;

public class Appoiment {
    private JuniorDoctor doctor;
    private Patient patient;

    public Appoiment(JuniorDoctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    public JuniorDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(JuniorDoctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
