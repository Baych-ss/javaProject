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
	    int count1 = 0;
	    int count2 = 0;
	    int count3 = 0;
	    int allows = 5;
	    while(allows > 0){
		for(int i=0; i<3; i++){
		    array[i] = scan.nextInt();
		}
		for(int i=0; i<3; i++){
		    isFisrtMatch = array[0] == firstBox;
		    if(isFisrtMatch){
		        System.out.println("First box found");
		        count1 = 1;
		        break;
		    }
		    else 
		        System.out.println("First box is not here");
		        count1 = 0;
		    break;
    }
        for(int i=0; i<3; i++){
		    isSecondMatch = array[1] == secondBox;
		    if(isSecondMatch){
		        System.out.println("Second box found");
		        count2 = 1;
		        break;
		    }
		    else 
		        System.out.println("Second box is not here");
		        count2 = 0;
		    break;
    }
        for(int i=0; i<3; i++){
		    isThirdMatch = array[2] == thirdBox;
		    
		    if(isThirdMatch){
		        System.out.println("Third box found");
		        count3 = 1;
		        break;
		    }
		    else 
		        System.out.println("Third box is not here");
		        count3 = 0;
		        break;
		    
        }
		if((count1 == 1) && (count2 == 1) && (count3 == 1)){
		    System.out.println("All boxes found");
		    System.exit(0);
		}
        
        allows--;
        System.out.println("You have " + allows + " aloows");
	}
	    System.out.println("Boxes changed their locations");
	    System.exit(0);
        
}
}
