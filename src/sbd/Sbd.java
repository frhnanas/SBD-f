/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author farhan
 */
public class Sbd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> gaji = new LinkedList<>();
        LinkedList<Integer> stat = new LinkedList<>();
        LinkedList<String> warna = new LinkedList<>();
        LinkedList<Integer> dest = new LinkedList<>();
        warna.add("merah");
        warna.add("Jingga");
        warna.add("Kuning");
        warna.add("Hijau");
        warna.add("Biru");
        warna.add("Nila");
        warna.add("Ungu");
        for (int i = 1; i <= 1000; i++) {
            dest.add(i);
        }
        for (int i = 1; i <= 1000; i++) {
            stat.add(i);
        }
//        dest.add("Excel");
//        dest.add("Java");
//        dest.add("C++");
//        dest.add("Word");
//        dest.add("Visio");
//        dest.add("AI");
//        dest.add("GoLang");
//        dest.add("Python");
//        dest.add("Network");
//        dest.add("Oracle");
//        stat.add("300000");
//        stat.add("500000");
//        stat.add("700000");
//        stat.add("1000000");
//        stat.add("1500000");
        Random rand = new Random(); //instance of random class
        int destbound = 1000;int statbound=1000;
        int warbound=7; int harga=1000000;
        int p = 1;
        int q = 1;
        int r = 0;
        for (int i = 0; i < 500; i++) {
            int n=rand.nextInt(destbound);int x=rand.nextInt(statbound);int y=rand.nextInt(destbound);int z=rand.nextInt(destbound);int a=rand.nextInt(destbound);
            if (i<9) {
                System.out.println("insert into sertifikat values('SF000"+(i+1)+"','PG000"+(i+1)+"','KS000"+(i+1)+"');");
            }else if (i<99){
                System.out.println("insert into sertifikat values('SF00"+(i+1)+"','PG00"+(i+1)+"','KS00"+(i+1)+"');");
            }else if(i<999){
                System.out.println("insert into sertifikat values('SF0"+(i+1)+"','PG0"+(i+1)+"','KS0"+(i+1)+"');");
            }else{
                System.out.println("insert into sertifikat values('SF"+(i+1)+"','PG"+(i+1)+"','KS"+(i+1)+"');");
            }
//            p++;
//            if (p > 100){
//                p = 1;
//                r++;
//            }
//            q++;
//            if (q > 100){
//                q = 1;
            }    
        }
//        for (int i = 0; i < 1000; i++) {
//            int n=rand.nextInt(destbound);int x=rand.nextInt(statbound);int y=rand.nextInt(destbound);int z=rand.nextInt(destbound);int a=rand.nextInt(destbound);
//            if (i<9) {
//                System.out.println("update pegawai set gaji = '"+dest.get(n)+"' where gaji = '"+(i+1)+"';");
//            } else if (i<99){
//                System.out.println("update pegawai set gaji = '"+dest.get(n)+"' where gaji = '"+(i+1)+"';");
//            }else if(i<999){
//                System.out.println("update pegawai set gaji = '"+dest.get(n)+"' where gaji = '"+(i+1)+"';");
//            }else{
//                System.out.println("update pegawai set gaji = '"+dest.get(n)+"' where gaji = '"+(i+1)+"';");
//            }
//
//        for (int j = 0; j < 1000; j++) {
//            if (j<9) {
//                System.out.println("update pegawai set id_pegawai = 'PG000"+(j+1)+"' where id_pegawai = '"+(j+1)+"';");
//            }else if (j<99){
//                System.out.println("update pegawai set id_pegawai = 'PG00"+(j+1)+"' where id_pegawai = '"+(j+1)+"';");
//            }else if(j<999){
//                System.out.println("update pegawai set id_pegawai = 'PG0"+(j+1)+"' where id_pegawai = '"+(j+1)+"';");
//            }else{
//                System.out.println("update pegawai set id_pegawai = 'PG"+(j+1)+"' where id_pegawai = '"+(j+1)+"';");
//            }    
//        }
//        

//-----------------------------------------------------------ATASNYA INI NAS-------------------------------------------------
//        int it=1000;int tra=1000;
//        
//        for (int i = 0; i < 1000; i++) {
//            int n=rand.nextInt(it);
//            if (i<9) {
//                if (n<9) {
//                    System.out.println("insert into item_transaction values('TRA000"+(i+1)+"','IT000"+(n+1)+"');");
//                } else if(n<99){
//                    System.out.println("insert into item_transaction values('TRA000"+(i+1)+"','IT00"+(n+1)+"');");
//                }else if (n<999){
//                    System.out.println("insert into item_transaction values('TRA000"+(i+1)+"','IT0"+(n+1)+"');");
//                }else{
//                    System.out.println("insert into item_transaction values('TRA000"+(i+1)+"','IT"+(n+1)+"');");
//                }
//            }else if(i<99){
//                if (n<9) {
//                System.out.println("insert into item_transaction values('TRA00"+(i+1)+"','IT000"+(n+1)+"');");
//            } else if(n<99){
//                System.out.println("insert into item_transaction values('TRA00"+(i+1)+"','IT00"+(n+1)+"');");
//            }else if(n<999){
//                System.out.println("insert into item_transaction values('TRA00"+(i+1)+"','IT0"+(n+1)+"');");
//            }else{
//                System.out.println("insert into item_transaction values('TRA00"+(i+1)+"','IT"+(n+1)+"');");
//            }
//            }else if(i<999){
//                if (n<9) {
//                System.out.println("insert into item_transaction values('TRA0"+(i+1)+"','IT000"+(n+1)+"');");
//            } else if(n<99){
//                System.out.println("insert into item_transaction values('TRA0"+(i+1)+"','IT00"+(n+1)+"');");
//            }else if(n<999){
//                System.out.println("insert into item_transaction values('TRA0"+(i+1)+"','IT0"+(n+1)+"');");
//            }else{
//                System.out.println("insert into item_transaction values('TRA0"+(i+1)+"','IT"+(n+1)+"');");
//            }
//            }else{
//                if (n<9) {
//                System.out.println("insert into item_transaction values('TRA"+(i+1)+"','IT000"+(n+1)+"');");
//            } else if(n<99){
//                System.out.println("insert into item_transaction values('TRA"+(i+1)+"','IT00"+(n+1)+"');");
//            }else if(n<999){
//                System.out.println("insert into item_transaction values('TRA"+(i+1)+"','IT0"+(n+1)+"');");
//            }else{
//                System.out.println("insert into item_transaction values('TRA"+(i+1)+"','IT"+(n+1)+"');");
//            }
//            }
            
//        int a=1;
//        for (int i = 750; i < 1000; i++) {
//            int n=rand.nextInt(warbound);int x=rand.nextInt(harga);
//            if (i<1000) {
//                System.out.println("insert into item values('IT0"+(i+1)+"','PC V "+a+"',"+x+",'"+warna.get(n)+"');");
//            } else {
//                System.out.println("insert into item values('IT"+(i+1)+"','PC V "+a+"',"+x+",'"+warna.get(n)+"');");
//            }a++;
//        }
//        }
        }  
    }
}
    

