package com.mycompany.urs.domain;

public class Playera {
    private double precio;
    private String descripcion;
    private String talla;
    private int cantidad;
    private String URLimagen;

    public Playera() {
        
    }

    public Playera(double precio, String descripcion, String talla, int cantidad, String URLimagen) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.talla = talla;
        this.cantidad = cantidad;
        this.URLimagen = URLimagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getURLimagen() {
        return URLimagen;
    }

    public void setURLimagen(String URLimagen) {
        this.URLimagen = URLimagen;
    }

    @Override
    public String toString() {
        return "Playera{" + "precio=" + precio + ", descripcion=" + descripcion + ", talla=" + talla + ", cantidad=" + cantidad + ", URLimagen=" + URLimagen + '}';
    }
    
    
}
