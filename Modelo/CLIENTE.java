/**
 * Clase CLIENTE - Representa la entidad Cliente en el sistema
 * Modelo de datos para la gestión de clientes
 * @author [Alexis]
 */
package Modelo;




public class CLIENTE {
    String id;
    String nombre;
    String genero;
    String tipopago;
    String fechainicio;

    public CLIENTE() {
    }

    public CLIENTE(String id, String nombre, String genero, String tipopago, String fechainicio) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.tipopago = tipopago;
        this.fechainicio = fechainicio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }
}