package com.example.bhavanielectronics.ui.home;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bhavanielectronics.R;

public class HomeFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        TextView homeDesc = root.findViewById(R.id.textView1);
        String home = "We “Bhavani Engineering” have gained success in the market by manufacturing, exporting and supplying a durable collection of Screw Barrel (single,Twin parallel, conical, injection moulding) food process screw barrel, various types of blades.We are exporting our products around the world.  We are a Sole Proprietorship company that is incorporated in the year 2008 at Ahmedabad (Gujarat, India) and always strive hard to provide our valued customers with qualitative range of barrels and sleeves as per the global set standards.We are a well known firm that is managed under the supervision of our Proprietor  “Mr. Kamlesh Patel” and have gained enormous clientele across the nation.";
        homeDesc.setMovementMethod(new ScrollingMovementMethod());
        homeDesc.setText(home);
        return root;
    }
}
