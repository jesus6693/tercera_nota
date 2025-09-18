package Semana5.pasoporreferencia;

import javax.swing.Box;

public class Main {
	public static void ChangeBOX(Box newBox){
		newBox.size =  20 ;
	}
	Main (){
		Box box = new Box (50);
		System.out.println(box.size);
		ChangeBOX(box);
		System.out.println(box.size);
	}
}
