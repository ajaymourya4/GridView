package com.ajayexample.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<Grid>{

    public GridAdapter(Context context, ArrayList<Grid> grid) {
        super(context, 0,grid);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        Grid currentGrid = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.text_view);

        textView.setText(currentGrid.getNumber());

        return listItemView;
    }
}
