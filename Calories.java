public class Calories {
    public static void main(String[] args) {
        String dayName;
        int calorie = 1300;

        for(int dayOfWeek=1; dayOfWeek<=7; dayOfWeek++){
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;

            case 7:
                dayName = "Sunday";
                break;

            default:
                dayName = "Invalid";
                break;
        }
     
        if(dayOfWeek >=2){
            calorie = calorie + 100;
        }
        System.out.println(dayName + ":" + calorie);
    }
    }
}
        
       


