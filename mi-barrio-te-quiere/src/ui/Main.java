package ui;

import java.util.Scanner;
import model.Minimarket;

public class Main {
	
	private Scanner sc;
	private Minimarket mini;
	
	public Main(){
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Main objMain = new Main();
		objMain.mainMenu();
	}
	
	public void mainMenu() {
		boolean menu = true;
		int option;
		while(menu) {
			System.out.println("\n******************************************************" +
								"\nSeleccione una opción\n" + 
								"\n(1) Registrar nuevo ingreso" + 
								"\n(2) Consultar intentos de ingreso" + 
								"\n(3) Salir" + 
								"\n******************************************************\n"
								);
		option = Integer.parseInt(sc.nextLine());
		switch(option) {
			case 1: chooseTypeID();
				break;
			case 2: optionMenu2();
				break;
			case 3: menu = false;
					System.out.println("\nBye!");
				break;
			default:
					System.out.println("\nError, invalid option");
		}
		}
	}
	
	public void chooseTypeID() {
		int option;
		System.out.println("\nSeleccione un tipo de documento de identificación:\n" +
							"\n(1) TI - Tarjeta de Identidad" +
							"\n(2) CC - Cédula de ciudadanía" +
							"\n(3) PP - Pasaporte" +
							"\n(4) CE - Cédula de Extranjería" +
							"\n(0) Volver al menú principal");
		option = Integer.parseInt(sc.nextLine());
		if(option == 0) {
			mainMenu();
		}else {
			enterNumID(option);
		}
	}
	
	public void enterNumID(int option) {
		String numID;
		System.out.println("\nDigite el número de identificación:\n");
		numID = sc.nextLine();
		System.out.println(mini.registerPerson(option, numID));
	}
	
	public void optionMenu2() {
		
	}
}
