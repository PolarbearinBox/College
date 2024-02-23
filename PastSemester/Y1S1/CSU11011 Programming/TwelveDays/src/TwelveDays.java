
public class TwelveDays {

	public static void main(String[] args) {
		
		int count = 1;
		
		for (count = 1; count < 13; count++)
		{
			System.out.println("On the " + ordinalNumber(count) + " day of Christmas," );
			System.out.println("My true love sent to me:");
			
			switch(count)
			{
			case 12:
				System.out.println("12 Drummers Drumming,");
				
			case 11:
				System.out.println("11 Pipers Piping,"); ;
				
			case 10:
				System.out.println("10 Lords a Leaping,");
				
			case 9:
				System.out.println("9 Ladies Dancing,");
				
			case 8:
				System.out.println("8 Maids a Milking,");
				
			case 7:
				System.out.println("7 Swans a Swimming,");
				
			case 6:
				System.out.println("6 Geese a Laying,");
				
			case 5:
				System.out.println("5 Golden Rings,");
				
			case 4:
				System.out.println("4 Calling Birds,");
				
			case 3:
				System.out.println("3 French Hens,");
				
			case 2:
				System.out.println("2 Turtle Doves,");
				System.out.print("and ");
				
			case 1:
				System.out.println("a Partridge in a Pear Tree.");
			}
			System.out.println();
		}
		
	}
	
	public static String ordinalNumber(int count)
	{
		String ordinalDay = "";
		switch(count)
		{
		case 1:
			ordinalDay = "first";
			break;
		case 2:
			ordinalDay = "second";
			break;
		case 3:
			ordinalDay = "third";
			break;
		case 4:
			ordinalDay = "fourth";
			break;
		case 5:
			ordinalDay = "fifth";
			break;
		case 6:
			ordinalDay = "sixth";
			break;
		case 7:
			ordinalDay = "seventh";
			break;
		case 8:
			ordinalDay = "eighth";
			break;
		case 9:
			ordinalDay = "ninth";
			break;
		case 10:
			ordinalDay = "tenth";
			break;
		case 11:
			ordinalDay = "eleventh";
			break;
		case 12:
			ordinalDay = "twelfth";
			break;
		}
		return ordinalDay;
	}
	
}