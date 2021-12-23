package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<RangosAdecuaccion> tabla = new ArrayList<RangosAdecuaccion>();
		ArrayList<RangosMantenibilidad> tablaMante = new ArrayList<RangosMantenibilidad>();
		ArrayList<tablaGlobal> tablaGlobal = new ArrayList<tablaGlobal>();
		rellenarTabla(tabla,tablaMante,tablaGlobal);
		
		
		//int completitud =0, correccion=0, pertinencia=0;
		//lecturaAdecua(completitud,correccion,pertinencia,tabla);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce la completitud funcional: ");
		int completitud = in.nextInt();
        System.out.println(" ");
        
        System.out.print("Introduce la correcion funcional: ");
        int correccion = in.nextInt();
        System.out.println(" ");
        
        System.out.print("Introduce la pertinencia funcional: ");
        int pertinencia = in.nextInt();
        System.out.println(" ");
		
		
		int adecuaFinal= adecuacionFinal(tabla,completitud,correccion,pertinencia);
		
		
		// Lectura Modularidad
		System.out.print("Introduce la modularidad: ");
		int modularidad = in.nextInt();
        System.out.println(" ");
        
        System.out.print("Introduce la reusabilidad: ");
        int reusabilidad = in.nextInt();
        System.out.println(" ");
        
        System.out.print("Introduce la analizabilidad: ");
        int analizabilidad = in.nextInt();
        System.out.println(" ");
        
        System.out.print("Introduce la analizabilidad: ");
        int modificado = in.nextInt();
        System.out.println(" ");
        
        System.out.print("Introduce la capacidad de ser probado: ");
        int probado = in.nextInt();
        System.out.println(" ");
	
		int mantenibilidad = mantenibilidad(tablaMante,modularidad,reusabilidad,analizabilidad,modificado,probado);
		
		
		calidadGlobal(tablaGlobal,adecuaFinal,mantenibilidad);

	}

	public static int calidadGlobal(ArrayList<tablaGlobal> tabla, int adecuaFinal, int mantenibilidad) {
		int calidad = 0;
		
		//prueba 55,86,19  adecua final = 2
		//12 --> 1   58-->2   87-->3  34-->1  95-->4   mante 1
		// calidad 1
		for(int i=0; i<tabla.size();i++) {
        	if(tabla.get(i).getAdecuFinal() == adecuaFinal && tabla.get(i).getMantenibilidad() == mantenibilidad) {
        		calidad = tabla.get(i).getValor();
        		break;
        	}
		}
		
		System.out.println("El nivel de calidad del producto es: " + calidad);
		
		return calidad;
		
	}

	public static int mantenibilidad(ArrayList<RangosMantenibilidad> tabla,int modularidad, int reusabilidad,int analizabilidad, int modificado, int probado) {
		
        
        for(int i=0; i<tabla.size();i++) {
        	if(tabla.get(i).getMinimo() <= modularidad && modularidad <= tabla.get(i).getMaximo()) {
        		modularidad = tabla.get(i).getModularidad();
        		break;
        	}
        }
        
        for(int i=0; i<tabla.size();i++) {
        	if(tabla.get(i).getMinimo() <= reusabilidad && reusabilidad <= tabla.get(i).getMaximo()) {
        		reusabilidad = tabla.get(i).getReusabilidad();
        		break;
        	}
        }
        
        for(int i=0; i<tabla.size();i++) {
        	if(tabla.get(i).getMinimo() <= analizabilidad && analizabilidad <= tabla.get(i).getMaximo()) {
        		analizabilidad = tabla.get(i).getAnalizabilidad();
        		break;
        	}
        }
        
        for(int i=0; i<tabla.size();i++) {
        	if(tabla.get(i).getMinimo() <= modificado && modificado <= tabla.get(i).getMaximo()) {
        		modificado = tabla.get(i).getCapacidadModi();
        		break;
        	}
        }
        
        for(int i=0; i<tabla.size();i++) {
        	if(tabla.get(i).getMinimo() <= probado && probado <= tabla.get(i).getMaximo()) {
        		probado = tabla.get(i).getCapacidadProba();
        		break;
        	}
        }
        //12 --> 1   58-->2   87-->3  34-->1  95-->4
        //System.out.print(modularidad + " " + reusabilidad + " " + analizabilidad + " " + modificado + " " + probado);
        
        int menor =Math.min(modularidad,Math.min(reusabilidad,Math.min(analizabilidad,Math.min(modificado,probado))));
        System.out.println("El nivel de mantenibilidad es : " + menor);
        return menor;
	}

	public static int adecuacionFinal(ArrayList<RangosAdecuaccion> tabla, int completitud, int correccion, int pertinencia) {
		
        for(int i=0; i<tabla.size();i++) {
        	if(tabla.get(i).getMinimo() <= completitud && completitud <= tabla.get(i).getMaximo()) {
        		completitud = tabla.get(i).getCompletitud();
        		break;
        	}
        }
        
        for(int i=0; i<tabla.size();i++) {
        	if(tabla.get(i).getMinimo() <= correccion && correccion <= tabla.get(i).getMaximo()) {
        		correccion = tabla.get(i).getCorrecion();
        		break;
        	}
        }
        
        for(int i=0; i<tabla.size();i++) {
        	if(tabla.get(i).getMinimo() <= pertinencia && tabla.get(i).getMaximo() >= pertinencia ) {
        		pertinencia = tabla.get(i).getPertinencia();
        		break;
        	}
        }
        
     // System.out.println(completitud + " " + correccion + " "  + pertinencia);
        
        int menor = completitud;
        
        if (correccion < pertinencia) {
        	if(correccion<completitud) menor = correccion;
        } else { if(pertinencia<completitud) menor = pertinencia; }
        
       // System.out.println("La adecuacion final es: " + menor);
        
        return menor;
        
	}

	public static void rellenarTabla(ArrayList<RangosAdecuaccion> tabla, ArrayList<RangosMantenibilidad> tablaMante, ArrayList<tablaGlobal> tablaGlobal) {
		tabla.add(new RangosAdecuaccion(0, 9, 0, 0, 0));
		tabla.add(new RangosAdecuaccion(10, 35, 1, 1, 2));
		tabla.add(new RangosAdecuaccion(35, 49, 2, 1, 2));
		tabla.add(new RangosAdecuaccion(50, 69, 2, 2, 3));
		tabla.add(new RangosAdecuaccion(70, 89, 3, 3, 4));
		tabla.add(new RangosAdecuaccion(90, 100, 4, 5, 5));
		
		tablaMante.add(new RangosMantenibilidad(0,9,0,0,0,0,0));
		tablaMante.add(new RangosMantenibilidad(10,34,1,1,0,1,1));
		tablaMante.add(new RangosMantenibilidad(35,49,2,2,1,2,1));
		tablaMante.add(new RangosMantenibilidad(50,69,2,2,2,3,2));
		tablaMante.add(new RangosMantenibilidad(70,89,3,3,3,4,4));
		tablaMante.add(new RangosMantenibilidad(90,100,4,5,5,5,4));
		
		tablaGlobal.add(new tablaGlobal(1,1,1));
		tablaGlobal.add(new tablaGlobal(1,2,1));
		tablaGlobal.add(new tablaGlobal(1,3,1));
		tablaGlobal.add(new tablaGlobal(1,4,1));
		tablaGlobal.add(new tablaGlobal(1,5,1));
		tablaGlobal.add(new tablaGlobal(2,1,1));
		tablaGlobal.add(new tablaGlobal(2,2,2));
		tablaGlobal.add(new tablaGlobal(2,3,2));
		tablaGlobal.add(new tablaGlobal(2,4,2));
		tablaGlobal.add(new tablaGlobal(2,5,2));
		tablaGlobal.add(new tablaGlobal(3,1,2));
		tablaGlobal.add(new tablaGlobal(3,2,2));
		tablaGlobal.add(new tablaGlobal(3,3,3));
		tablaGlobal.add(new tablaGlobal(3,4,3));
		tablaGlobal.add(new tablaGlobal(3,5,3));
		tablaGlobal.add(new tablaGlobal(4,1,3));
		tablaGlobal.add(new tablaGlobal(4,2,3));
		tablaGlobal.add(new tablaGlobal(4,3,3));
		tablaGlobal.add(new tablaGlobal(4,4,3));
		tablaGlobal.add(new tablaGlobal(4,5,4));
		tablaGlobal.add(new tablaGlobal(5,1,3));
		tablaGlobal.add(new tablaGlobal(5,2,3));
		tablaGlobal.add(new tablaGlobal(5,3,4));
		tablaGlobal.add(new tablaGlobal(5,4,4));
		tablaGlobal.add(new tablaGlobal(5,5,5));
		
		
	}

}
