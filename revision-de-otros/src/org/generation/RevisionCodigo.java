package org.generation;

import java.util.Scanner;//agregue esto

public class RevisionCodigo {
	public static void main(String[] args) {//agregue esto

		Scanner s = new Scanner(System.in);//agregue system in

		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//modifique caption a jugador 2
		Scanner s2 = new Scanner(System.in);//agregue system in
		String j2 = s2.nextLine();

		if (j1.equals(j2)) { // agregue aprentesis y cambpie por equals, dado que == compara referencias de objetos, no el contenido real de las cadenas
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2.equals("tijeras")) {//cambie por equals
					g = 1;
				}
				 break;//agregue break, evita ejecucion de otro caso
			case "papel":
				if (j2.equals("piedra")) {//cambie por equals
					g = 1;
				} // agregue corchete faltante
				 break;//agregue break
			case "tijera":
				if (j2.equals("papel")) {//cambie == por equals
					g = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + g);
			s.close();//
			s2.close();//cerre scanner
		}

	}
}
