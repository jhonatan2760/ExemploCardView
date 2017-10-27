package jhonatansouza.com.exemplocards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.rc = (RecyclerView) findViewById(R.id.rcv);
        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        this.rc.setLayoutManager(llm);
        this.rc.setAdapter(new Adapter(this, getDrones()));

    }


    private List<Drone> getDrones(){
        List<Drone> drones = new ArrayList<>();

        String [] nomes =  {"Mavic PRO", "Spark", "Phantom"};
        int [] imgs = {R.drawable.mavic, R.drawable.sparkk, R.drawable.phantom};

        for(int i = 0; i < nomes.length; i++){
            Drone d = new Drone();
            d.setNome(nomes[i]);
            d.setDescricao("Drone DJi");
            d.setImg(imgs[i]);
            drones.add(d);
        }

        return drones;
    }


}
