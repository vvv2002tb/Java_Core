package LambdaExpressions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        // Ví dụ về biểu thức lambda đơn giản để kiểm tra xem một số có chia hết cho một số khác hay không
        BiFunction<Integer, Integer, Boolean> sum = (a, b) -> a % b == 0;
        System.out.println(sum.apply(10, 2)); // true
        System.out.println(sum.apply(10, 3)); // false
        // Một số ví dụ đơn giản khác 
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 2)); // 12
       
        Function<Integer, Integer> square = (a) -> a * a;

        // multiple statements
        Function<Integer, Integer> add10 = (x) -> {
            x += 5;
            x += 5;
            return x;
        };

        // invoke lambda
        boolean result = add10.apply(10) == 20;
        System.out.println(result); // true

        

        /*
         * BiFunction<T, U, R> // 2 parameters, 1 return
         * Function<T, R> // 1 parameter, 1 return
         * Predicate<T> // 1 parameter, boolean return
         * Consumer<T> // 1 parameter, void return
         * Supplier<T> // 0 parameter, T return
         */
        
         Function<String, Integer> f = (s) -> s.length();
         printResultOfLambda(f);

         // passing lambda directly
         printResultOfLambda(s -> s.length());

        

    }

    // passing lambda to method
    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("Happy new year 3000!"));
    }

}
