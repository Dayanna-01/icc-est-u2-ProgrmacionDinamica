import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {
 
    // Método tradicional (ineficiente)
    public int getFibonacci(int n) {
        if (n <= 1) return n;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    // Método con programación dinámica usando memoización
    public int getFibonacciPD(int n) {
        Map<Integer, Integer> caching = new HashMap<>();
        return getFibonacciPDHelper(n, caching);
    }

    // Método auxiliar para memoización
    private int getFibonacciPDHelper(int n, Map<Integer, Integer> cache) {
        if (n <= 1)
            return n;
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int result = getFibonacciPDHelper(n - 1, cache) + getFibonacciPDHelper(n - 2, cache);
        cache.put(n, result);
        return result;
    }
}
