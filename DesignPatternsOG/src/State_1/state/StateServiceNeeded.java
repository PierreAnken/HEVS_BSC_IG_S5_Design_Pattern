package State_1.state;

import State_1.context.CoffeeMachine;

public class StateServiceNeeded implements State {

    private CoffeeMachine machine;

    public StateServiceNeeded(CoffeeMachine machine) {
        this.machine = machine;
    }

    public void buttonPushed() {
        System.out.println("Service required");
    }

    public void coinInserted() {
        System.out.println("Service required");
    }

    public void coinReturn() {
        System.out.println("Service required");
    }

    public void cupRemoved() {
        //No coffee was made
    }

    public void problemDetected() {
        //Problem is already detected
    }

    public void resetButton() {
        System.out.println("Resetting the machine.");
        machine.setState(machine.getIdleState());
    }

    public void rightAmountEntered() {
        System.out.println("Service required");
    }
}
