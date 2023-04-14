package arrays;

import java.util.Arrays;

public class ArrayStudy {

    public static void main(String[] args) {
        double[] studentsGrade = new double[4];
        
        for (int i = 0; i < studentsGrade.length; i++) {
            studentsGrade[i] = Math.random();
        }

        System.out.println(Arrays.toString(studentsGrade));
        
        double total = 0;
        for (double grade: studentsGrade) {
            total += grade;
        }

        System.out.println(total);
    }

}
