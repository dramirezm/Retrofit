package bosc.retrofit;

/**
 * Created by Diego Ramirez on 10/11/2015.
 */
public class Datos {
    private int id_campana;
    private String Nombre;
    private String FechaInico;
    private String FechaFin;
    private String Snaps;
    private String idUsuario;
    private String Latitud;
    private String Longitud;
    private String Distancia;
    private String Ubicacion;

    @Override
    public String toString() {
        return "Datos{" +
                "id=" + id_campana +
                ", Nombre='" + Nombre + '\'' +
                ", FechaInico='" + FechaInico + '\'' +
                ", FechaFin='" + FechaFin + '\'' +
                ", Snaps='" + Snaps + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", Latitud='" + Latitud + '\'' +
                ", Longitud='" + Longitud + '\'' +
                ", Distancia='" + Distancia + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                '}';
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public String getDistancia() {
        return Distancia;
    }

    public void setDistancia(String distancia) {
        Distancia = distancia;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String longitud) {
        Longitud = longitud;
    }

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String latitud) {
        Latitud = latitud;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getSnaps() {
        return Snaps;
    }

    public void setSnaps(String snaps) {
        Snaps = snaps;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String fechaFin) {
        FechaFin = fechaFin;
    }

    public String getFechaInico() {
        return FechaInico;
    }

    public void setFechaInico(String fechaInico) {
        FechaInico = fechaInico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getId() {
        return id_campana;
    }

    public void setId(int id) {
        this.id_campana = id;
    }




}
