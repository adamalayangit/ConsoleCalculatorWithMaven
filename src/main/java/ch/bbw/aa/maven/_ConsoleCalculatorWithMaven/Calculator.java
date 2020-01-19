package ch.bbw.aa.maven._ConsoleCalculatorWithMaven;

import java.text.DecimalFormat;

/*
 * Um private Methoden test zu können, müssen sie in einer anderen Klasse implementiert sein
 * um die Wiederverwenbarkeit zu gewährleisten.
 * */

public class Calculator {
	
	// die Implementation von 'DecimalFormat' mit Hilfe von Jamie Lam
	// hat mit meinem appoach eifach immer einen 'Failure' beim builden gegeben...
	DecimalFormat df = new DecimalFormat("#.00");
	
	public int summe(int value1, int value2)
	{
		return value1 + value2;
	}
	
	public int differenz(int value1, int value2)
	{
		return value1 - value2;
	}
	
	public int division(int value1, int value2)
	{
		return value1 / value2;
	}
	
	protected String zinsesZins(double anfangKapital, double zins, double laufZeit) {
	      return df.format(anfangKapital*Math.pow(1 + zins /100, laufZeit));
	}

}
