package Composite;

import java.util.ArrayList;

public class Composite_Team extends AbstractComponent_PlayerElement {

    private ArrayList<AbstractComponent_PlayerElement> children = new ArrayList<AbstractComponent_PlayerElement>();
    private String teamName;

    public Composite_Team(String teamName){
        this.teamName = teamName;
    }

    public void add(AbstractComponent_PlayerElement abstractComponent_playerElement){
        children.add(abstractComponent_playerElement);
    }
    public void remove(AbstractComponent_PlayerElement abstractComponent_PlayerElement){
        children.remove(abstractComponent_PlayerElement);
    }

    public void Cry(){
        System.out.println(teamName+" cry now!");
        for (AbstractComponent_PlayerElement playerElement:children) {
            playerElement.Cry();
        }
    }
    public void SimulateInjury(){
        System.out.println(teamName+" simluate injury now!");
        for (AbstractComponent_PlayerElement playerElement:children) {
            playerElement.SimulateInjury();
        }
    }

    public void EnterField(){
        System.out.println(teamName+" enter the field now!");
        for (AbstractComponent_PlayerElement playerElement:children) {
            playerElement.EnterField();
        }
    }

    public String getName(){

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Team: "+teamName);

        for (AbstractComponent_PlayerElement playerElement:children) {
            sBuilder.append(" "+playerElement.getName());
        }

        return sBuilder.toString();
    }
}
