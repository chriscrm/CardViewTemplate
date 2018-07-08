package sv.com.hometech.cardviewtemplate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private Context context;
    private ArrayList<MainModel> list;

    public MainAdapter(Context context, ArrayList<MainModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.items,viewGroup,false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView item_title, item_desc, item_price;
        ImageView item_image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            item_image = itemView.findViewById(R.id.item_image);
            item_title = itemView.findViewById(R.id.item_title);
            item_desc = itemView.findViewById(R.id.item_desc);
            item_price = itemView.findViewById(R.id.item_price);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        MainModel mainModel = list.get(i);

        ImageView imageView = viewHolder.item_image;
        TextView title = viewHolder.item_title;
        TextView desc = viewHolder.item_desc;
        TextView price = viewHolder.item_price;

        imageView.setImageResource(mainModel.getImage());

        title.setText(mainModel.getTitle());
        desc.setText(mainModel.getDesc());
        price.setText(mainModel.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
