import java.util.Random;

public class Main {
    public static void main(String[] args) {

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



        System.out.println("Sundays Temperature:    " + SundayWeather+"F");
        System.out.println("Mondays Temperature:    " + MondayWeather+"F");
        System.out.println("Tuesdays Temperature:   " + TuesdayWeather+"F");
        System.out.println("Wednesdays Temperature: " + WednesdayWeather+"F");
        System.out.println("Thursdays Temperature:  " + ThursdayWeather+"F");
        System.out.println("Fridays Temperature:    " + FridayWeather+"F");
        System.out.println("Saturdays Temperature:  " + SaturdayWeather+"F");

        System.out.println();
        
        
        

    }
}