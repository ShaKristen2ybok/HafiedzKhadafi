package com.example.tugasrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.security.AccessController;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatHolder> {

    Context context;
    List<PolaItem> item;

    public ChatAdapter(Context context, List<PolaItem> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public ChatHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_chat_item, null);
        return new ChatHolder(v);
    }

    @Override
    public void onBindViewHolder(ChatHolder holder, int position) {

        Glide.with(context)
                .load(item.get(position).getImg())
                .into(holder.imgprofil);

        holder.tvjudul.setText(item.get(position).getJudul());
        holder.tvdeskripsi.setText(item.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class ChatHolder extends RecyclerView.ViewHolder{

        ImageView imgprofil;
        TextView tvjudul, tvdeskripsi;
        public ChatHolder(View itemView) {
            super(itemView);
            imgprofil = (ImageView) itemView.findViewById(R.id.img_profil);
            tvjudul = (TextView) itemView.findViewById(R.id.tv_judul);
            tvdeskripsi = (TextView) itemView.findViewById(R.id.tv_deskripsi);
        }
    }
}
