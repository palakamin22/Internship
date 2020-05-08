package com.example.bhavanielectronics.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bhavanielectronics.R;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {
    private RecyclerView recyclerView;
    private int[] productImages = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9, R.drawable.pic10, R.drawable.pic11};
    private String[] productNames = {"Single Screw And Barrel","Parallel Twin Screw And Barrel","Conical Screw And Barrel","Segment Screw And Barrel","Injection Moulding Screw And Barrel","Food Process Screw And Barrel","Groove Feed Sleeve Screw Barrel","Hss Sleeve","Mixer Blades","Pulverizer Blade","Screws Ring Plunger And Torpedo"};
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerView = root.findViewById(R.id.fragview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        CustomerAdapter customAdapter = new CustomerAdapter(productImages,productNames);
        recyclerView.setAdapter(customAdapter);
        return root;
    }
}
