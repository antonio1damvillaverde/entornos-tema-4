package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ejercicio2_2 {


//		public static void escribirFichero(String nomFich, String texto) {
//			try (FileWriter fich = new FileWriter(nomFich);) {
//	 
//				// Escribimos el texto en el fichero
//				fich.write(texto);
//	 
//			} catch (IOException e) {
//				JOptionPane.showMessageDialog(null, "Error al escribir en el fichero" + e);
//			}
//		}
	

	public static void escribirFichero(String nomFich, String texto) {
		try (FileWriter fich = new FileWriter(nomFich);) {
 
			BufferedWriter wr = new BufferedWriter(fich);
			for (int i = 1; i<=10; i++) {
				wr.write(i);
				wr.newLine();
			}
			wr.close();
			
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al escribir en el fichero" + e);
		}
	}
		
	




		public static void mostrarFichero(String nomFich) {
	 
			// Leemos texto del fichero
			try (FileReader fr = new FileReader(nomFich)) {
				
				BufferedReader br = new BufferedReader(fr);
				
				String linea = br.readLine();
				JOptionPane.showMessageDialog(null, "El contenido de: " + nomFich + " es: " + linea);
			
				
			} catch (IOException e) {
				System.out.println("Problema con la lectura/excritura en el fichero " + e);
			}
//				fr.close();
				
			}
			
			
		
		public static void main(String[] args) {
			 
			String ruta = JOptionPane.showInputDialog("Introduce la ruta del fichero");
			String texto = JOptionPane.showInputDialog("Introduce el texto que quieres escribir en el fichero");
			escribirFichero(ruta, texto);
	 
			mostrarFichero(ruta);
	 
			File fichero= new File(ruta);
			BufferedReader br=null;
			BufferedWriter bw= null;
			StringBuffer sb=null;
			
			try {
				sb= new StringBuffer();
				bw= new BufferedWriter(new FileWriter(fichero));
				br= new BufferedReader(new FileReader(fichero));
				
				bw.write(texto);
				
				
				while(br.ready()) {
					sb.append((char) 
							br.read());
				}
				br.close();
				
				bw = new BufferedWriter(new FileWriter(fichero));
				String nuevotexto=JOptionPane.showInputDialog("Edita el fichero anterior", sb.toString());
				bw.write(nuevotexto);
				bw.close();
				
				
				
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
	 
		}
		
	 
	}

