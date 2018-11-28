package Command;

public class Main_Client {

    public static void main(String[] args) {

        // Client: définit des commandes concrete et le lien vers les receivers correspondants
        // Command: interface avec execute() et undo()
        // Invoker: contient la commande en cours et execute les ordre du client
        // Concret command: definit le lien entre l'action du receiver et la commande
        // Receiver : objet qui définit les actions réelles

        Game game = new Game();

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
