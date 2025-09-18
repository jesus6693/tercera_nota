package Semana5;

public class Carr {
	String brand ;
	int year ;

	public Carr (String brand , int year){
		this.brand = brand ;
		this.year = year ;
	} 

	public void ShowInfo() {
		System.out.println( "la marca del carro es . " + brand + "y el año del carro es : " + year);
	}
}