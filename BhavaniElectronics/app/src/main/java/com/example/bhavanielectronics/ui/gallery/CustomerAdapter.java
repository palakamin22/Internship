package com.example.bhavanielectronics.ui.gallery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bhavanielectronics.R;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ImageViewHolder> {
    private int[] productImages;
    private String[] productNames;
    public Context context;
    public CustomerAdapter(Context context, int[] productImages, String[] productNames){
        this.context = context;
        this.productImages = productImages;
        this.productNames = productNames;
    }
    @NonNull
    @Override
    public CustomerAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.albumcardlayout,parent,false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerAdapter.ImageViewHolder holder, int position) {
       final int image_id = productImages[position];
       final String title_id = productNames[position];
       holder.productImage.setImageResource(image_id);
       holder.productName.setText(title_id);
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(context,ProductDescription.class);
               Bundle extras = new Bundle();
               extras.putInt("Image",image_id);
               extras.putString("Name",title_id);
               intent.putExtras(extras);
               context.startActivity(intent);
           }
       });
     }

    @Override
    public int getItemCount() {
        return 11;
    }
    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        public ImageView productImage;
        public TextView productName;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productImage);
            productName = itemView.findViewById(R.id.productName);
        }
    }
}
