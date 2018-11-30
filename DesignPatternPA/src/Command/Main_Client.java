package Command;

public class Main_Client {

    public static void main(String[] args) {

        // Client: genere les fonctions concrètes et les ajoute dans la liste de l'invoker
        // Commands: interface avec execute() et undo()
        // Invoker: contient la dernier commande pour le undo et la liste des commandes
        // Concret command: contient le receiver et l'action a effectuer dessus avec execute() et undo()
        // Receiver : objet qui définit les actions réelles

        Invoker_Game game = new Invoker_Game();
        Receiver_Car car = new Receiver_Car();

        game.setCommand(0,new Command_Forward(car));
        game.setCommand(1,new Command_Right(car));
        game.setCommand(2,new Command_Backward(car));
        game.setCommand(3,new Command_Left(car));


        // TODO SETUP

        game.pushKey(2);
        game.pushKey(2);
        game.pushKey(3);
        game.pushKey(2);
        game.pushKey(0);
        game.pushKey(1);
        game.undo();


    }
}
