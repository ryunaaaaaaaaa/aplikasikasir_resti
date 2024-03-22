/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanujikom;
import java.util.Scanner;
/**
 *
 * @author OWNER
 */
public class Latihanujikom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int harga;
           double diskon , bespot ,bayar;
           
           Scanner keyboard=new Scanner(System.in);
           System.out.println("Harga Barang: ");
           harga=keyboard.nextInt();
           System.out.println("Diskon: ");
           diskon=keyboard.nextInt();
           bespot=(diskon/100) *harga;
           bayar=harga - bespot;
           
           System.out.println("Harga Barang : Rp. "+ harga);
           System.out.println("Diskon :"+ diskon +" % ");
           System.out.println("Diskon (Rp) : Rp. "+ bespot);
             
        }
    }  // TODO code application logic here
    
    

