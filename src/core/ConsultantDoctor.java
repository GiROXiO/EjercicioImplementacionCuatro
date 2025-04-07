package core;

public class ConsultantDoctor extends Doctor{
    private Team leaderOf;

    public ConsultantDoctor(int id) {
        super(id);
        this.leaderOf = null;
    }

    public Team getLeaderOf() {
        return leaderOf;
    }

    public void setLeaderOf(Team leaderOf) {
        this.leaderOf = leaderOf;
    }
}
