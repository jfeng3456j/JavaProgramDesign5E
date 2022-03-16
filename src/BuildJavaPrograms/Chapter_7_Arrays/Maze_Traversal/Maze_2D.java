package BuildJavaPrograms.Chapter_7_Arrays.Maze_Traversal;

import java.util.LinkedList;

public class Maze_2D {

    /*
    * 0 wall
    * 1 = path
    * 2 = destination
    * */
    static int[][] maze = {
            {2,0,1,1}, //-> starting position (0,3)
            {1,1,2,0},
            {0,1,1,1},
    };
    //use it as stack -> first one last out
    static LinkedList<Position> path = new LinkedList<>();
    public static void main (String[] args) {
        Position p = new Position(0, 3);
        path.push(p); //push it to beginning





        while(true) {

            int x = path.peek().getX(); //row
            int y = path.peek().getY(); //col

            //visited
            maze[x][y] = 0;

            //down move row
            if (maze[x+1][y]==2) {
                System.out.println("Move down.You found the exit");
                return;
            }
            else if (maze[x+1][y] == 1) {
                System.out.println("move down");
                path.push(new Position(x+1, y));
                continue;
            }


            //left move the col
            if (maze[x][y-1] == 2) {
                System.out.println("You found the exit");
                return;
            }
            else if (maze[x][y-1] == 1) {
                System.out.println("move left");
                path.push(new Position(x, y-1));
                continue;
            }

            //up move row up
            if (maze[x-1][y]==2) {
                System.out.println("Move up.You found the exit");
                return;
            }
            else if (maze[x-1][y] == 1) {
                System.out.println("move up");
                path.push(new Position(x-1, y));
                continue;
            }

            //right move col+1
            if (maze[x][y+1]==2) {
                System.out.println("Move right.You found the exit");
                return;
            }
            else if (maze[x][y+1] == 1) {
                System.out.println("move right");
                path.push(new Position(x, y+1));
                continue;
            }
        }

    }
}
