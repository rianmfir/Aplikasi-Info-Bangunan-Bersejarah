package com.example.asiatenggara.Adapter;

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

import com.example.asiatenggara.CustomOnItemClickListener;
import com.example.asiatenggara.Model.Bangunan;
import com.example.asiatenggara.R;

import java.util.ArrayList;

public abstract class CardViewBangunanAdapter extends RecyclerView.Adapter<CardViewBangunanAdapter.CardViewHolder> {
    private Context context;
    private ArrayList<Bangunan> listBangunan;
    private OnClick onClick;

    public CardViewBangunanAdapter(Context context, OnClick onClick) {
        this.context = context;
        this.onClick = onClick;
    }

    public ArrayList<Bangunan> getListBangunan() {
        return listBangunan;
    }

    public void setListBangunan(ArrayList<Bangunan> listBangunan) {
        this.listBangunan = listBangunan;
    }

    @NonNull
    @Override
    public CardViewBangunanAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_negara, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewBangunanAdapter.CardViewHolder cardViewHolder, final int i) {

        Bangunan b = getListBangunan().get(i);
        cardViewHolder.tampil(b, onClick);

        // BUAT BUTTON
        cardViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite " + getListBangunan().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share " + getListBangunan().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListBangunan().size();
    }

    public abstract void onClick(Object bangunan);


    class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;

        CardViewHolder(View itemView) {
            super(itemView);

            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);

            tvName = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView) itemView.findViewById(R.id.tv_item_remarks);


            btnFavorite = (Button) itemView.findViewById(R.id.btn_set_favorite);
            btnShare = (Button) itemView.findViewById(R.id.btn_set_share);
        }


        public void tampil(final Bangunan bangunan, final OnClick OnItemClick) {
            imgPhoto.setImageResource(bangunan.getPhoto());

            tvName.setText(bangunan.getName());
            tvRemarks.setText(bangunan.getRemarks());

            imgPhoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClick.onClick(bangunan);

                }
            });

        }
    }

    public interface OnClick {
        void onClick(Object bangunan);
    }


}

