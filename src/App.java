import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjerciciosPD();
        runMaze();
    }

    private static void runMaze() {
        boolean[][] predefinedMaze = {
            {true,true,true,true},
            {false,true,true,true},
            {true,true,false,false},
            {true,true,true,true}
        };
        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberiton Cargado");
        maze.printMaze();
        
        Cell star = new Cell(0, 0);
        Cell end = new Cell(3, 3);
        
        List<MazeSolver> solvers = Arrays.asList(new MazeSolverRecursivo(),new MazeSolverRecursivoFour());
        MazeSolver solver1 = solvers.get(0);
        List<Cell> path1;
        path1 = solver1.getPath(maze.maze, star, end);

        System.out.println("\nCamino encontrado con MazeSolverRecurivo:");
        System.out.println(path1.reversed());
        
        MazeSolver solver2 = solvers.get(1);
        List<Cell> path2;
        path2 = solver2.getPath(maze.maze, star, end);
        System.out.println("\nCamino encontrado con MazeSolverRecursivoFour:");
        System.out.println(path2.reversed());
        
        
    }

    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Ejercicio fibonaci recursivo");
        long start = System.nanoTime();
        long resultado= ejerciciosPD.getFibonaci(100);
        long end = System.nanoTime(); 
        long duration = end-start;
        double durationSegundos = duration / 1_000_000_000.0;
        System.out.println("Resultado: " + resultado + " en tiempo = " + duration + " ns (" + durationSegundos + " segundos)");


        
        System.out.println("Ejercicio fibonaci recursivo con PD");
        start = System.nanoTime();
        resultado= ejerciciosPD.getFibonaciPD(100);
        end = System.nanoTime(); 
        duration = end-start;
        durationSegundos = duration / 1_000_000_000.0;
        System.out.println("Resultado: " + resultado + " en tiempo = " + duration + " ns (" + durationSegundos + " segundos)");

    }


}