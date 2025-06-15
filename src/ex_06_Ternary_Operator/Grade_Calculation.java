package ex_06_Ternary_Operator;

public class Grade_Calculation {

    public static void main(String[] args) {
       // Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail

        int marks = 98;

        String StudenGrade = (marks>=90) ? "A+":(marks>=75)?"A":(marks>=60)?"B":(marks>=40)? "C":"Fail";

        System.out.println("Students Results" +StudenGrade);

    }
}
