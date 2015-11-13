package bosc.retrofit;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by Diego Ramirez on 10/11/2015.
 */
public interface MyService
{

    @FormUrlEncoded
    @POST("/getCampanas.php")
    void addCampana(@Field("id") int id, Callback<User> callback);


    @GET("/getCampanas.php")
    void getDatos(Callback<List<Datos>> callback);
}
