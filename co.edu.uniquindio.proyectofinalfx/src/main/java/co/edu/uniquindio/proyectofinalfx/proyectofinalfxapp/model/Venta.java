package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

import java.util.Date;

public class Venta {
    String idVenta, idCliente;
    Date fechaVenta;

    Double valorTotalVenta, descuento;
    Producto detalleProducto;

    public Venta() {
    }

    public Venta(String idVenta, String idCliente, Date fechaVenta, Double valorTotalVenta, Double descuento,
                 Producto detalleProducto) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.fechaVenta = fechaVenta;
        this.valorTotalVenta = valorTotalVenta;
        this.descuento = descuento;
        this.detalleProducto = detalleProducto;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Double getValorTotalVenta() {
        return valorTotalVenta;
    }

    public void setValorTotalVenta(Double valorTotalVenta) {
        this.valorTotalVenta = valorTotalVenta;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Producto getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(Producto detalleProducto) {
        this.detalleProducto = detalleProducto;
    }
}
