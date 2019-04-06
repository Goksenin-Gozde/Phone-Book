/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05160000241_05160000163.proje2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
public class Bilgi {
    private String adSoyad;
    private ArrayList <String> telefonNumaralari = new ArrayList<>();
    
    
    
    public Bilgi(String adSoyad,String... telefonNolari){
    //Numaraları array'e eklemek için kişinin numara sayısını alıyoruz//
    this.adSoyad = adSoyad;
    this.telefonNumaralari.addAll(Arrays.asList(telefonNolari));
        
    }
    public Bilgi(String line){
    EnhancedStringTokenizer str = new EnhancedStringTokenizer(line,",");
    this.adSoyad = str.nextToken();
    String no;
    
      no = str.nextToken();
    
    while(no != null){
    telefonNumaralari.add(no);
    try{
    no = str.nextToken();
    }
    catch(NoSuchElementException e) {
        break;
    }
    }
    
    
    
    }
    
    
    
    @Override
     public String toString(){
     return this.getAdSoyad() + " :"+ this.getTelefonNumaralari();
     }      

    /**
     * @return the adSoyad
     */
    public String getAdSoyad() {
        return adSoyad;
    }

    /**
     * @param adSoyad the adSoyad to set
     */
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    /**
     * @return the telefonNumaralari
     */
    public ArrayList <String> getTelefonNumaralari() {
        return telefonNumaralari;
    }

    /**
     * @param telefonNumaralari the telefonNumaralari to set
     */
    public void setTelefonNumaralari(ArrayList <String> telefonNumaralari) {
        this.telefonNumaralari = telefonNumaralari;
    }
}
