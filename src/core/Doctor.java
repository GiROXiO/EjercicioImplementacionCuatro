package core;

import java.util.ArrayList;

public abstract class Doctor {
    protected int id;
    protected Team team;
    protected ArrayList<Appoiment> appoiments;
    protected ArrayList<Patient> patients;

    public Doctor(int id) {
        this.id = id;
        this.team = null;
        this.appoiments = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public ArrayList<Appoiment> getAppoiments() {
        return appoiments;
    }

    public void setAppoiments(ArrayList<Appoiment> appoiments) {
        this.appoiments = appoiments;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    
}
