package co.edu.uniquindio.proyectofinalfx.proyectofinalfxapp.model;

import java.util.Date;

public class Pedido {
    String idPedido, idCliente, direccionEntrega, estadoPedido;
    Date fechaPedido, fechaEntregaPedido;
    Producto detalleProducto;
    Double valorTotalPedido, descuento;

    public Pedido() {
    }

    public Pedido(String idPedido, String idCliente, String direccionEntrega, String estadoPedido, Date fechaPedido,
                  Date fechaEntregaPedido, Producto detalleProducto, Double valorTotalPedido, Double descuento) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.direccionEntrega = direccionEntrega;
        this.estadoPedido = estadoPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEntregaPedido = fechaEntregaPedido;
        this.detalleProducto = detalleProducto;
        this.valorTotalPedido = valorTotalPedido;
        this.descuento = descuento;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntregaPedido() {
        return fechaEntregaPedido;
    }

    public void setFechaEntregaPedido(Date fechaEntregaPedido) {
        this.fechaEntregaPedido = fechaEntregaPedido;
    }

    public Producto getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(Producto detalleProducto) {
        this.detalleProducto = detalleProducto;
    }

    public Double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(Double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
}
