package lambda;

public class LambdaStudy {

    public static void main(String[] args) {
        Sum sum = new Sum();

        System.out.println(sum.sum(4, 5));

        Sum2 sum2 = new Sum2();
        System.out.println(sum2.sum(4, 5));
    }
}
