package programasyarchivos;

		import java.io.IOException;

		import java.nio.charset.StandardCharsets;

		import java.nio.file.Files;

		import java.nio.file.Path;

		import java.nio.file.Paths;

		import java.util.List;

		import java.util.Scanner;

		public class TPN4_Ejercicio3 {

			public static void main(String[] args) throws IOException {

				String nombres;

				String nom = ingresarNom();

				Path ruta = escribirNomArch(nom);

				mostrarNomArch(ruta);

			}
			
			private static void mostrarNomArch(Path ruta) throws IOException {
			
				List < String > ContenidoArchivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
				
				ContenidoArchivo.forEach(line -> System.out.println(line));
				
			}

			public static String ingresarNom() {

				Scanner nombre = new Scanner(System.in);

				System.out.println("Ingrese los nombres separados por \";\" - para finalizar presione Enter: ");

				String nom = nombre.nextLine();		

				return nom;

			}
			
			public static Path escribirNomArch(String nombres) throws IOException {

			
				System.out.println("Los nombres ingresados son: ");
				Path ruta = Paths.get("D:\\programacion\\NombresTPN4Ejercicio3.txt");


				Files.write(ruta, nombres.getBytes() );

				return ruta;
				
			}
			
	

	}


