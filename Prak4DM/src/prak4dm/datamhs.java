/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak4dm;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Collections;

/**
 *
 * @author Bagas
 */

public class datamhs {
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> nim = new ArrayList<>();
    ArrayList<Date> tgl = new ArrayList<>();
    ArrayList<Integer> gndr = new ArrayList<>();
    SimpleDateFormat Format = new SimpleDateFormat("dd/MMM/yyyy");
    Scanner input = new Scanner(System.in);
    
    void add(){
        System.out.println("\t\t\t===========================");
        System.out.println("\t\t\t        Tambah Data        ");
        System.out.println("\t\t\t===========================");
        System.out.println("");
        System.out.print("Masukan Nama : ");
        String user = input.next();
        System.out.print("Masukan Nim : ");
        String nims = input.next();
        System.out.println("Masukan Tanggal Lahir:");
        System.out.print("\t1. Tanggal (DD) \t: ");
        int day = input.nextInt();
        System.out.print("\t2. Bulan (MM) \t\t: ");
        int month = input.nextInt();
        System.out.print("\t3. Tahun (YYYY) \t: ");
        int year = input.nextInt();
        Date tanggal = new GregorianCalendar(year, month -1, day).getTime();
        System.out.println("\t\tGender");
        System.out.println("1. Laki-laki\t\t2. Perempuan");
        System.out.print("Pilih Gender : ");
        int gender = input.nextInt();
        nama.add(user);
        nim.add(nims);
        tgl.add(tanggal);
        gndr.add(gender);
//      setelah tambah data selesai akan memunculkan pesan dibawah
        System.out.println("");
        System.out.println("\t\t\tDATA BERHASIL DITAMBAHKAN !!!");
        System.out.println("");
    }
    
    void remove(){
        if(nama.isEmpty() == true){
            System.out.println("");
            System.out.println("\t\t\tBELUM ADA DATA !!!");
            System.out.println("");
        }else {
            System.out.println("");
            System.out.println("\t\t\t==========================");
            System.out.println("\t\t\t        Hapus Data        ");
            System.out.println("\t\t\t==========================");
            System.out.println("");
            System.out.print("Masukan Nim Yang Ingin Dihapus : ");
            String nims = input.next();
            int index = Collections.binarySearch(nim, nims);
            if(index < 0){
                System.out.println("");
                System.out.println("\t\tDATA TIDAK DITEMUKAN !!!");
                System.out.println("");
            }else{
                nama.remove(index);
                nim.remove(index);
                tgl.remove(index);
                gndr.remove(index);
                System.out.println("");
                System.out.println("\t\t\tDATA BERHASIL DIHAPUS !!!");
                System.out.println("");
            }
        }
    }
    
    void search(){
        if(nama.isEmpty() == true){
            System.out.println("");
            System.out.println("\t\t\tBELUM ADA DATA !!!");
            System.out.println("");
        }else{
                System.out.println("");
                System.out.println("\t\t\t=========================");
                System.out.println("\t\t\t        Cari Data        ");
                System.out.println("\t\t\t=========================");
                System.out.println("\t\t\t\tBerdasarkan : ");
                System.out.println("");
                System.out.println("\t\t1. Nim\t\t2. Gender\t\t3. Keluar");
                System.out.print("Masukan No Menu : ");

                switch(input.nextLine()){
                    case "1":{
                        System.out.println("");
                        System.out.print("Masukan Nim Yang Ingin Dicari : ");
                        String nims = input.nextLine();
                        int index = Collections.binarySearch(nim, nims);
                        if(index < 0){
                            System.out.println("");
                            System.out.println("\t\tDATA TIDAK DITEMUKAN !!!");
                            System.out.println("");
                        }else{
            //              int ke string 
                            String kel = (gndr.get(index) == 1) ? "Laki-laki" : "Perempuan";
            //              string ke date
                            String tanggal = Format.format(tgl.get(index));
                            System.out.println("");
                            System.out.println("\t\t\tNama \t\t: " + nama.get(index));
                            System.out.println("\t\t\tNim \t\t: " + nim.get(index));
                            System.out.println("\t\t\tTanggal Lahir \t: " + tanggal);
                            System.out.println("\t\t\tGender \t\t: " + kel);
                            System.out.println("");
                        }break;
                    }
                    case "2":{
                        System.out.println("");
                        System.out.print("\t\t Masukan Gender (1. Laki-Laki 2.Perempuan) : ");
                        int jenis = input.nextInt();
                        for(int x = 0; x < gndr.size(); x++){
                            if(gndr.get(x) == jenis){
                //              int ke string 
                                String kel = (gndr.get(x) == 1) ? "Laki-laki" : "Perempuan";
                //              string ke date
                                String tanggal = Format.format(tgl.get(x));
                                System.out.println("");
                                System.out.println("\t\t\tNama \t\t: " + nama.get(x));
                                System.out.println("\t\t\tNim \t\t: " + nim.get(x));
                                System.out.println("\t\t\tTanggal Lahir \t: " + tanggal);
                                System.out.println("\t\t\tGender \t\t: " + kel);
                                System.out.println("");
                            }else{
                                System.out.println("");
                                System.out.println("\t\tDATA TIDAK DITEMUKAN !!!");
                                System.out.println("");
                            }
                        }break;    
                    }
                    
                }
        }
        
            
    }
    
    void data(){
//      jika data belum ada maka akan memunculkan pesan dibawah
        if(nama.size() > 0){
            for(int x = 0; x < nama.size(); x++){
//              int ke string 
                String kel = (gndr.get(x) == 1) ? "Laki-laki" : "Perempuan";
//              string ke date
                String tanggal = Format.format(tgl.get(x));
                System.out.println("");
                System.out.println("\t\t\t=========================");
                System.out.println("\t\t\t       Mahasiswa " + (x+1));
                System.out.println("\t\t\t=========================");
                System.out.println("");
                System.out.println("\t\t\tNama \t\t: " + nama.get(x));
                System.out.println("\t\t\tNim \t\t: " + nim.get(x));
                System.out.println("\t\t\tTanggal Lahir \t: " + tanggal);
                System.out.println("\t\t\tGender \t\t: " + kel);
                System.out.println("");
            }
            System.out.println("Jumlah Mahasiswa Adalah : " + nama.size());
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("\t\t\tBELUM ADA DATA. !!!");
            System.out.println("");
        }
        
    }
                    
}
