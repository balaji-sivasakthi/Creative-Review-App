package com.latrosoft.creativereview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.latrosoft.creativereview.Model.TipsModel;
import com.latrosoft.creativereview.R;

import java.util.ArrayList;

public class TipsAdapter extends RecyclerView.Adapter<TipsAdapter.MyViewHolder> {


    ArrayList<TipsModel> mTipsModels ;

    public TipsAdapter(ArrayList<TipsModel> tipsModels) {
        mTipsModels = tipsModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.horizontal_card_view,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TipsModel model = mTipsModels.get(position);
        holder.mTextView.setText(model.getTips());
        holder.mImageView.setImageResource(model.getCardImgId());

    }

    @Override
    public int getItemCount() {
        return mTipsModels.size();
    }



    public  static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;
        private ImageView mImageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.cardtipsTv);
            mImageView= itemView.findViewById(R.id.cardIv);
        }
    }

}
