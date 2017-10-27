package viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jhonatansouza on 10/26/17.
 */

public class DroneViewHolder extends RecyclerView.ViewHolder  {

    private TextView nome;
    private ImageView img;
    private TextView desc;

    public DroneViewHolder(View v){
        super(v);
    }


    public TextView getNome() {
        return nome;
    }

    public void setNome(TextView nome) {
        this.nome = nome;
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public TextView getDesc() {
        return desc;
    }

    public void setDesc(TextView desc) {
        this.desc = desc;
    }
}
