package mx.unam.ejemplos.productos.conadt;

import mx.unam.adts.ArrayADT;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class AdtDriverArrayList {
    public static void main(String[] args) {
        Path ruta = Path.of("productos.csv");
        String linea;
        //ArrayADT<Producto> productos = new ArrayADT<>(5);
        ArrayList<Producto> productos = new ArrayList<>();
        int contador = 0;
        try(BufferedReader br = Files.newBufferedReader(ruta, StandardCharsets.UTF_8)){
            br.readLine();
            while( (linea = br.readLine()) != null ){
                String[] campos = linea.split(",");
                Producto p = new Producto(Integer.parseInt(campos[0]) , campos[1], Double.parseDouble(campos[2]));
                productos.add(p);
                contador++;

            }

            Double suma = 0.0;
            for(int j=0 ;j< productos.size(); j++){
                suma += productos.get(j).getPrecio();
            }

            System.out.println("El promedio de los precios es: $" + (suma/productos.size()) );

        }catch(IOException ioe){
            System.out.println(ioe.toString());

        }
    }
}
