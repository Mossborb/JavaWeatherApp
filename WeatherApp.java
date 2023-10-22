import java.util.Random;
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner userInp = new Scanner(System.in);

        int SundayWeather;
        int MondayWeather;
        int TuesdayWeather;
        int WednesdayWeather;
        int ThursdayWeather;
        int FridayWeather;
        int SaturdayWeather;

        SundayWeather = random.nextInt(101);
        MondayWeather = random.nextInt(100);
        TuesdayWeather = random.nextInt(101);
        WednesdayWeather = random.nextInt(101);
        ThursdayWeather = random.nextInt(101);
        FridayWeather = random.nextInt(101);
        SaturdayWeather = random.nextInt(101); 

        

        System.out.println("What day would you like the temperature for?");
        String Day = userInp.nextLine();

        switch(Day) {
            case "Sunday": System.out.println("Sundays Temperature:    " + SundayWeather+"F");
            break;
            case "Monday": System.out.println("Mondays Temperature:    " + MondayWeather+"F");
            break;
            case "Tuesday": System.out.println("Tuesdays Temperature:   " + TuesdayWeather+"F");
            break;
            case "Wednesday": System.out.println("Sundays Temperature:    " + WednesdayWeather+"F");
            break;
            case "Thursday": System.out.println("Sundays Temperature:    " + ThursdayWeather+"F");
            break;
            case "Friday": System.out.println("Sundays Temperature:    " + FridayWeather+"F");
            break;
            case "Saturday": System.out.println("Sundays Temperature:    " + SaturdayWeather+"F");
            break;
            default: System.out.println("That is not a valid day...");


        }


/*
        
        
        
        System.out.println("Wednesdays Temperature: " + WednesdayWeather+"F");
        System.out.println("Thursdays Temperature:  " + ThursdayWeather+"F");
        System.out.println("Fridays Temperature:    " + FridayWeather+"F");
        System.out.println("Saturdays Temperature:  " + SaturdayWeather+"F");

        System.out.println();
*/
        
        
        
        

    }
}