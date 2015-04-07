package checker.moveSystem;

import java.awt.Color;

public class GeneralMove{
	private Displacement displacement;
	private Direction direction;
	
	public GeneralMove(Direction direction, Displacement displacement){
		
		this.direction=direction;
		this.displacement=displacement;
	}

	public boolean isValidMove(Move m, Color c){
		return displacement.isValidMove(m) && direction.isValidMove(m, c);//chain of command design patterns
	}

	public Displacement getDisplacement() { return displacement; }
	public Direction getDirection() { return direction; }
}