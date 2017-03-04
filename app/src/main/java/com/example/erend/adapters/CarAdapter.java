package com.example.erend.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.erend.models.Carro;
import com.example.erend.popular_movies.R;

import java.util.ArrayList;

/**
 * Created by erend on 04/03/2017.
 */

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    private ArrayList<Carro> datos;
    private Context context;

    public CarAdapter(Context context, ArrayList<Carro> carros){

        this.context= context;
        this.datos=carros;

    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        ViewHolder holder= new ViewHolder(view);
        view.setTag(holder);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Carro carro = datos.get(position);
        holder.title.setText(carro.getTitle());
        holder.description.setText(carro.getDescription());
        holder.image.setImageResource(carro.getId_image());


    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView title;
        private final TextView description;
        private final ImageView image;

        public ViewHolder(View view){
            super(view);
            title = (TextView)view.findViewById(R.id.titleTextView);
            description = (TextView)view.findViewById(R.id.subtitleTextView);
            image = (ImageView)view.findViewById(R.id.imagenCarro);
        }
}

}
