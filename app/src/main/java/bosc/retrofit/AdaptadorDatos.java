package bosc.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Diego Ramirez on 11/11/2015.
 */
public class AdaptadorDatos extends ArrayAdapter<Datos>
{
    private List<Datos> listadatos;


    public AdaptadorDatos(Context context,List<Datos> data)
    {
        super(context, R.layout.item,data);
        listadatos = data;
    }

    public View getView(int position ,View converetView, ViewGroup parent)
    {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        View item = inflater.inflate(R.layout.item, null);

        TextView id , latitud, longitud;
        id       = (TextView)item.findViewById(R.id.id);
        id.setText(listadatos.get(position).getId());
        latitud  = (TextView)item.findViewById(R.id.latitud);
        latitud.setText(listadatos.get(position).getLatitud());
        longitud = (TextView)item.findViewById(R.id.longitud);
        longitud.setText(listadatos.get(position).getLongitud());

        return item;
    }
}
