package mx.edu.utng;
public class RepasoArreglos2 {

	public static void main(String[] args) {
		String[] nombres[] = new String[7][3];
		
		nombres[0][0] = "Jonathan Venancio";
		nombres[0][1] = "Aguilar Hernandez";
		nombres[0][2] = "18";

		
		nombres[1][0] = "Jose Emmanuel";
		nombres[1][1] = "Arredondo Escalante";
		nombres[1][2] = "22";

		nombres[2][0] = "Yaneli";
		nombres[2][1] = "Arredondo";
		nombres[2][2] = "22";
		
		for (int i = 0; i < 3; i++) {
			for(int x = 0; x <= 1; x ++) {
				System.out.println(nombres[i][x]);
			}
		}

	}

}