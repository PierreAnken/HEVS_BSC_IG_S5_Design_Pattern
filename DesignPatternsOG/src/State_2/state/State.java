package State_2.state;

public interface State {
	State leave();
	State enter();
	State ask();
	State over();
	State handover();
}
