package _04_Intro_To_Enums;


public class StatesOfMatter {
 enum Matter {
	
	SOLID, LIQUID, GAS, PLASMA, BOSE_EINSTEIN_CONDENSATE
	
	
 }

 public static void main(String[] args) {
Matter state = Matter.PLASMA;

if(state == Matter.PLASMA) {
	System.out.println("Plasma");
}


switch(state) {

case PLASMA:
	System.out.println("plasma");
	break;
 default:
	System.out.println("n/a");
	break;
}

	
}
}
