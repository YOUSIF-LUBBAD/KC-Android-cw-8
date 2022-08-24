package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class itemAdapter extends ArrayAdapter<item> {

    List<item> itemsList;

    public itemAdapter(@NonNull Context context, int resource, @NonNull List<item> objects) {
        super(context, resource, objects);
        itemsList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);
        item currentItem = itemsList.get(position);

        TextView ItemName = v.findViewById(R.id.ItemName);
        TextView ItemPrice = v.findViewById(R.id.ItemPrice);
        ImageView ItemImage = v.findViewById(R.id.ItemImage);

        ItemName.setText(currentItem.getItemName());
        ItemPrice.setText(String.valueOf(currentItem.getItemPrice()));
        ItemImage.setImageResource(currentItem.getItemImage());

        ImageView delet = v.findViewById(R.id.Delete);

        delet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemsList.remove(position);
                notifyDataSetChanged();
            }
        });

        return v;
    }
}