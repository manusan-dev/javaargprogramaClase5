
package javaclase5;

import java.util.*;

public class Carrito {
    private int numeroCarrito;
    private List<ItemCarrito> items;
    
    
    public Carrito(int numeroCarrito, List<ItemCarrito> items) {
    this.numeroCarrito = numeroCarrito;
    this.items = items;
}
    
    public int getNumeroCarrito() {
        return numeroCarrito;
    }
    
    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }

    public void eliminarItem(ItemCarrito item) {
        items.remove(item);
    }

    public double getTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total = total + item.getTotal();
        }
        return total;
    }
}

