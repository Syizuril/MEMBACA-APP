package id.syizuril.app.mengenalburungnusantara;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridBurungAdapter extends RecyclerView.Adapter<GridBurungAdapter.GridViewHolder> {
    private Context context;

    public GridBurungAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Burung> listBurung;

    public ArrayList<Burung> getListBurung() {
        return listBurung;
    }

    public void setListBurung(ArrayList<Burung> listBurung) {
        this.listBurung = listBurung;
    }

    @NonNull
    @Override
    public GridBurungAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_burung, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridBurungAdapter.GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListBurung().get(position).getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListBurung().size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
