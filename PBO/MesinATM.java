package PBO;

import java.util.Scanner;

public class MesinATM {

private KartuDebit kartuDebit;
private boolean valid;

public void init(KartuDebit kartuDebit) {

if (kartuDebit.isValid()) {

this.kartuDebit = kartuDebit;
valid = true;



System.out.println("Mhsukkan no. PIN");
Scanner scan = new Scanner (System.in);
String pinInput = scan.next();
if (otentikasi(pinInput) == true)
	{
	System.out.println("MENU Utama");
	} 
	else 
	{

		System.out.println("NO PIN tidak sesuai...");
	}
  }

  else {
    System.out.println("Kartu Debit tidak valid..");
}
}


private boolean otentikasi(String pinInput)
{
	if (valid)
	{
		if (kartuDebit.getPin().equalsIgnoreCase (pinInput))
			return true;
			else
            return false;
		}
		
	return false;
	}
}



