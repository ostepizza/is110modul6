import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

/**
 * Contains methods to find a related car manufacturer based on model as input,
 * generate a random number between two values and a method that checks
 * if you're born in the nineties.
 *
 * @author M. Nilsen
 * @version 1.0
 */
public class Modul6Demo
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> carModel;
    private Random randomGenerator;

    /**
     * Constructs the required HashMap and Random objects for the class
     */
    public Modul6Demo()
    {
        // initialise instance variables
        carModel = new HashMap<>();
        loadCarManufacturerList();
        randomGenerator = new Random();
    }
    
    
    /**
     * Loads a list of car models
     */
    private void loadCarManufacturerList() {
        carModel.put("Golf","Volkswagen");
        carModel.put("Galant","Mitsubishi");
        carModel.put("Accord","Honda");
        carModel.put("Civic","Honda");
        carModel.put("200SX ","Nissan");
        carModel.put("Corolla","Toyota");
    }
    
    
    
    /**
     * Finds the manufacturer of a car model
     *
     * @param  String The model you wish to know the manufacturer of
     */
    public void findCarManufacturer(String model)
    {
        // put your code here
        if (carModel.get(model) != null) {
        System.out.println(model + " is made by " + carModel.get(model));
    } else {
        System.out.println("This model is not in the database");
    }
    
    }
    
    /**
     * Generates a random number between two chosen numbers.
     * 
     * @param int numberMin - The lower number you want a random value between
     * @param int numberMax - The higher number you want a random value between
     */
    public void randomNumber(int numberMin, int numberMax) {
        int generatedNumber = randomGenerator.nextInt(numberMax + 1 - numberMin) + numberMin;
        System.out.println("Your random number between " + numberMin + " and " + numberMax + " is " + generatedNumber);
    }
    
    /**
     * Tells you whether you are born in the nineties or not
     * 
     * @param int birthyear Your birthyear to be "analyzed"
     */
    public void ninetiesKid(int birthyear) {
        HashSet<Integer> yearlist = new HashSet<Integer>();
        
        int birthyearnumber = 1990;
        while (birthyearnumber >= 1990 && birthyearnumber <= 1999) {
           yearlist.add(birthyearnumber);
           birthyearnumber++;
        }

        if (yearlist.contains(birthyear)) {
            System.out.println("You are born in the 90's!");
        } else {
            System.out.println("You are not born in the 90's :(");
        }
    }
}
