import java.io.*;
import java.util.Scanner;

public class PRU04E02_Ivan_Cabellos {

    public static void main(String[] args) {

        BufferedReader br;
        BufferedWriter bw;

        /*
        int emp_no = 7-1; //Registers [0 to 6]
        int birth_date = 17-8; //[7 to 16]
        int first_name = 28-18; //[17 to 27]
        int last_name = 42-29; //[28 to 41]
        int gender = 49 - 43; //[42 to 48]
        int hire_date = 59 - 50; //[49 to 58]
        */

        int[] emp_no = new int[] {0, 5};
        int[] birth_date = new int[] {6, 15};
        int[] first_name = new int[] {16, 26};
        int[] last_name = new int[] {27, 40};
        int[] gender = new int[] {41, 47};
        int[] hire_date = new int[] {48, 57};


        Scanner sc = new Scanner(System.in);

        try {
            bw = new BufferedWriter(new FileWriter("database.txt"));
            br = new BufferedReader(new FileReader("file.txt"));

            String linea;

            while (br.readLine() != null){
                linea = br.readLine();

                for (int i = 0; i < 6; i++) {

                    switch (i){
                        case 0:
                            separador(linea, emp_no[0], emp_no[1]);
                            break;

                        case 1:
                            separador(linea, birth_date[0], birth_date[1]);
                            break;

                        case 2:
                            separador(linea, first_name[0], birth_date[1]);
                            break;

                        case 3:
                            separador(linea, last_name[0], birth_date[1]);
                            break;

                        case 4:
                            separador(linea, gender[0], gender[1]);
                            break;

                        case 5:
                            separador(linea, hire_date[0], hire_date[1]);
                            break;
                    }

                }

            }

        }catch (IOException e){

        }

    }

    public static String separador(String linea, int inicio_caracter, int final_caracter){



        return null;
    }

}
