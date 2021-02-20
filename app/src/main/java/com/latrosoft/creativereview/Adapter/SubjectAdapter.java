package com.latrosoft.creativereview.Adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.latrosoft.creativereview.Model.SubjectModel;
import com.latrosoft.creativereview.R;

import java.util.ArrayList;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.MyViewHolder> {

    ArrayList<SubjectModel> mSubjectModels;

    public SubjectAdapter(ArrayList<SubjectModel> subjectModels) {
        mSubjectModels = subjectModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subjects,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SubjectModel subjectModel = mSubjectModels.get(position);
        holder.mSubjectImage.setImageResource(subjectModel.getSubjectResid());
        holder.mSubject.setText(subjectModel.getSubjectName());
    }

    @Override
    public int getItemCount() {
        return mSubjectModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView mSubject;
        private ImageView mSubjectImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mSubject = (TextView) itemView.findViewById(R.id.subject_name);
            mSubjectImage = (ImageView) itemView.findViewById(R.id.subject_img);
        }
    }
}
