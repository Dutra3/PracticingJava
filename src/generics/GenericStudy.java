package generics;

import java.util.Arrays;
import java.util.List;

public class GenericStudy {

    public static void main(String[] args) {

        // Without Generics
        BoxObject boxA = new BoxObject();
        boxA.save(2.3);

        Double something = (Double) boxA.open();
        System.out.println(something);

        // With Generics
        Box<String> boxB = new Box<>();
        boxB.save("Segredo");

        String somethingB = boxB.open();
        System.out.println(somethingB);

        Box<Double> boxC = new Box<>();
        boxC.save(4.4);

        Double somethingC = boxC.open();
        System.out.println(somethingC);

        // Generics With Specific Type
        // BoxNumber<String> boxD = new BoxNumber<>(); This way its wrong, just Number Type
        BoxNumber<Double> boxD = new BoxNumber<>();
        boxD.save(2.3);
        System.out.println(boxD.open());

        BoxNumber<Integer> boxE = new BoxNumber<>();
        boxE.save(2);
        System.out.println(boxD.open());

        // Generics in Methods
        List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String lastLang = (String) ListUtil.getLastItem(langs);
        System.out.println(lastLang);

        Integer lastNum = (Integer) ListUtil.getLastItem(nums);
        System.out.println(lastNum);

        String lastLang2 = ListUtil.getLast(langs);
        System.out.println(lastLang2);

        Integer lastNum2 = ListUtil.getLast(nums);
        System.out.println(lastNum2);

        // Generics in Key/Value
        Pairs<Integer, String> lotteryResult = new Pairs<>();

        lotteryResult.add(1, "Maria");
        lotteryResult.add(2, "Joao");
        lotteryResult.add(3, "Bia");
        lotteryResult.add(4, "Douglas");
        lotteryResult.add(2, "Julia");

        System.out.println(lotteryResult.getValue(1));
        System.out.println(lotteryResult.getValue(4));
        System.out.println(lotteryResult.getValue(2));
    }
}
