package com.example.pixabay_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

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

    private void ParseJSON(){
        String URL = "https://pixabay.com/api/?key=13820626-6d25cdf74b1dc69b8dbda10fa&q=paisajes&image_type=photo&pretty=true";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    }
}
