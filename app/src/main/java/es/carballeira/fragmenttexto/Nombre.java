package es.carballeira.fragmenttexto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Nombre#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Nombre extends Fragment {

    private static final String NOMBRE = "nombre";

    private String nombre;

    public Nombre() {}

    public static Nombre newInstance(String nombre) {
        Nombre fragment = new Nombre();
        Bundle args = new Bundle();
        args.putString(NOMBRE, nombre);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            nombre = getArguments().getString(NOMBRE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_nombre, container, false);

        TextView tv_texto = view.findViewById(R.id.tv_fr_nombre);

        tv_texto.setText(nombre);

        return view;
    }
}