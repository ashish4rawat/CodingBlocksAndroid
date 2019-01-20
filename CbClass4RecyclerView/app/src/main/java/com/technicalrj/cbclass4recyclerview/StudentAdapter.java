package com.technicalrj.cbclass4recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {


    ArrayList<Student> studentArrayList ;

    public StudentAdapter(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.single_item,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.name.setText(studentArrayList.get(i).name);
        viewHolder.hobby.setText(studentArrayList.get(i).hobby);


    }

    @Override
    public int getItemCount() {
        return studentArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView name,hobby;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            hobby = itemView.findViewById(R.id.hobby);


        }
    }

}
