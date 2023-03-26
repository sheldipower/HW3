import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestLambda {
    public static <T, U> Function<T, U> ternaryOperator(
        Predicate<? super T> condition,
        Function<? super T, ? extends U> ifTrue,
        Function<? super T, ? extends U> ifFalse) {
    return x -> condition.test(x)? ifTrue.apply(x) : ifFalse.apply(x);
}
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer < 0) {
                    return false;
                }
                return true;
            }
        };

        Predicate<Integer> predicate2 = x -> x > 0;

        System.out.println(predicate1.test(-100));
        System.out.println(predicate2.test(200));
    }


    Consumer<String> consumer1 = new Consumer<String>() {
        @Override
        public void accept(String s) {
            System.out.println("Hello" + s + "!");
            consumer1.accept("Мария");
        }
    };
    Consumer<String> consumer2 = s -> {
        System.out.println("Hello" + s + "!");
        consumer2.accept("Констанитин");
    };

    Function<Double, Long> function1 = new Function<Double, Long>() {
        @Override
        public Long apply(Double aDouble) {
            return Math.round(aDouble);
        }
    };
    Function<Double, Long> function2 = Math::round;


    Supplier<Integer> supplier1 = new Supplier<Integer>() {
        @Override
        public Integer get() {
            return (int) Math.random() * 100;
        }
    };

    Supplier<Integer> supplier2 = () -> (int) (Math.random() * 100);



        Function <Integer, Integer> function3 = x -> Math.round(x);
        Function <Integer, Double> function4 = x ->Math.pow(x,2); {
        System.out.println(ternaryOperator(predicate1,function3, function4). apply (4));
    }

}
