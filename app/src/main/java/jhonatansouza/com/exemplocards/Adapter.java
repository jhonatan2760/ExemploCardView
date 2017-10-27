package jhonatansouza.com.exemplocards;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import viewHolder.DroneViewHolder;

/**
 * Created by jhonatansouza on 10/25/17.
 */

public class Adapter extends RecyclerView.Adapter<DroneViewHolder> {

    private Context c;
    private List<Drone> drones;

    public Adapter(Context c, List<Drone> drones){
        this.c = c;
        this.drones = drones;
    }


    @Override
    public DroneViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(c).inflate(R.layout.cartao, parent, false);
        DroneViewHolder d = new DroneViewHolder(v);
        d.setNome((TextView) v.findViewById(R.id.nome_drone));
        d.setImg((ImageView) v.findViewById(R.id.img_card));
        return d;
    }

    @Override
    public void onBindViewHolder(DroneViewHolder holder, int position) {
        holder.getNome().setText(this.drones.get(position).getNome());
        //holder.getDesc().setText(this.drones.get(position).getDescricao());
        holder.getImg().setImageResource(this.drones.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return this.drones.size();
    }


}


