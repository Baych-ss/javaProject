import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int[] array = new int[3];
	    int firstBox = 145;
	    int secondBox = 357;
	    int thirdBox = 524;
	    boolean isFisrtMatch;
	    boolean isSecondMatch;
	    boolean isThirdMatch;
	    int count = 0;
	    int allows = 4;
	    while(allows > 0){
		for(int i=0; i<3; i++){
		    array[i] = scan.nextInt();
		}
		for(int i=0; i<3; i++){
		    isFisrtMatch = array[0] == firstBox;
		    if(isFisrtMatch){
		        System.out.println("First box found");
		        break;
		    }
		    else 
		        System.out.println("First box is not here");
		    break;
    }
        for(int i=0; i<3; i++){
		    isSecondMatch = array[1] == secondBox;
		    if(isSecondMatch){
		        System.out.println("Second box found");
		        
		        break;
		    }
		    else 
		        System.out.println("Second box is not here");
		    break;
    }
        for(int i=0; i<3; i++){
		    isThirdMatch = array[2] == thirdBox;
		    if(isThirdMatch){
		        System.out.println("Third box found");
		        
		        break;
		    }
		    else 
		        System.out.println("Third box is not here");
		    break;
		    if ((isFisrtMatch) && (isSecondMatch) && (isThirdMatch)){
                System.out.print("All boxes found");
                System.exit(0);
        }
        }
		
        
        allows--;
        System.out.println("You have " + allows + " aloows");
	}
	    System.out.println("Boxes changed their locations");
	    System.exit(0);
        
}
}
