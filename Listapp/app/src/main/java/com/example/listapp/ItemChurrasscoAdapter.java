package com.example.listapp;

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

public class ItemChurrasscoAdapter extends ArrayAdapter<ItemChurrasco> {
    Context mContext;
    int mResource;
    public ItemChurrasscoAdapter(@NonNull Context context, int resource, @NonNull List<ItemChurrasco> objects) {
        super(context, resource, objects);
        mContext = context;
        resource = resource;
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //inflar layout
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView=inflater.inflate(mResource,parent, false);

      //  return super.getView(position, convertView, parent);
        TextView Nome = convertView.findViewById(R.id.nome);
        TextView Id = convertView.findViewById(R.id.id);
        ImageView imgView = convertView.findViewById(R.id.imgView);

        Nome.setText(getItem(position).nome);
        Id.setText(String.valueOf(getItem(position).id));
        imgView.setImageResource(getItem(position).imagem);

        return convertView;
    }
}
