package core;

import java.util.ArrayList;

public class Patient {
    private int id;
    private Team team;
    private Ward ward;
    private ArrayList<Appoiment> appoiments;
    private ArrayList<Doctor> doctors;

    public Patient(int id, Team team, Ward ward) {
        this.id = id;
        this.team = team;
        this.ward = ward;
        this.appoiments = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
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

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public ArrayList<Appoiment> getAppoiments() {
        return appoiments;
    }

    public void setAppoiments(ArrayList<Appoiment> appoiments) {
        this.appoiments = appoiments;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    
}
