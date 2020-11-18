package com.anthonycode.animation_provided.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.anthonycode.animation_provided.Model.Country;
import com.anthonycode.animation_provided.R;

import java.util.ArrayList;

public class SpinnerCountryAdapter extends ArrayAdapter<Country> {


    public SpinnerCountryAdapter(@NonNull Context context, ArrayList<Country> countryList) {
        super(context, 0, countryList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.spinner_item_slpashscreen, parent, false
            );
        }
        ImageView imageViewFlag = convertView.findViewById(R.id.imgFlag);
        TextView tvCountry = convertView.findViewById(R.id.tvCountry);
        TextView tvCode = convertView.findViewById(R.id.tvCode);
        Country currentItem = getItem(position);
        if (currentItem != null) {
            imageViewFlag.setImageResource(currentItem.getFlag());
            tvCountry.setText(currentItem.getNameCountry());
            tvCode.setText(currentItem.getCodeCountry());
        }
        return convertView;
    }
}
