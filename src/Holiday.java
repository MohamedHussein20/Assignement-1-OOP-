public class Holiday {
    private String name;
    private int day;
    private String month;
    public static int numberOfDays = 0;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
        numberOfDays++;
    }

    public Holiday(){
        numberOfDays++;
    }

    public boolean isSameMonth(Holiday h1){
       return this.month.equals(h1.month);
    }
    public static int sum = 0;

    public static double avgDate(Holiday[] holidays) {
        int totalDays = 0;
        for (Holiday holiday : holidays) {
            totalDays += holiday.day;
        }
        return (double) totalDays / holidays.length;
    }

    public static void main(String[] args) {

        Holiday independenceDay = new Holiday("Independence Day", 4, "July");
        System.out.println("Holiday: " + independenceDay.name + ", Day: " + independenceDay.day + ", Month: " + independenceDay.month);
        Holiday christmas = new Holiday("Christmas", 25, "December");
        Holiday newYear = new Holiday("New Year", 1, "January");
        System.out.println("Independence Day and Christmas in same month: " + independenceDay.isSameMonth(christmas));
        Holiday[] holidays = {independenceDay, christmas, newYear};
        System.out.println("Average day: " + Holiday.avgDate(holidays));
    }

}


