package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Shape> {
    ArrayList<Shape> shapeArrayList;
    Context context;

    public CustomAdapter(Context context, ArrayList<Shape> shapeArrayList){
        super(context, R.layout.grid_layout, shapeArrayList);
        this.context = context;
        this.shapeArrayList = shapeArrayList;
    }

    static class ViewHolder{
        TextView shapeName;
        ImageView shapeImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shape = getItem(position);
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_layout, parent, false);
            holder.shapeName = convertView.findViewById(R.id.textView);
            holder.shapeImg = convertView.findViewById(R.id.imageView);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        assert shape != null;
        holder.shapeName.setText(shape.getShape());
        holder.shapeImg.setImageResource(shape.getImageId());

        return convertView;
    }
}
