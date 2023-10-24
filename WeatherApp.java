import java.util.Random;
import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {

        Scanner userInp = new Scanner(System.in);
        
        while(true) {
            System.out.println();
            System.out.println("What would you like to do?");
            String askUser = userInp.nextLine().toUpperCase();
            System.out.println(" ");
            
            if(askUser.equals("q")) {
                break;
            }
            else if(askUser.equals("OPTIONS")) {
                printOptions();

            }


        }

        Random random = new Random();
        

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

        String[] Conditions = {"Rainy", "Clear", "Partly Cloudy", "Thunderstorms", "Flooding", "Hurricane", "Hail"};

        String SundayCondition = Conditions[random.nextInt(6)];
        String MondayCondition = Conditions[random.nextInt(6)];
        String TuesdayCondition = Conditions[random.nextInt(6)];
        String WednesdayCondition = Conditions[random.nextInt(6)];
        String ThursdayCondition = Conditions[random.nextInt(6)];
        String FridayCondition = Conditions[random.nextInt(6)];
        String SaturdayCondition = Conditions[random.nextInt(6)];

        System.out.println("What day would you like the temperature for?");
        String Day = userInp.nextLine();

        switch(Day) {
            case "Sunday": System.out.println("Sundays Temperature:    " + SundayWeather+"F" + " And it is currently "+ SundayCondition);
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
    }

    static void assignTemperature(int DayTemp){
        Random random = new Random();
        DayTemp = random.nextInt(100);
        

    }

    static void printOptions(){
        String[] Options = {"[Day of the Week]: Provides temperature of specific day", "Week Average: Shows average temperature of week."};

        for(int i = 0; i < Options.length; i++) {
            System.out.println(Options[i]);
        }
    }
}