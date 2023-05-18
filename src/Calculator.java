import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;
    /*деление на ноль вызывает исключение runtime
    добавим тенарный оператор с условием, если знаменатель равен ноль
    то отдавать в результат вычислений ноль
    */
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : -1 * x;

    public Predicate<Integer> isPositive = x -> x > 0;
    public Consumer<Integer> println = System.out::println;
}
