package core;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }
    
    public void addTeam(int teamId, int consultantDoctorId){
        ConsultantDoctor cd = new ConsultantDoctor(consultantDoctorId);
        Team team = new Team(teamId, cd);
        cd.setLeaderOf(team);
        this.teams.add(team);
    }
    
    public Team getTeam(int teamId){
        for(Team team : teams){
            if(team.getId()==teamId)
                return team;
        }
        return null;
    }
    
    public void addJuniorDoctor(Team team, int jdId){
        
    }
    
    public void addWard(int wardId){
        
    }
    
    public void addPatient(Ward ward, Team team, int patientId){
        
    }
    
    public Ward getWard(int wardId){
        for(Ward ward : this.wards){
            if(ward.getId()==wardId)
                return ward;
        }
        return null;
    }
    
    public void assignPatientDoctor(Patient patient, int id){
        
    }
    
    public void assignAppoiment(Patient patient, int id){
        
    }
    
    public Patient getPatient(int patientId){
        for(Ward ward : this.wards){
            for(Patient patient : ward.getPatients()){
                if(patient.getId()==patientId)
                    return patient;
            }
        }
        return null;
    }
    
    public void numberDoctorsPatient(){
        
    }
    
    public void numberPatientsTeam(){
        
    }
    
    public void relationAppoiments(){
        
    }
}
