package core;

import java.util.ArrayList;

public class Hospital {

    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }

    public void addTeam(int teamId, int consultantDoctorId) {
        ConsultantDoctor cd = new ConsultantDoctor(consultantDoctorId);
        Team team = new Team(teamId, cd);
        cd.setLeaderOf(team);
        this.teams.add(team);
    }

    public Team getTeam(int teamId) {
        for (Team team : teams) {
            if (team.getId() == teamId) {
                return team;
            }
        }
        return null;
    }

    public void addJuniorDoctor(Team team, int jdId) {
        JuniorDoctor jd = new JuniorDoctor(jdId);
        jd.setTeam(team);
        team.addJuniorDoctor(jd);
    }

    public void addWard(int wardId) {
        this.wards.add(new Ward(wardId));
    }

    public void addPatient(Ward ward, Team team, int patientId) {
        ward.addPatient(new Patient(patientId, team, ward));
        team.addPatient(new Patient(patientId, team, ward));
    }

    public Ward getWard(int wardId) {
        for (Ward ward : this.wards) {
            if (ward.getId() == wardId) {
                return ward;
            }
        }
        return null;
    }

    public void assignPatientDoctor(Patient patient, int doctorId) {
        patient.addDoctor(this.getDoctor(patient.getTeam().getId() + doctorId));
    }

    public void assignAppoiment(Patient patient, int doctorId) {
        JuniorDoctor doctor = this.getDoctor(patient.getTeam().getId() + doctorId);
        Appoiment apmt = new Appoiment(doctor, patient);
        patient.addAppoiment(apmt);
        doctor.addAppoiment(apmt);
    }

    public Patient getPatient(int patientId) {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getId() == patientId) {
                    return patient;
                }
            }
        }
        return null;
    }

    public JuniorDoctor getDoctor(int doctorId) {
        for (Team team : this.teams) {
            for (JuniorDoctor doctor : team.getDoctors()) {
                if (doctor.getId() == doctorId) {
                    return doctor;
                }
            }
        }
        return null;
    }

    public void numberDoctorsPatient() {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                int c = 0;
                for (Doctor doctor : patient.getDoctors()) {
                    c++;
                }
                System.out.println("Patient " + patient.getId() + " has " + c + " doctors");
            }
        }
    }

    public void numberPatientsTeam() {
        for (Team team : this.teams) {
            int c = 0;
            for (Patient patient : team.getPatients()) {
                c++;
            }
            System.out.println("Team " + team.getId() + " has " + c + " patients");
        }
    }

    public void relationAppoiments() {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                int c = 0;
                ArrayList<JuniorDoctor> doctores = new ArrayList<>();
                for (Appoiment appoiment : patient.getAppoiments()) {
                    c++;
                    doctores.add(appoiment.getDoctor());
                }
                System.out.println("Patient " + patient.getId() + " has " + c + " appoiments");
                for (JuniorDoctor doctor : doctores) {
                    System.out.println("Patient " + patient.getId() + " has an appoiment with the doctor " + doctor.getId());
                }
            }
        }
    }
}
