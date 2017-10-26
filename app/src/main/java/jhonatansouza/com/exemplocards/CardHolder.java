package jhonatansouza.com.exemplocards;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by jhonatansouza on 10/25/17.
 */

public class CardHolder extends RecyclerView.ViewHolder {

    static ImageView img;

    public CardHolder(View itemView) {
        super(itemView);
        this.img = (ImageView) itemView.findViewById(R.id.img_card);
    }


}
