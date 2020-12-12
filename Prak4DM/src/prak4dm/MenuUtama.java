/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak4dm;

import java.util.Scanner;



/**
 *
 * @author Bagas
 */
public class MenuUtama {
    
    boolean menuU = true;
    Scanner input = new Scanner(System.in);
    
    datamhs data = new datamhs();
    
    void menu(){
        
        while(menuU){
//            Menu Utama 
            System.out.println("\t\t\t===========================");
            System.out.println("\t\t\t       Data Mahasiswa      ");
            System.out.println("\t\t\t===========================");
            System.out.println("");
            System.out.println("=================================================================================");
            System.out.println("1. Tambah Data\t2. hapus Data\t3. Cari Data\t4. Tampilkan Data\t5. Keluar");
            System.out.println("=================================================================================");
            System.out.println("");
            System.out.print("Silahkan Pilih No Menu : ");
            System.out.print("");

//          Sub menu
            switch(input.nextLine()){
                case "1":{
                    data.add();
//                  untuk tambah data lagi 
                    boolean nambah = true;
                    while(nambah){
                        System.out.print("TAMBAH DATA LAGI ? y/n : ");
                        char choice = input.nextLine().charAt(0);
                        switch (choice){
                            case'y':
                                data.add();
                                break;

                            case'n':
                                nambah = false;
                                break;

                            default:
                                System.out.println("");
                                System.out.println("\t\t\tPILIH y/n !!!");
                                System.out.println("");

                        }
                    }
                    break;
                }
                
                case "2":{
                    data.remove();
                    break;
                }
                
                case "3":{
                    data.search();
                    break;
                }
                
                case "4":{
                    data.data();
                    break;
                }
                
                case "5":{
                    menuU = false;
                    break;
                } 
//              Jika tidak memasukan no menu dengan benar maka akan muncul
//              pesan dibawah ini
                default:{
                    System.out.println("");
                    System.out.println("MASUKAN NO MENU DENGAN BENAR !!!");
                    System.out.println("");
                }
            }
        }
        
    }
    
}
