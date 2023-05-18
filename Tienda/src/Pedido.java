import java.time.LocalDateTime;

public class Pedido {

    String idpedido;
    Cliente clientepedido;
    LocalDateTime fechapedido;
    enum estado{
        Stock,
        Agotado,
        Enviado,
        Aduana
    };

    public String getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(String idpedido) {
        this.idpedido = idpedido;
    }

    public Cliente getClientepedido() {
        return clientepedido;
    }

    public void setClientepedido(Cliente clientepedido) {
        this.clientepedido = clientepedido;
    }

    public LocalDateTime getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(LocalDateTime fechapedido) {
        this.fechapedido = fechapedido;
    }

    public Pedido(String idpedido, Cliente clientepedido, LocalDateTime fechapedido) {
        this.idpedido = idpedido;
        this.clientepedido = clientepedido;
        this.fechapedido = fechapedido;
    }

    public Pedido() {
    }
}
