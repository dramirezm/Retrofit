package bosc.retrofit;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.scottyab.aescrypt.AESCrypt;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends ActionBarActivity {
    TextView txt;
    ListView lv;
    String encryptedApp;
    String encryptedName;
    private ArrayList<Datos> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       txt = (TextView)findViewById(R.id.txt);
      //  lv= (ListView)findViewById(R.id .lista);
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("http://www.wimeapp.com").build();

        MyService service = restAdapter.create(MyService.class);

     /*   service.getDatos(new Callback<List<Datos>>()
        {
            @Override
            public void success(List<Datos> datoses, Response response)
            {
                AdaptadorDatos adaptadorDatos = new AdaptadorDatos(getApplicationContext(),datoses);
                lv.setAdapter(adaptadorDatos);


                */
               /* for (int i = 0; i < datoses.size(); i++)
                {
                    Datos datos = new Datos();

                    datos.setLatitud(datoses.get(i).getLatitud());

                    arrayList.add(datos);

                }

               if (arrayList.size()>0)
               {
             //      txt.setText(String.valueOf(arrayList.get(3).getLatitud()));
               }
               */

/*            }

            @Override
            public void failure(RetrofitError error)
            {
           // txt.setText(error.getMessage());
            }
        });

        */


        service.addCampana(1, new Callback<User>() {
            @Override
            public void success(User user, Response response) {
                txt.setText("Nombre de la Campana: "+ user.NombreCampana + "\nLongitud :" + user.Longitud + "\nLatitud :"+user.Latitud);

                 String nombre ="Diego";
                String app = "Ramirez";

                try {
                    encryptedName   = AESCrypt.encrypt("name",nombre);
                    encryptedApp = AESCrypt.encrypt("app",app);
                    Log.e("Name Encrypted ",encryptedName);
                    Log.e("App Encrypted ",encryptedApp);
                }catch (GeneralSecurityException e){
                    //handle error
                }



                try {
                    String decryptName = AESCrypt.decrypt("name", encryptedName);
                    String decrypApp   = AESCrypt.decrypt("app", encryptedApp);
                    Log.e("Name Decrypted ",decryptName);
                    Log.e("App Decrypted ",decrypApp);
                }catch (GeneralSecurityException e){
                    //handle error - could be due to incorrect password or tampered encryptedMsg
                }


                //JSONArray jsonArray = new JSONArray();
                JSONObject jsonObject = new JSONObject();
                try {
                 //   jsonArray.put(jsonObject);
                    jsonObject.put("nombre", encryptedName);
                    jsonObject.put("apellido",encryptedApp);
                    //Log.e("Objecto ",jsonArray.toString());
                    Log.e("Objeto",jsonObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void failure(RetrofitError error) {
                txt.setText(error.getMessage());
            }
        });





    }


}
