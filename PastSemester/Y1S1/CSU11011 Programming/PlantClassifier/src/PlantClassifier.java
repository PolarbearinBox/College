import java.util.Scanner;
public class PlantClassifier {

	public static void main(String[] args) {
		System.out.println("Does the plant have cells and tissues "
				+ "which are organised into functional structures (Yes/No)?");
		Scanner input = new Scanner(System.in);
		String organisedCellsAndTissuesAnswer = input.next();
		boolean organisedCellsAndTissues = 
				organisedCellsAndTissuesAnswer.equalsIgnoreCase("Yes");
		
		if (organisedCellsAndTissues) 
		{
			System.out.println("Does the plant have vascular tissues (Yes/No)?");
			String vascularTissuesAnswer = input.next();
			boolean vascularTissues = 
					vascularTissuesAnswer.equalsIgnoreCase("Yes");
			
			if (vascularTissues)
			{
				System.out.println("Is the plant dispersed by seeds (Yes/No)?");
				String isDispersedBySeedsAnswer = input.next();
				boolean isDispersedBySeeds = 
						isDispersedBySeedsAnswer.equalsIgnoreCase("Yes");
				
				if (isDispersedBySeeds)
				{
					System.out.println("Are the seeds enclosed (Yes/No)?");
					String seedsEnclosedAnswer = input.next();
					boolean seedsEnclosed = 
							seedsEnclosedAnswer.equalsIgnoreCase("Yes");
					
					if (seedsEnclosed)
					{
						System.out.println("The plant is an ANGIOSPERM.");
					}
					
					else System.out.println("The plant is a GYMNOSPERM.");
				}
				
				else System.out.println("The plant is a PTERIDOPHYTE.");
			}
			
			else System.out.println("The plant is a BRYOPHYTE.");
		}
		
		else System.out.println("The plant is an ALGAE.");
		
		input.close();

	}

}
