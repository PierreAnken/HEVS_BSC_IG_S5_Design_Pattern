package State;

public class Main {
    public static void main(String[] args) {
        // Une liste d'états
        //
        // Abstract state: définit toutes les actions possibles
        // Concrete state: chaque action retourne un nouvel état selon l'état de la classe
        // Context: classe ayant un état qui change, une liste d'état et une liste d'action != action sur le context

        Context_CafeMachine cafeMachine = new Context_CafeMachine();

        cafeMachine.coinInserted(1);

        cafeMachine.powerUp();

        cafeMachine.coinInserted(1);
        cafeMachine.coinInserted(2);
        cafeMachine.coinInserted(0.3);
        cafeMachine.buttonPushed(false);
        cafeMachine.coinInserted(0.5);

        cafeMachine.resetButton();
        cafeMachine.buttonPushed(false);

        cafeMachine.cupRemoved();
        System.out.println("\n ==== \n");

        cafeMachine.coinInserted(5);
        cafeMachine.buttonPushed(true);
        cafeMachine.resetButton();

    }
}
