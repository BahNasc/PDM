package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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
        convertView=inflater.inflate(mResourse,parent, attachToRoot: false);
      //  return super.getView(position, convertView, parent);

        TextView txtNome =convertView.findViewById(R.id.nome);
        TextView txtId =convertView.findViewById(R.id.id);
        TextView txtImagem =convertView.findViewById(R.id.imageView);

        txtNome.setText(getItem(position).nome);
        txtIdd.setText(getItem(position).id);
        txtImagem.setText(String.valueOf(getItem(position)).imageView);
    }
}
