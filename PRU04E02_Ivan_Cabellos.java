import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PRU04E02_Ivan_Cabellos {

    public static void main(String[] args) {

        BufferedReader br;
        BufferedWriter bw;

        /*
        int emp_no = 7-1; //Registers [1 to 7]
        int birth_date = 17-8; //[17 to 8]
        int first_name = 28-18; //[18 to 28]
        int last_name = 42-29; //[42 to 29]
        int gender = 49 - 43; //[43 to 49]
        int hire_date = 59 - 50; //[50 to 59]
        */

        Scanner sc = new Scanner(System.in);

        try {
            bw = new BufferedWriter(new FileWriter("database.txt"));
            br = new BufferedReader(new FileReader(".."));

            String linea;

            while (br.readLine() != null){
                linea = br.readLine();
            }

        }catch (Exception e){

        }

    }

    public static String separador(String linea, int inicio_caracter, int final_caracter){



        return null;
    }

}
