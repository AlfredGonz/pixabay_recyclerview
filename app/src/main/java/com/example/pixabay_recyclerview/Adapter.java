package com.example.pixabay_recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context  mContext;
    private ArrayList<elemento> mLista;

    public Adapter (Context context, ArrayList<elemento> lista){
        mContext = context;
        mLista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.elemento,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int posicion) {
        elemento actual = mLista.get(posicion);

        String urlImg = actual.getmImgUrl();
        String creador = actual.getmCreaor();
        int likes = actual.getmLikes();

        holder.mCreador.setText("Creador: " + creador);
        holder.mLikes.setText("Creador: " + likes);
        Picasso.with(mContext).load(urlImg).fit().centerInside().into(holder.mImagen);
    }

    @Override
    public int getItemCount() {
        return mLista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImagen;
        public TextView mCreador;
        public TextView mLikes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mImagen = itemView.findViewById(R.id.imagen_vista);
            mCreador = itemView.findViewById(R.id.text_creador);
            mLikes = itemView.findViewById(R.id.text_likes);

        }
    }
}
