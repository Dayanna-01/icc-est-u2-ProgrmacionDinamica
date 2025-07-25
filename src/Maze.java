import java.util.*;

public class Maze {
    boolean[][] maze;
    public Maze(boolean[][] maze){
        this.maze = maze;
    }

    public void printMaze(){
        for(int i =0; i<maze.length;i++){
            for(int j =0;j<maze[0].length;j++){
                System.out.print(maze[i][j] ? " - ":" * ");
            }
            System.out.println();
        }
    }

    public void printMazeVisited(MazeResult path){
        Set<Cell> visited = path.getVisited();
        for(int i =0; i<maze.length;i++){
            for(int j =0;j<maze[0].length;j++){
                Cell current = new Cell(i, j);
            if (visited.contains(current)) {
                System.out.print(" o ");
            } else if (maze[i][j]) {
                System.out.print(" - ");
            } else {
                System.out.print(" * "); 
            }
            }
            System.out.println();
        }
    }

        public void printMazePath(MazeResult path){
        List<Cell> paths = path.getPath();
        Set<Cell> visited = new HashSet<>(paths);
        for(int i =0; i<maze.length;i++){
            for(int j =0;j<maze[0].length;j++){
                Cell current = new Cell(i, j);
            if (visited.contains(current)) {
                System.out.print(" o "); 
            } else if (maze[i][j]) {
                System.out.print(" - ");
            } else {
                System.out.print(" * "); 
            }
            }
            System.out.println();
        }
    }



    
}