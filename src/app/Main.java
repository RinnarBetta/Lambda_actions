import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Анонімний клас, що реалізує MathOperation для додавання
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Результат додавання (5 + 3): " + addition.operate(5, 3));

        // Лямбда-вираз для перетворення рядка у верхній регістр
        StringManipulator toUpperCase = input -> input.toUpperCase();
        System.out.println("Перетворення 'hello world' у верхній регістр: " + toUpperCase.manipulate("hello world"));

        // Використання посилання на метод countUppercase як аргумент для Function
        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;
        System.out.println("Кількість великих літер у 'Hello World': " + uppercaseCounter.apply("Hello World"));

        // Supplier для генерації випадкового числа від 1 до 100
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Випадкове число від 1 до 100: " + randomSupplier.get());
    }
}
