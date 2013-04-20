package game.network.messages;

import game.gui.GameModel.GamePhase;
import game.gui.OnePlayerModel;
import game.network.DicesCombo;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * 
 * 
 */
public class GameStatus implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4683808556021467980L;
	protected NetPlayer creator;
	protected ArrayList<NetPlayer> playerList;
	protected GamePhase phase;
	protected DicesCombo dices;
	public GameStatus(NetPlayer creator, ArrayList<NetPlayer> players, GamePhase phase, DicesCombo dices) {
		this.creator = creator;
		this.playerList = players;
		this.phase = phase;
		this.dices = dices;
	}
	public GameStatus(NetPlayer creator, GamePhase phase, DicesCombo dices) {
		this.creator = creator;
		this.playerList = new ArrayList<NetPlayer>();

		this.phase = phase;
		this.dices = dices;
	}
	public void fromOnePlayerModel(ArrayList<OnePlayerModel> players) {
		
		for (OnePlayerModel aPlayer : players) {
			this.playerList.add(aPlayer.toNet());
		}
	}
	public synchronized NetPlayer getCreator() {
		return creator;
	}
	public synchronized void setCreator(NetPlayer creator) {
		this.creator = creator;
	}
	public synchronized ArrayList<NetPlayer> getPlayerList() {
		return playerList;
	}
	public synchronized void setPlayerList(ArrayList<NetPlayer> playerList) {
		this.playerList = playerList;
	}
	public synchronized GamePhase getPhase() {
		return phase;
	}
	public synchronized void setPhase(GamePhase phase) {
		this.phase = phase;
	}
	public synchronized DicesCombo getDices() {
		return dices;
	}
	public synchronized void setDices(DicesCombo dices) {
		this.dices = dices;
	}
}
