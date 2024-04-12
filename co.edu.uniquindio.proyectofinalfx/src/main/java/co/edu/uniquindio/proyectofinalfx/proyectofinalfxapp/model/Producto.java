package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

public class Producto {
    String idProducto, nombre, descripcion, tipoProducto, precioVenta, precioCosto, idProveedor;
    int stock;

    public Producto() {
    }

    public Producto(String idProducto, String nombre, String descripcion, String tipoProducto, String precioVenta,
                    String precioCosto, String idProveedor, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoProducto = tipoProducto;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
        this.idProveedor = idProveedor;
        this.stock = stock;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(String precioCosto) {
        this.precioCosto = precioCosto;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
