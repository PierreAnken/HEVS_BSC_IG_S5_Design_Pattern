package State;

public interface InterfaceState{

    public InterfaceState resetButton();
    public InterfaceState cupRemoved();
    public InterfaceState buttonPushed(boolean error);
    public InterfaceState coinReturn();
    public InterfaceState coinInserted(double amount);
    public InterfaceState powerUp();
}
