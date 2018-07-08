package sv.com.hometech.cardviewtemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<MainModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        list = new ArrayList<>();

        list.add(new MainModel(R.drawable.biryani,"Biryani","Karachi savour", "4.75"));
        list.add(new MainModel(R.drawable.pasta,"Pasta","Sauce Pasta Italina", "3.99"));
        list.add(new MainModel(R.drawable.biryani,"Biryani Special","Karachi savour plus", "9.99"));
        list.add(new MainModel(R.drawable.pasta,"Pasta","Sauce Pasta Italina", "6.50"));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager layoutManager = linearLayoutManager;

        recyclerView.setLayoutManager(layoutManager);

        MainAdapter adapter = new MainAdapter(this, list);

        recyclerView.setAdapter(adapter);
    }
}
