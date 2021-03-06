package checker;

import components.Player;

import game.Game;
import game.GameState;

public class GameStateChecker {

	private Game game;
	
	public GameStateChecker(Game game){ this.game = game; }

	public GameState checkGameState(Player currentTeam) {
		GameState gs = currentTeam.getSet().getKing().isInDanger(game.getBoard());
		return gs;
	}
	
	
}
