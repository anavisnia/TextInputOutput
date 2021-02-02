package TextInputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // instruction
        /*
        perskaityti duomenis is treju failu po eilute
        suskaldyti eilutes i zodzius
        sudeti viska i bendra sarasa
        surusioti sarasa zodzio trumpejimo tvarka
        visus zodzius surasyti i nauja faila
         */
        try (
                // Input
            FileInputStream fis = new FileInputStream("a.txt");
            FileInputStream fis2 = new FileInputStream("b.txt");
            FileInputStream fis3 = new FileInputStream("c.txt");
            Reader fr = new InputStreamReader(fis, "UTF-8");
            Reader fr2 = new InputStreamReader(fis2, "UTF-8");
            Reader fr3 = new InputStreamReader(fis3, "UTF-8");
            BufferedReader br = new BufferedReader(fr); // skaitys koda po eilute
            BufferedReader br2 = new BufferedReader(fr2);
            BufferedReader br3 = new BufferedReader(fr3);
            // Output
            FileOutputStream fos = new FileOutputStream("d.txt"); // failas kur reikia ikelti info
            Writer fw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
           String st;
           String [] parts;
            List<String> l = new ArrayList();
            while((st = br.readLine()) != null) {
                System.out.println(st); // po eilute spausdina
                for (String s1 : parts = st.split(" ")) {
                    l.add(s1); // ideda i ArrayLista
                }
            }
            System.out.println("-------------------");
            String st2;
            while((st2 = br2.readLine()) != null) {
                System.out.println(st2); // po eilute
                for (String s1 : parts = st2.split(" ")) {
                    l.add(s1); // papildo ArrayLista
                }
            }
            System.out.println("-------------------");
            String st3;
            while((st3 = br3.readLine()) != null) {
                System.out.println(st3); // po eilute
                for (String s1 : parts = st3.split(" ")) {
                    l.add(s1); // papildo ArrayLista
                }
            }
            // surusiavo visa ArrayLista (su duomenemis is pirmo, antro ir trecio teksto)
            l.sort((s1, s2) -> s2.length() - s1.length());
            System.out.println(l);

            // is arraylist'o i d.txt fila
            for(int i = 0; i < l.size(); i++) {
                String fileData = l.get(i).toString();
                fw.write(fileData);
                if( i < l.size() - 1) { // kad nesulipintiu zodzius i viena ilga zodi
                    fw.write(", ");
                }
            }
            fw.close();
            bw.close();
        }catch(IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }

    }
}
