package javaclase5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarritodeCompras {

    public static void main(String[] args) throws IOException {
        File archivo = new File("C:\\Users\\Manuel\\Documents\\NetBeansProjects\\JavaClase5\\src\\javaclase5\\carrito.txt");
        
        
          List<ItemCarrito> items = new ArrayList<>();
            int numeroCarrito = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" ");
                int cantidad = Integer.parseInt(datos[0]);
                int precioUnitario = Integer.parseInt(datos[1]);
                String nombreProducto = datos[2];
                Producto producto = new Producto(nombreProducto, precioUnitario);
                ItemCarrito item = new ItemCarrito(producto, cantidad);
                items.add(item);
            }
        } catch (IOException e) {
            System.out.println("error");
        }

        Carrito carrito = new Carrito(numeroCarrito, items);
        double precioTotal = carrito.getTotal();
        System.out.println("El precio total del carrito " + carrito.getNumeroCarrito() + " es: " + precioTotal);
    }
}