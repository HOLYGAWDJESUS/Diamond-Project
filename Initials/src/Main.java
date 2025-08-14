import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(2);
    World.setSize(40, 33);


    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(1,17,North,1000);
    Robot l = new Robot(1,17,North,1000);
    Robot t = new Robot(37,1,North,1000);
    Robot m = new Robot(37,33,North,1000);
    Robot useless = new Robot(1,17,North,1000);
  
	
    // examples of commands you can invoke on a Robot
    diagonalLeft(l, 16);
    diagonalRight(r, 16);
    moveForward(l, 4);
    moveForward(r, 4);
    turnRight(l);
    r.turnLeft();
    moveForward(l, 16);
    moveForward(r, 16);
    diagonalLeftNew(t, 3);
    diagonalRightNew(m, 3);
    m.turnLeft();
    turnRight(t);
    moveForward(t, 13);
    moveForward(m, 13);
    useless.putBeeper();


    



  
  }

  public static void moveForward(Robot r, int step) {
    for (int i = 0; i < step; i++) {
    r.move();
    r.putBeeper();
    }
  }

  public static void turnRight(Robot r) {
    r.turnLeft(); r.turnLeft(); r.turnLeft();
  }

  public static void diagonalRightNew(Robot r, int step) {
    for (int i = 0; i < step; i++) {
      
      r.move();
      r.turnLeft();
      r.move();
      r.putBeeper();
      turnRight(r);
    }
  }

  public static void diagonalLeftNew(Robot r, int step) {
    for (int i = 0; i < step; i++) {
      
      r.move();
      turnRight(r);
      r.move();
      r.putBeeper();
      r.turnLeft();
    }
  }

  public static void diagonalLeft(Robot r, int step) {
    for (int i = 0; i < step; i++) {
      r.move();
      r.move();
      r.turnLeft();
      r.move();
      r.putBeeper();
      turnRight(r);
    }
  }
    public static void diagonalRight(Robot r, int step) {
    for (int i = 0; i < step; i++) {
      r.move();
      r.move();
      turnRight(r);
      r.move();
      r.putBeeper();
      r.turnLeft();
    }

  }
   


 
  
}