package com.example.dietrecipes2020;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterWassafat extends RecyclerView.Adapter<AdapterWassafat.ViewHolder> {
    private ArrayList<Item> itemsList;
    private Context mContext;

    public AdapterWassafat(ArrayList<Item> itemsList, Context mContext) {
        this.itemsList = itemsList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wasafat,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = itemsList.get(position);
        holder.text.setText(item.getText());
        Context context = holder.itemView.getContext();
        holder.text.setText(item.getText());
        switch (position){
            case 0:{
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Intent intent = new Intent(context, recipe1.class);
//                        intent.putExtra("item", item.getText());
//                        context.startActivity(intent);
                    }
                });
            }break;
        }


    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text_card_main);


        }
    }
}
