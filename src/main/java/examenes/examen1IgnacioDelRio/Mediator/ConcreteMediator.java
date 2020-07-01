package examenes.examen1IgnacioDelRio.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<ConcreteColleagueTeamA> teamA = new ArrayList<>();
    private List<ConcreteColleagueTeamB> teamB = new ArrayList<>();
    @Override
    public void send(String msg, Colleague colleague) {
        switch (colleague.equipo){
            case "A":
                for(int i = 0; i < teamA.size(); i++){
                    if(teamA.get(i).getNombre() != colleague.getNombre()){
                        teamA.get(i).receive(msg);
                    }
                }
                break;
            case "B":
                for(int i = 0; i < teamB.size(); i++){
                    if(teamB.get(i).getNombre() != colleague.getNombre()){
                        teamB.get(i).receive(msg);
                    }
                }
                break;
        }
    }

    public void addColleague(Colleague colleague){
        switch (colleague.equipo){
            case "A":
                teamA.add((ConcreteColleagueTeamA) colleague);
                break;
            case "B":
                teamB.add((ConcreteColleagueTeamB) colleague);
                break;
        }
    }
}
