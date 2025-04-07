package core;

import java.util.ArrayList;

public class Ward {
    private int id;
    private ArrayList<Patient> patients;

    public Ward(int id) {
        this.id = id;
        this.patients = new ArrayList<>();
    }
    
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    
}
