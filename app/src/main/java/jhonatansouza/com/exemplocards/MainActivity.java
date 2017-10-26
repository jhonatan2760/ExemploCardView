package jhonatansouza.com.exemplocards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.rc = (RecyclerView) findViewById(R.id.rcv);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        this.rc.setLayoutManager(llm);
        this.rc.setAdapter(new Adapter(this));

    }


}
