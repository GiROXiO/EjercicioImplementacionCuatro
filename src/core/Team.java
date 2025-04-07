package core;

import java.util.ArrayList;

public class Team {
    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList<JuniorDoctor> doctors;
    private ArrayList<Patient> patients;

    public Team(int id, ConsultantDoctor teamLeader) {
        this.id = id;
        this.teamLeader = teamLeader;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public void addJuniorDoctor(JuniorDoctor jd){
        this.doctors.add(jd);
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

    public ConsultantDoctor getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(ConsultantDoctor teamLeader) {
        this.teamLeader = teamLeader;
    }

    public ArrayList<JuniorDoctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<JuniorDoctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    
}
