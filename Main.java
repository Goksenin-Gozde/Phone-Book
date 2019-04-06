/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05160000241_05160000163.proje2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream("Rehber.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
            System.exit(0);
        }
        DoublyLinkedList list = new DoublyLinkedList();
    while(fileIn.hasNextLine()){
    String Line = fileIn.nextLine();
    Bilgi kisi = new Bilgi(Line);
        
    list.siraliEkle(kisi);
              
    }
    list.listeyiYazdir();
    list.terstenYazdir();
    list.verileniYazdir("Can Manay");
    list.kisiyiSil("Veli Tuz");
    list.listeyiYazdir();
    }
    
}
