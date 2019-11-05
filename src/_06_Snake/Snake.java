package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		// 1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		// 2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		// 1. use a switch statement to check on the currentDirection
		// of the snake and calculate its next x and y position.

		Location currentLoc = getHeadLocation();

		// System.out.println("X: " + currentLoc.x + " Y: " + currentLoc.y);

		int nextX = 0;
		int nextY = 0;
		
		switch (currentDirection) {
		case UP:
			nextX = currentLoc.x;
			nextY = currentLoc.y-=1;
			break;
		case DOWN:
			nextX = currentLoc.x;
			nextY = currentLoc.y+=1;
			break;
		case RIGHT:
			nextX = currentLoc.x+=1;
			nextY = currentLoc.y;
			break;
		case LEFT:
			nextX = currentLoc.x-=1;
			nextY = currentLoc.y;
			break;
		}

		Location newLoc = new Location(nextX, nextY);
		SnakeSegment newSS = new SnakeSegment(newLoc, BODY_SIZE);

		//System.out.println("NextX: " + nextX);
		//System.out.println("NextY: " + nextY);

		// 2. Iterate through the SnakeSegments in reverse order
		// 2a. Update each snake segment to the location of the segment
		// in front of it.

		for (int i = snake.size() - 1; i >= 1; i--) {
			SnakeSegment sg = snake.get(i);
			SnakeSegment next = snake.get(i - 1);
			
			sg.setLocation(next.getLocation());
			
			

				
		}

		// 3. set the location of the head to the new location calculated in step 1
		snake.set(0, newSS);
		head = newSS;
		
		// 4. set canMove to true
		canMove = true;
	}

	public void setDirection(Direction d) {
		
		// 1. set the current direction equal to the passed in Direction only if canMove
		// is true.
		if (canMove) {
			currentDirection = d;
		}
		// set canMove equal to false.
		canMove = false;
	
		// make sure the snake cannot completely reverse directions.

	}

	public void reset(Location loc) {
		// 1. clear the snake

		// 2. set the location of the head

		// 3. add the head to the snake

	}

	public boolean isOutOfBounds() {
		// 1. complete the method so it returns true if the head of the snake is outside
		// of the window
		// and false otherwise

		return false;
	}

	public boolean isHeadCollidingWithBody() {
		// 1. complete the method so it returns true if the head is located
		// in the same location as any other body segment

		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		// 1. complete the method so it returns true if the passed in
		// location is located on the snake

		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
