package com.example.gform;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class ResponseAdapter extends RecyclerView.Adapter<ResponseAdapter.ResponseViewHolder> {

    ArrayList<in> response;
    Context context;

    public ResponseAdapter(Context context, ArrayList<in>resplist){

        response = resplist;
        this.context = context;

    }


    class  ResponseViewHolder extends RecyclerView.ViewHolder {

        TextView email, name, age, college, year, mobile, gender, area, techs, specs, lkprof, fbprof, gitprof, resume, why, exp, suggest, reff;
        public ResponseViewHolder(@NonNull View itemView) {
            super(itemView);
            email = (TextView) itemView.findViewById(R.id.tv1);
            name = (TextView) itemView.findViewById(R.id.tv2);
            age = (TextView) itemView.findViewById(R.id.tv3);
            college = (TextView) itemView.findViewById(R.id.tv4);
            year = (TextView) itemView.findViewById(R.id.tv5);
            mobile = (TextView) itemView.findViewById(R.id.tv6);
            gender = (TextView) itemView.findViewById(R.id.tv7);
            area = (TextView) itemView.findViewById(R.id.tv8);
            techs = (TextView) itemView.findViewById(R.id.tv9);
            specs = (TextView) itemView.findViewById(R.id.tv10);
            lkprof = (TextView) itemView.findViewById(R.id.tv11);
            fbprof = (TextView) itemView.findViewById(R.id.tv12);
            gitprof = (TextView) itemView.findViewById(R.id.tv13);
            resume = (TextView) itemView.findViewById(R.id.tv14);
            why = (TextView) itemView.findViewById(R.id.tv15);
            exp = (TextView) itemView.findViewById(R.id.tv16);
            suggest = (TextView) itemView.findViewById(R.id.tv17);
            reff = (TextView) itemView.findViewById(R.id.tv18);

        }
    }
    @NonNull
    @Override
    public ResponseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_data,parent, false);
        return new ResponseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ResponseViewHolder holder, int position) {

        in i = response.get(position);
        holder.email.setText(i.email);
        holder.name.setText(i.name);
        holder.age.setText(i.age+"");
        holder.college.setText(i.college);
        holder.year.setText(i.year);
        holder.mobile.setText(i.mobile);
        holder.gender.setText(i.gender);
        holder.area.setText(i.area);
        holder.techs.setText(i.techs);
        holder.specs.setText(i.specs);
        holder.lkprof.setText(i.lkprof);
        holder.fbprof.setText(i.fbprof);
        holder.gitprof.setText(i.gitprof);
        holder.resume.setText(i.resume);
        holder.why.setText(i.why);
        holder.exp.setText(i.exp);
        holder.suggest.setText(i.suggest);
        holder.reff.setText(i.reff);


    }


    @Override
    public int getItemCount() {
        return response.size();
    }
}
