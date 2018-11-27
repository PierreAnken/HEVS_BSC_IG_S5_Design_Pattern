package State_1.state;

public interface State {

    void coinInserted();
    void coinReturn();
    void rightAmountEntered();
    void buttonPushed();
    void cupRemoved();
    void problemDetected();
    void resetButton();
}
