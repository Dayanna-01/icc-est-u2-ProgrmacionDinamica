public class App {
    public static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Fibonaccio Recursivo");
        long start = 0;
        int result = ejerciciosPD.getFibonacci(5);
        long end = 0;
        long duration = end-start;
        System.out.println("Resultado: " + result + "en tiempo: " + duration);

        System.out.println("Fibonacci recursivo caching");
        start = 0;
        result = ejerciciosPD.getFibonacci(5);
        end = 0;
        duration = end -start;
        System.out.println("Resultado: " + result + "en tiempo: " + duration);
    }

    public static void runMaze(int n) {
        
    }
}
