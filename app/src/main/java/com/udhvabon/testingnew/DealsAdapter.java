

package com.udhvabon.testingnew;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.udhvabon.testingnew.pojo.Deals;

import java.util.List;

public class DealsAdapter extends RecyclerView.Adapter<DealsAdapter.MyViewHolder> {
    private List<Deals> dealsList;
    private Context mContext;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, date, shop_name;
        public ImageView img_deal;
        CardView card_holder;
        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.txt_deal_title);
            date = view.findViewById(R.id.txt_date);
            shop_name = view.findViewById(R.id.txt_shop);
            img_deal = view.findViewById(R.id.img_deal);
            card_holder = view.findViewById(R.id.holder);
        }
    }

    public DealsAdapter(List<Deals> dealsList, Context mContext) {
        this.dealsList = dealsList;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.deals_adapter_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final Deals deal = dealsList.get(position);
        holder.title.setText(deal.getTitle());
        holder.date.setText(deal.getStart_date());
        holder.shop_name.setText(deal.getShop().getTitle());
        Glide.with(mContext).load(deal.getPicture().getUrl()).into(holder.img_deal);
        holder.card_holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dealsList.size();
    }
}

