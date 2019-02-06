package com.example.admin.retrofittestdemo.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import com.example.admin.retrofittestdemo.Pojo.NotificationListpojo;
import com.example.admin.retrofittestdemo.R;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.EnViewHolder> {

    private NotificationListpojo notificationListpojo;

    public  NotificationAdapter(NotificationListpojo  list){

        this.notificationListpojo = list;
    }


    @NonNull
    @Override
    public EnViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_product,parent,false);
        return new EnViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull EnViewHolder holder, int position) {


       // holder.nName.setText(notificationListpojo.output.get(0).jobdata.get(position).getName());
        holder.nName.setText(notificationListpojo.getOutput().get(0).getFeedbackDetails().get(position).getData().get(0).getCustomerName());
        holder.nMobile.setText(notificationListpojo.getOutput().get(0).getFeedbackDetails().get(position).getData().get(0).getCustomerMobile());
        holder.ndateandtime.setText(notificationListpojo.getOutput().get(0).getFeedbackDetails().get(position).getData().get(0).getNotificationDate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation1 = new AlphaAnimation(0.5f, 1.2f);
                animation1.setDuration(5000);
                v.startAnimation(animation1);




            }
        });

    }

    @Override
    public int getItemCount() {
        return notificationListpojo.getOutput().get(0).getFeedbackDetails().size();
    }

    public class EnViewHolder extends RecyclerView.ViewHolder {

        public TextView nName,nMobile,ndateandtime;

        public EnViewHolder(View itemView) {
            super(itemView);
            nName = (TextView) itemView.findViewById(R.id.NLName);
            nMobile = (TextView) itemView.findViewById(R.id.NLEmailID);
            ndateandtime = (TextView) itemView.findViewById(R.id.NLTime);
        }
    }

}
