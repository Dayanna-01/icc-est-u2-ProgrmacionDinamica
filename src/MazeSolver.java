import java.util.List;

public interface MazeSolver {
    List<Cell> getPath(boolean[][] grid,Cell star, Cell end);
}