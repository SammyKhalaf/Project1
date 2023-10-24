import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;


/**
 * The Car class represents a vehicle with properties including its make, year, and price.
 * It implements the Comparable interface to support comparison between Car objects.
 *
 * CSC 1351 Programming Project No 1
 * Section 002
 *
 * This class allows you to create Car objects, access their properties, and compare them based on make and year.
 *
 * @author Aiden Kirk Sammy Khalaf
 * @since 10/23/23
 */
 class Car implements Comparable<Car> {

    private String make;
    private int year;
    private int price;

    public Car(String make, int year, int price) {
        this.make = make;
        this.year = year;
        this.price = price;
        //presents variables for car class
    }
    /**
     * <This method gets make of the car>
     *
     * CSC 1351 Programming Project No <1> * Section <002>
     *
     * @author <Sammy Khalaf, Aiden Kirk>
     * @since <10/23/23>
     *
     */
    public String getMake() {
        return make;
        //constructor for make
    }
    /**
     * <This method gets year of the car>
     *
     * CSC 1351 Programming Project No <1> * Section <002>
     *
     * @author <Sammy Khalaf, Aiden Kirk>
     * @since <10/23/23>
     *
     */
    public int getYear() {
        return year;
        //constructor for year
    }
    /**
     * <This method gets price of the car>
     *
     * CSC 1351 Programming Project No 1 * Section 002
     *
     * @author <Sammy Khalaf, Aiden Kirk>
     * @since <10/23/23>
     *
     */
    public int getPrice() {
        return price;
        //constructor for price
    }

    /**
      * <this method compares the make and year of the cars and places them in alphabetical order>
      *
      * CSC 1351 Programming Project No 1
      * Section 002
      *
      * @author <Sammy Khalaf, Aiden Kirk>
      * @since <10/23/23>
      *
     **/
    public int compareTo(Car other) {
        if (!this.make.equals(other.make)) {
            return this.make.compareTo(other.make);
        } else if (this.year != other.year) {
            return this.year - other.year;
        }
return 0;
    }
    /** comparable compares make then year
//**
* returns the information of car with the following parameters
*
* CSC 1351 Programming Project No 1
* Section 002
*
* @author <Sammy Khalaf, Aiden Kirk>
*  @since <10/23/23>
// *
     **/

    public String toString() {
        return "Make: " + make + "\nYear: " + year + "\nPrice: $" + price;
    }
    //**essentially a return info method that returns the info of each car with these parameters
}
/**
 * The aOrderedList class represents an ordered list of Comparable objects.
 *
 * CSC 1351 Programming Project No 1
 * Section 002
 *
 * This class provides methods to manage a list of Comparable objects, including adding, removing, and iterating through them.
 *
 * @author <Sammy Khalaf Aiden Kirk>
 * @since 10/23/23
 */
class aOrderedList {
    private Comparable[] oList;
    private int listSize;
    private int numObjects;
    private int curr;
    /**
     * This method creates a new aOrderedList with initial values.
     *
     * CSC 1351 Programming Project No 1
     * Section 002
     *
     * @author Sammy Khalaf Aiden Kirk
     * @since 10/23/23
     */
    public aOrderedList() {
        numObjects = 0;
        listSize = 50;
        oList = new Comparable[listSize];
        curr = -1;
    }
    /**
     * This method adds a new object to the ordered list.
     *
     * CSC 1351 Programming Project No 1
     * Section 002
     *
     * @author Sammy Khalaf Aiden Kirk
     * @since 10/23/23
     */
    public void add(Comparable newObject) {
        if (numObjects == listSize) {
            resizeArray();
        }

        int index = 0;
        while (index < numObjects && newObject.compareTo(oList[index]) >= 0) {
            index++;
        }
        for (int i = numObjects; i > index; i--) {
            oList[i] = oList[i - 1];
        }
        oList[index] = newObject;
        numObjects++;
    }
    /**
     * This method gets the number of objects in the ordered list.
     *
     * CSC 1351 Programming Project No 1
     * Section 002
     *
     * @author Sammy Khalaf Aiden Kirk
     * @since 10/23/23
     */
    public int size() {
        return numObjects;
    }
    /**
     * This method gets the object at the specified index.
     *
     * CSC 1351 Programming Project No 1
     * Section 002
     *
     * @author Sammy Khalaf Aiden Kirk
     * @since 10/23/23
     */
    public Comparable get(int index) {
        return oList[index];
    }
    /**
     * This method checks if the ordered list is empty.
     *
     * CSC 1351 Programming Project No 1
     * Section 002
     *
     * @author Sammy Khalaf Aiden Kirk
     * @since 10/23/23
     */
    public boolean isEmpty() {
        return numObjects == 0;
    }
/**
 * this method allows the list to be adjusted as well as the number of objects in the array to be reduced.
 *
 * CSC 1351 Programming Project No 1
 * Section 002
 *
 * @author <Aiden Kirk, Sammy Khalaf>
 * @since 10/23/23
**/

    public void remove() {
        if (curr >= 0 && curr < numObjects) {
            for (int i = curr; i < numObjects - 1; i++) {
                oList[i] = oList[i + 1];
            }
            oList[numObjects - 1] = null; // Set the last element to null
            numObjects--; // Decrease the count
            curr--; // Adjust the current position

        }
    }

