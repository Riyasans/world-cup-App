package com.riya.worldcupapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CountryModel> {

    private ArrayList<CountryModel> countryArraylist;
    Context  context;

    public  CustomAdapter(ArrayList<CountryModel> data,Context context){
        super(context,R.layout.itemlist,data);

        this.countryArraylist = data;
        this.context = context;
    }

    // view lookup cache
    private static  class  ViewHolder{
        TextView txtcountry;
        TextView txtcupwins;
        ImageView flagimg;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get the data item for postion
        CountryModel datamodel = getItem(position);

        //check if an existing view is being reused , otherwise inflate the view
          ViewHolder viewHolder;
          final View result;
          if(convertView == null){
              viewHolder = new ViewHolder();
              LayoutInflater layoutInflater = LayoutInflater.from(getContext());
              convertView = layoutInflater.inflate(R.layout.itemlist,
                      parent,false);

              viewHolder.txtcountry = (TextView)  convertView.findViewById(R.id.countryname);
              viewHolder.txtcupwins =(TextView)  convertView.findViewById(R.id.cup_win_des);
              viewHolder.flagimg = (ImageView)  convertView.findViewById(R.id.image);
          } else{
              viewHolder = (ViewHolder) convertView.getTag();
              return   convertView;
          }
          //Get the data from the model
        viewHolder.txtcountry.setText(datamodel.getCountry_name());
          viewHolder.txtcupwins.setText(datamodel.getCup_win_count());
          viewHolder.flagimg.setImageResource(datamodel.getFlag_image());
          return  convertView;

    }
}
