package ex_28_Enum;

public class declar {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);

        System.out.println(Project_names.google);
    }

}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Project_names{
    google, restassured, katalon, vwo
}