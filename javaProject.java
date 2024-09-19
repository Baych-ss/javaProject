import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int firstBox = 145;
	    int secondBox = 357;
	    int thirdBox = 524;
	    int[] array = new int[3];
	    boolean isFisrtMatch;
	    boolean isSecondMatch;
	    boolean isThirdMatch;
	    int count = 0;
		for(int i=0; i<3; i++){
		    array[i] = scan.nextInt();
		}
		for(int i=0; i<3; i++){
		    isFisrtMatch = array[0] == firstBox;
		    if(isFisrtMatch){
		        System.out.print("First box found");
		        count++;
		        break;
		    }
		    else 
		        System.out.print("first box is not here");
		    break;
    }
        for(int i=0; i<3; i++){
		    isSecondMatch = array[1] == secondBox;
		    if(isSecondMatch){
		        System.out.print("First box found");
		        count++;
		        break;
		    }
		    else 
		        System.out.print("first box is not here");
		    break;
    }
        for(int i=0; i<3; i++){
		    isThirdMatch = array[2] == thirdBox;
		    if(isThirdMatch){
		        System.out.print("First box found");
		        count++;
		        break;
		    }
		    else 
		        System.out.print("first box is not here");
		    break;
    }
        if(count == 3){
            System.out.print("All boxes found");
            System.exit(0);
        }
        
}
}