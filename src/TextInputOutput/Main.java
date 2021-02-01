package TextInputOutput;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
        // instruction
        /*
        perskaityti duomenis is treju failu po eilute
        suskaldyti eilutes i zodzius
        sudeti viska i bendra sarasa
        surusioti sarasa zodzio rumpejimo tvarka
        visus zodzius surasyti i nauja faila
         */
        try (
            FileInputStream fis = new FileInputStream("a.txt");
            FileInputStream fis2 = new FileInputStream("b.txt");
            FileInputStream fis3 = new FileInputStream("c.txt");
            Reader fr = new InputStreamReader(fis, "UTF-8");
            Reader fr2 = new InputStreamReader(fis2, "UTF-8");
            Reader fr3 = new InputStreamReader(fis3, "UTF-8");
            BufferedReader br = new BufferedReader(fr); // skaitys koda po eilute
            BufferedReader br2 = new BufferedReader(fr2);
            BufferedReader br3 = new BufferedReader(fr3);

        ) {
           String s;
            while((s = br.readLine()) != null) {
                System.out.println(s); // po eilute spausdina
            }
            System.out.println("-------------------");
            String s2;
            while((s2 = br2.readLine()) != null) {
                System.out.println(s2); // po eilute
            }
            System.out.println("-------------------");
            String s3;
            while((s3 = br3.readLine()) != null) {
                System.out.println(s3); // po eilute
            }
//            int b;
//            while((b = fr.read()) != -1) {
//                char c = (char) b;
//                System.out.println(c);
//                fos.write(b);
//            }
        }catch(IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }




        /*
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        FileOutputStream fos = null;
        BufferedWriter bw = null;
        Writer fw = null;


        try {
            fos = new FileOutputStream("d.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Failo nepavyko gauti: " + ex);
            ex.printStackTrace();
        }
        try{
            fw = new OutputStreamWriter(fos, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Neapvyko pakeisti failo:" + ex);
            ex.printStackTrace();
        }
        bw = new BufferedWriter(fw);

         */
    }
}
