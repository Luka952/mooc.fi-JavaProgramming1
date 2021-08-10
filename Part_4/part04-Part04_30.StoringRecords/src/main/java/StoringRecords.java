
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try(Scanner sc=new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String [] s=sc.nextLine().split(",");
                int a=Integer.valueOf(s[1]);
                persons.add(new Person(s[0], a));
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return persons;

    }
}
