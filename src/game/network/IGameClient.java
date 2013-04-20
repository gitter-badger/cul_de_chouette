package game.network;

import game.network.messages.GameStatus;
import game.network.messages.NetPlayer;

public interface IGameClient {
	public void updatePlayerList(IGameService theGame);
	public void updateGameList(IGameService theGame);
	public void updateGamePhase(IGameService theGame);
	public void handleInvit(NetPlayer creator, NetPlayer guest);
	public void handleJoinAnswer(NetPlayer creator, NetPlayer guest);
	public void handleStatus(GameStatus status);
	public void handleStart(GameStatus status);
	public void handleRefresh();
	public void handleWaitingNotification(NetPlayer player);
}