    public void reset() {
        curr = -1;
    }

    /**
 * compares the next car to the previous car and allows for the current position to be modified and returned to the list.
 *
 * CSC 1351 Programming Project No 1
 * Section 002
 *
 * @author <Aiden Kirk, Sammy Khalaf
 * @since 10/23/23
 *
     **/
    public Comparable next() {
        if (curr < numObjects - 1) {
            curr++;
            return oList[curr];
        }
        return null;
    }

    public boolean hasNext() {
        return curr < numObjects - 1;
    }

    /**
 * allows the size of the array to be doubled so that new cars can be added to the list
 *
 * CSC 1351 Programming Project No 1
 * Section 002
 *
 * @author <Aiden Kirk, Sammy Khalaf
 * @since 10/23/23
     **/
    private void resizeArray() {
        listSize *= 2; // Double the size of the array
        Comparable[] newArray = new Comparable[listSize];
        System.arraycopy(oList, 0, newArray, 0, numObjects);
        oList = newArray;
    }

    /**
// * this method reads the number of objects in the array list as well as prints out the number of cars in the list
// *
// * CSC 1351 Programming Project No 1
// * Section 002
// *
// * Aiden Kirk, Sammy Khalaf
// * 10/23/23
**/

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Number of cars: " + numObjects + "\n");
        for (int i = 0; i < numObjects; i++) {
            result.append(oList[i].toString()).append("\n");
        }
        return result.toString();
    }
}

/**
 * The Prog01_aOrderedList class is the main class for this program. It reads car data from an input file,
 * adds and removes cars from an ordered list, and writes the final car list to an output file.
 *
 * CSC 1351 Programming Project No 1
 * Section 002
 *
 * This class reads car data from an input file, adds cars to an ordered list, removes cars based on make and year,
 * and writes the final car list to an output file.
 *
 * @author Aiden Kirk Sammy Khalaf
 * @since 10/23/23
 */

public class Prog01_aOrderedList {
    public static void main(String[] args) {
        Scanner inputScanner = GetInputFile("Enter the input filename");
        aOrderedList carList = new aOrderedList();

        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            String[] parts = line.split(",");
            if (parts.length >= 4) {
                String operation = parts[0];
                if (operation.equals("A")) {
                    String make = parts[1];
                    int year = Integer.parseInt(parts[2]);
                    int price = Integer.parseInt(parts[3]);
                    Car car = new Car(make, year, price);
                    carList.add(car);
                } else if (operation.equals("D")) {
                    // Handle delete operation based on make and year
                    String make = parts[1];
                    int year = Integer.parseInt(parts[2]);

                    // Loop to find and delete the car
                    carList.reset();
                    while (carList.hasNext()) {
                        Car car = (Car) carList.next();
                        if (car.getMake().equals(make) && year == car.getYear()) {
                            carList.remove();
                            break; // Remove only one matching car
                        }
                    }
                }
            }
        }
        inputScanner.close();

        try {
            PrintWriter outputWriter = GetOutputFile("Enter the output filename");
            outputWriter.print(carList.toString());
            outputWriter.close();
            System.out.println("Data written to the output file.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
 * This method is grabbing the name of the input file as well as creating a new scanner within that file for user input
 *
 * CSC 1351 Programming Project No 1
 * Section 002
 *
 * Aiden Kirk, Sammy Khalaf
 * 10/23/23
**/
    public static Scanner GetInputFile(String UserPrompt) {
        Scanner scanner = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(UserPrompt + ": ");
            Scanner userInput = new Scanner(System.in);
            String fileName = userInput.nextLine();

            File file = new File(fileName);
            if (file.exists()) {
                try {
                    scanner = new Scanner(file);
                    validInput = true;
                } catch (FileNotFoundException e) {
                    System.out.println("Error opening the file: " + e.getMessage());
                }
            } else {
                System.out.println("File specified <" + fileName + "> does not exist. Would you like to continue? <Y/N> ");
                String continueResponse = userInput.nextLine();
                if (!continueResponse.equalsIgnoreCase("Y")) {
                    userInput.close();
                    System.exit(0);
                }
            }
        }
        return scanner;
    }

    /**
 * <This method is grabbing the name of the output file while also checking to see if the
      file entered by the user exists, if it does exist, the printwriter file is created and returned.>
 *
* CSC 1351 Programming Project No 1
 * Section 002
* @author <Aiden Kirk, Sammy Khalaf
 * 10/23/23
**/
    public static PrintWriter GetOutputFile(String UserPrompt) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("output.txt");
        boolean validOutput = false;

        while (!validOutput) {
            System.out.print(UserPrompt + ": ");
            Scanner userInput = new Scanner(System.in);
            String fileName = userInput.nextLine();

            File file = new File(fileName);
            try {
                printWriter = new PrintWriter(file);
                validOutput = true;
            } catch (FileNotFoundException e) {
                System.out.println("Error opening the file: " + e.getMessage());
                System.out.println("Would you like to continue? <Y/N> ");
                String continueResponse = userInput.nextLine();
                if (!continueResponse.equalsIgnoreCase("Y")) {
                    userInput.close();
                    throw e;
                }
            }
        }
        return printWriter;
    }
}
