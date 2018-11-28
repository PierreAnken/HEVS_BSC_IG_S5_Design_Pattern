package Composite;

public class Leaf_Player extends AbstractComponent_PlayerElement{

    private String name;
    public Leaf_Player(String name){
        this.name = name;
    }

    public String getName(){
        return "\t"+name;
    }
    public void Shoot(){
        System.out.println("\t"+name+" shooted!");
    }
    public void Cry(){
        System.out.println("\t"+name+" is crying.");
    }
    public void SimulateInjury(){
        System.out.println("\t"+name+" simulate an injury...");
    }
    public void EnterField(){
        System.out.println("\t"+name+" enter the field.");
    }
}
