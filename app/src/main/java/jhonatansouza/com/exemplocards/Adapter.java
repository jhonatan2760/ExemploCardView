package jhonatansouza.com.exemplocards;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by jhonatansouza on 10/25/17.
 */

public class Adapter extends RecyclerView.Adapter {

    private Context c;

    public Adapter(Context c ){
        this.c = c;
    }


    @Override
    public H onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.cartao, parent, false);
        H h = new H(v);
        return h;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        H.img.setImageResource(R.drawable.mario);
    }


    public static class H extends RecyclerView.ViewHolder {

        public static ImageView img;
        public H (View v){
            super(v);
            img = (ImageView) v.findViewById(R.id.img_card);
        }


    }

    @Override
    public int getItemCount() {
        return 3;
    }


}


