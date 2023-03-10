package com.mycompany.hexadecimal;

import java.util.Scanner;


public class Hexadecimal {

    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.println("Ingresa un nuemero deicmal: ");
        int num = Leer.nextInt();
     
        int residuo;
        String cadena="", cadena2="";
        System.out.print(num +"(10) = 0x");
        while(num!=0){
           residuo=num%16;
           if(residuo>=15){
             cadena=cadena+"F";  
           }
           else if(residuo==14){
               cadena=cadena+"E";
           }
           else if(residuo==13){
               cadena=cadena+"D";
           }
           else if(residuo==12){
               cadena=cadena+"C";
           }
           else if(residuo==11){
               cadena=cadena+"B";
           }
           else if(residuo==10){
               cadena=cadena+"A";
           }
           else if(residuo<10){
               cadena=cadena+String.valueOf(residuo);
           }
           num=num/16;
           // System.out.println("num: "+num);
        }
        //cadena normal 
      //  System.out.println(cadena);
        
        //se hace el reveseo
        for (int i =1 ; i <=cadena.length(); i++) {
            cadena2=cadena2+cadena.charAt(cadena.length()-i);
        }
        System.out.print(cadena2);
    }
}
