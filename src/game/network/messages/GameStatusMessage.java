package game.network.messages;

import java.io.Serializable;

public class GameStatusMessage implements Serializable{
	protected GameStatus status;
	public GameStatusMessage(GameStatus status) {
		this.status = status;
	}
	public GameStatus getStatus() {
		return status;
	}
	public void setStatus(GameStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"("+status.getPhase()+")";
	}
}
