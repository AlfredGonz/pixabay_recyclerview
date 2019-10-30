package com.example.pixabay_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RecyclerView;
    private elemento Elemento;
    private ArrayList<elemento> lista;
    private RequestQueue RequestQueue;//Recibe cada y petición y sea realizada

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView = findViewById(R.id.recycler_vista);
        RecyclerView.setHasFixedSize(true); //el adapter no cambia su tamaño
        RecyclerView.setLayoutManager(new LinearLayoutManager(this)); //indica al recycler que tomara la forma de lista vertical

        lista = new ArrayList<>();

        RequestQueue = Volley.newRequestQueue(this);
        //Métdo para hacer el parseo
        ParseJSON();

    }


}
