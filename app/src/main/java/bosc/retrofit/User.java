package bosc.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Diego Ramirez on 11/11/2015.
 */
public class User {

    @SerializedName("NombreCampana")
    String NombreCampana;

    @SerializedName("FechaInicio")
    String FechaInicio;

    @SerializedName("Latitud")
    String Latitud;

    @SerializedName("Longitud")
    String Longitud;
}
