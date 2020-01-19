package ch.bbw.aa.maven._ConsoleCalculatorWithMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator calculator = new Calculator();
    	int valueA = 0;
    	int valueB = 0;
    	
    	System.out.println( "Console Calculator" );
    	System.out.println( "==================" );
    	System.out.println();
    	
    	valueA = 10;
    	valueB = 20;
        System.out.println( "Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
        System.out.println( "Differenz " + valueA + " - " + valueB + " = " + calculator.differenz(valueA, valueB));
        System.out.println( "Division " + valueA + " / " + valueB + " = " + calculator.division(valueA, valueB));
        System.out.println( "Zinseszins " + valueA + " / " + valueB + " = " + calculator.zinsesZins(1200, 4, 5));
    }
}
