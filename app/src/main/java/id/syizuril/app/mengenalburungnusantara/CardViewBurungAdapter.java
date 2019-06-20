package id.syizuril.app.mengenalburungnusantara;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewBurungAdapter extends RecyclerView.Adapter<CardViewBurungAdapter.CardViewViewHolder> {
    private Context context;

    public CardViewBurungAdapter(Context context) {
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
    public CardViewBurungAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_burung, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewBurungAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        Burung b = getListBurung().get(i);

        Glide.with(context)
                .load(b.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvName.setText(b.getName());
        cardViewViewHolder.tvRemarks.setText(b.getRemarks());

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context,"Favorite "+getListBurung().get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context,"Share "+getListBurung().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListBurung().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;

        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
