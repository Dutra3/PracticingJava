package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceStudy {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> sum = (ac, n) -> ac + n;

        int total = nums.stream().reduce(sum).get();
        System.out.println(total);

        int total2 = nums.parallelStream().reduce(100, sum); // this way will return 945 because which parallel will start with 100
        System.out.println(total2);

        int total3 = nums.stream().reduce(100, sum);
        System.out.println(total3);

        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Joao", 6.1);
        Student s3 = new Student("Gabriel", 8.1);
        Student s4 = new Student("Bia", 10);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        Predicate<Student> approved = s -> s.grade >= 7;
        Function<Student, Double> grades = s -> s.grade;
        BinaryOperator<Double> summation = (acc,n) -> acc + n;

        students.stream()
                .filter(approved)
                .map(grades)
                .reduce(summation)
                .ifPresent(System.out::println);
    }
}
