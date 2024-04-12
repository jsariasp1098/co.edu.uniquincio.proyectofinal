package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

public class Proveedor {
    String idProveedor, nombre, direccion, telefono;
    Producto listProducto;

    public Proveedor() {
    }

    public Proveedor(String idProveedor, String nombre, String direccion, String telefono, Producto listProducto) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listProducto = listProducto;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Producto getListProducto() {
        return listProducto;
    }

    public void setListProducto(Producto listProducto) {
        this.listProducto = listProducto;
    }
}
