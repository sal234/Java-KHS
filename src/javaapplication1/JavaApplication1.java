/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author salman
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nim,nama;
        double ipk=0;
        int imk=0,jmk=0,jnilai=0,jsks=0, nilaiakhir;
        double jbobot=0;
        String huruf[]=new String[10];
        double bobot[]=new double[10];
        String ket[]=new String[10];
        String matkul[]=new String [10];
        int matsks[]=new int[10];
        double abs[]=new double[10];
        double tugas[]=new double[10];
        double uts[]=new double[10];
        double uas[]=new double[10];
        
        String sLagi;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("----------- MULAI -----------");
        System.out.println("--------### REVIEW-JAVA-2 ###--------");
        System.out.println("### PEMROGRAMAN VISUAL ###");
        System.out.println("### Program Kartu Hasil Studi ###");
        System.out.println("----------- INPUT -----------");
        System.out.println("NIM : "); nim = keyboard.nextLine();
        System.out.println("Nama : "); nama = keyboard.nextLine();
        
        do {
            jmk++;
            System.out.print("Mata Kuliah #" + jmk + " : ");matkul[imk] = keyboard.nextLine();
            System.out.print("SKS : "); matsks[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print("Absensi (10%) : "); abs[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print("Tugas (20%) : "); tugas[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print("UTS (30%) : "); uts[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print("UAS (40%) : "); uas[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print(" Input Lagi (y/t) ?"); sLagi = keyboard.nextLine();
            imk++;
        } while (sLagi.equals("y"));
       
        System.out.println("----------- HASIL -------------------------------");
        System.out.println(" NIM : " + nim);
        System.out.println(" Nama : " + nama);
        System.out.println("--------- Daftar Nilai --------");
        System.out.println("No\t MK\t SKS\t Huruf\t Bobot\t Ket");
        System.out.println("-------------------------------------------------");
        for (imk=0;imk<jmk;imk++){
            nilaiakhir =(int) ((abs[imk]*0.1)+(tugas[imk]*0.2)+(uts[imk]*0.3)+(uas[imk]*0.4));
            jsks = jsks + matsks[imk];
 if (nilaiakhir >= 81) {
               huruf[imk]= "A";
               bobot[imk]= 4.00;
               ket[imk]="LULUS";
            }
            else if (nilaiakhir >= 76){
               huruf[imk]= "A-";
               bobot[imk]=3.75;
               ket[imk]="LULUS";
            }
            else if (nilaiakhir >= 71){
               huruf[imk]= "B+";
               bobot[imk]= 3.50;
               ket[imk]="LULUS";
            }
            else if (nilaiakhir >= 66){
               huruf[imk]= "B";
               bobot[imk]= 3.25;
               ket[imk]="LULUS";
            }
            else if (nilaiakhir >= 61){
               huruf[imk]= "B-";
               bobot[imk]=3.00;
               ket[imk]="LULUS";
            }
            else if (nilaiakhir >= 56){
               huruf[imk]= "C+";
               bobot[imk]=2.75;
               ket[imk]="LULUS";
            }
            else if (nilaiakhir >= 56){
                
               huruf[imk]="C";
               bobot[imk]= 2.50;
               ket[imk]="LULUS";
            }
            else{
               huruf[imk]="D";
               bobot[imk]= 2.49;  //TENTUKAN SENDIRI BOBOT TIDAK LULUSNYA
               ket[imk]="TIDAK LULUS";
            }    
            jbobot = jbobot + bobot[imk] * matsks[imk];
            ipk = jbobot/jsks;
            System.out.println("nilaiakhir="+nilaiakhir);     //DIHAPUS AJA CUMAN BUAT LIAT NILAI AKHIR
            System.out.println(imk+1 + "\t"+ matkul[imk]+ "\t" + matsks[imk] + "\t" + huruf[imk] + "\t" + bobot[imk] + "\t" + ket[imk]);
        }       
        System.out.println("-------------------------------------------------");
        System.out.println("Jumlah "+jsks+ "\t" + jbobot);
        System.out.println("IP Semester\t" + ipk);
        System.out.println("----------------- SELESAI -----------------------");
    }
    
}
