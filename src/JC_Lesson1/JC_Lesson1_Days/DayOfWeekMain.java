package JC_Lesson1.JC_Lesson1_Days;

public class DayOfWeekMain {

    public static int getWorkingHours(DayOfWeek dayOfWeek) {
        int result = 0;
        for(int i = dayOfWeek.ordinal(); i < dayOfWeek.values().length; i++ )
            result += dayOfWeek.values()[i].getHour();
        return result;
    }


    public static void main(final String[] args) {
        if (getWorkingHours(DayOfWeek.SATURDAY)> 0){
            System.out.println("До выходного осталось : " + getWorkingHours(DayOfWeek.WEDNESDAY) + " часов");
        }else {
            System.out.println("Урраа... Сегодня выходной");
        }

    }
}