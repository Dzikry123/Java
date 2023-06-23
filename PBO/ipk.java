package PBO;

import java.util.Scanner;
public class ipk
{
public static void main (String []copas)
{
double tot=0,totn=0,ipk=0,jums=0,jumn=0;
String p;
int po;

System.out.println("=================================");
Scanner input=new Scanner (System.in);
System.out.print(" NAMA   :");
String nm=input.nextLine();

Scanner inp=new Scanner (System.in);
System.out.print(" NIM   :");
String m=inp.nextLine();
System.out.println("=================================");

Scanner input1=new Scanner (System.in);
int i=1;
float n,jum;
System.out.print(" Banyak MK yang diambil :");
n=input1.nextFloat();

while (i<=n){

System.out.println(" ");
System.out.println(" DATA ke -"+i);
Scanner input2=new Scanner(System.in);
System.out.print(" Mata Kuliah  :");
String mk=input2.nextLine();

Scanner input3=new Scanner (System.in);
System.out.print(" SKS   :");
int sk=input3.nextInt();

Scanner input4=new Scanner (System.in);
System.out.print(" Nilai   :");
double nil=input4.nextDouble();
if (nil>=85){
p="A";
po=4;}
else if (nil>=75){
p="B";
po=3;}
else if(nil>=65){
p="C";
po=2;}
else if(nil>=50){
p="D";
po=2;}
else{
p="E";
po=1;}

System.out.println(" Predikat  :"+p);
tot = po*sk;
System.out.println(" Total Point  :"+tot);
totn +=tot;
jums +=sk;
jumn +=nil;
i++;
}
System.out.println(" ");
System.out.println(" Total Nilai  :"+jumn);
System.out.println(" Total Point  :"+totn);
System.out.println(" Total SKS  :"+jums);
ipk = totn/jums;
System.out.println(" IPK   :"+ipk);
}}