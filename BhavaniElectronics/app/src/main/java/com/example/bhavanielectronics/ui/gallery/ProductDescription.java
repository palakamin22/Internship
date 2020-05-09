package com.example.bhavanielectronics.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bhavanielectronics.R;

public class ProductDescription extends AppCompatActivity {
    ImageView selectedImage;
    String pro1 = "We are the renowned organization engaged in manufacturing and supplying of a broad range of premium quality Single Screw Barrel, which is widely used for extrusion plants. These all products are manufactured using latest technologies & machines and raw material sourced from reputed and trusted venders in the market. Available in various sizes and specifications, we offer these products at affordable rates.\n" +
            "High quality material:\n" +
            "The single screw is made with high-grade material MUSCO. With the best material, it is unmatched in terms of quality and performance. With stunning finish, it is very durable. The single screw barrel has been constructed with the use of quality MUSCO material. It features attractive finish that enhances its overall profile. Due only to the flawless quality and robust structure, it has a long-lasting life.\n" +
            "Different sizes:\n" +
            "Screw is available in 14mm—250mm to maximum length of 4500mm. We also provide customized solutions based on the specific requirements of our invaluable clients.Through a strict quality test at every stage of production, we make sure the single screw is flawless.\n" +
            "Barrel is available in a variety of different sizes ranging from 14mm - 250mm. The barrels are available up to 3000mm diameter - 5000mm in length. Depending on the individual needs of our clients, we also customize the screw barrel.";
    String pro2 = "With the sound team efforts & experienced workers we are able to manufacture best quality Twin Parallel Screw Barrel. This product is best known for its quick & easy to use. Hassel frees operations, smooth functioning, Low maintenance and most important thing it gives you high output compare to other screw barrel.\n" +
            "Equipped with the ultra-modern design and finest construction, the screw exemplifies superiority and power.\n" +
            "The twin screw has been made with MUSCO and other quality materials. With smooth finish, it looks elegant. With regard to durability, there is no match of its strength.\n" +
            "Prepared with the use of advanced machinery, it stands out purely in terms of flawless quality and unbeatable performance.\n" +
            "It is available in many different models and designs. We offer the twin screw with or without groove feed as per needs.\n" +
            "Moreover, we also customize the twin screw in keeping with the requirements of our clients. Our most skilled and experienced in this professionals take special care of quality and they make sure the product is faultless.\n" +
            "The unique design of screw barrel is such that it consumes the less space & gives the high output. Twin screw barrels are demandable in the market because of its functioning. We have supply so many screw barrel in India and across the globe.\n" +
            "Twin screw and barrel:\n" +
            "Backed by the vast experience of the industry, we are involved in the manufacturing and supplying Twin Screw Barrel in different sizes and length. The product is suitable for heat as well as shear sensitive material. Our product range is well accepted by our clients for high precision and accuracy.";
    String pro3 = "We are considered as one the prominent manufacturer & supplier of Conical Screw Barrel. These conical screw barrel are used in PVC Pipe making machinery (conical twin screw extruder).\n" +
            "This is dynamically utilized in a wide range of plastic handling hardware. Offered barrel is made at our well-propelled creation unit under the direction of our adroit experts by making utilization of fine quality materials. Additionally, offered Conical Twin Screw Barrel is effectively accessible with us at debatable costs inside assessed time range.\n" +
            "The extensive research for providing Conical Twin Barrel maker to the customers is making us renowned best qualitative product provider in the industry.With smooth finish, it looks elegant. With regard to durability, there is no match of its strength. We have supply so many conical screw barrel in India and across the globe.\n" +
            "We are considered as one the prominent manufacturer & supplier of Conical Screw Barrel. These conical screw barrel are used in PVC Pipe making machinery (conical twin screw extruder)";
    String pro4 = "we are the renowned organization engaged in manufacturing and supplying of a broad range of premium quality Segment Screw Barrel.\n" +
            "Range: Bore Diameter 20 mm to Diameter 125 mm Sleeve: HSSM2 Grade sleeve for better wear resistance-through hardness - HRC 62-63 or Nitrided sleeve made from EN-41-B material-layer hardness Outer body made from EN-8 material Dwelling and Drilling operation by using accurate jigs & fixtures Both faces ground and lapped.";
    String pro5 = "Injection Moulding Screw is fabricated using the most advanced and technologically upbeat parts & components. Clients may contact us for availing vertical & horizontal molding machines & wire striping machines, which are controlled by Electrical PLC Panel. Clients appreciate these machines for their international standard and flawless performance.\n" +
            "As for quality materials, we are very particular and always make sure we have the best quality. The injection molding screw defines perfection as it has been made with superior materials. The incomparably strong structure allows the screw to last long.\n" +
            "The stringent quality test mechanism ensures the products are unblemished on every factor.\n" +
            "The molding screw comes in a comprehensive range of models. It is available in 25mm to 200mm. The maximum length of the product is up to 5 meters. The moulding screw is also prepared based on specific industrial needs.\n" +
            "The molding screw comes in a comprehensive range of models. It is available in 25mm to 200mm. The maximum length of the product is up to 5 meters. The moulding screw is also prepared based on specific industrial needs.\n" +
            "In order to suit specific industrial requirements, we offer in tons of different inner and outer diameters along with tons of models and designs. Moreover, they are also designed depending on particular specifications.";
    String pro6 = "Food process screw barrel is used for handling an extensive variety of eatable materials for human utilization. They are very often used in things that we use on a regular basis, in the form of extruded food including khakhra making machine, frimes making machine prepared meats,pasta,grains,cereals,candy and other foods making machine.\n" +
            "There are many companies that manufacture Food Extrusion Screw Barrel but Bhavani Engineering is known among the top and most prestigious organizations that are creating a wide variety of Screw Barrels.\n" +
            "The diligent work and commitment of the organization towards its client is what that has empowered it to get tremendous success and reach this point. These days, this association has spread its wings from India to abroad. The product offered by this company acquired the most part of the supply in twin and single screws market as they are the used ones by plastic industries.\n" +
            "With the course of time, Bhavani Engineering has built up reputation and it is constantly known for its high caliber and credible supply of Food Extrusion Screw Barrel. We have a group of well skilled laborers and experienced people, who are constantly prepared to acknowledge new difficulties and chances.";
    String pro7 = "The grooved feed barrel is used for achieving high shear and better transportation of material. As Co-efficient of friction between granules and screw and barrel should be higher to get proper melting of the material, It's imperative to have grooved feed in the barrel for processing of polymers of Olefin group.Size-30 mm to 150 mm. It is available in comprehensive range of designs and models.\n" +
            "The futuristic screw barrel is equipped to offer maximum output. Its excellent performance is what separates it from others. It is ideal to be used in a number of applications such as, plastic machineries, rubber machines and single screw extrusion plants and more.";
    String pro8 = "Sleeve of High Speed Steel provides extra life to Barrel against wear and tear over only Nitried Barrel.\n" +
            "In case of hard material processed by plastifying system we provide HSS Sleeve fitted barrels.and tungsten carbide coated screws which due to the higher degree of wear resistance.Specially abrasion and corrosion resistance under high temperatures and pressure. Assure considerably longer service life than that of standard nitride barrels.\n" +
            "Range: The thickness of the sleeve is from 5-6 mm and throughout hardness of the sleeve is from 62-64 HRC.Bore Diameter 20 mm to Diameter 125 mm Sleeve: HSSM2 Grade sleeve for better wear resistance-through hardness - HRC 62-63 or Nitrided sleeve made from EN-41-B material-layer hardness Outer body made from EN-8 material Dwelling and Drilling operation by using accurate jigs & fixtures Both faces ground and lapped.";
    String pro9 = "The suitable process of blade production are casting, stamping and forging, we can still produce the blade even with different material. But every process must has it’s limitations and own advantages. We can make blades according to client design. Reputed manufacturer’s & Imported blades can be made. We provide tungsten carbide coating on the edges of the blade to perform better against wear & tear. High efficiency even high filler loading. Blades are made from original material. Test report can be given for blade material on request. Blades are dynamically balanced and smooth finished.";
    String pro10 = "The offered blade is developed according to the set industry parameters hence ensuring its high performance and durability. Auto-cut-off the machine in case of any sequence fault. Pulverizer Blade are available in various configurations like single mill, double mill, horizontals mill (to be introduced). With various designs, sizes and shapes of Pulverizer blades. Further, these products can be received at competent market price.";
    String pro11 = "Bhavani Engineering is known for best quality Ring Plunger Sets. This Ring Plunger Set is mostly applicable for injection molding machine. This product has the high tensile strength appreciated in the market for its precise construction and exceptional strength. Our customer can avail a various sizes and designs from Us . We use nitro alloy en41b materials to make Ring Plunger Set Torpedo sets.\n" +
            "our body construction of Ring Plunger Set Torpedo\n" +
            "To assure the best quality hardness nitro alloy is toughened up to 30/32 RC in ‘S' or ‘T' condition\n" +
            "Proper machining is being done to achieve inner as well outer layer (0.5 mm and 1 mm respectively).\n" +
            "During the machining process the bottom hardness of ring plunger is being reduced by 2 RC using stress development.\n" +
            "After the stress development the part is to be relived & it is known as stress relieving & inner as well as outer layer diameter will be grinding.\n" +
            "The gas nitrading process will be done to give the surface hardness it is upto 64/66 RC.\n" +
            "For durability case depth up to 0.5/0.6 mm provided.";
    String f1 = "Accurate dimension\n" +
            "Resistance to corrosion\n" +
            "High durability\n" +
            "Ultra strong";
    String f2 = "Nitro Alloy Material is used\n" +
            "As per International standard\n" +
            "Customized Solution Provider\n" +
            "High Tensile strength & durable\n" +
            "Accurate dimension\n" +
            "Resistance to corrosion\n" +
            "Maximum durability";
    String f3 = "Long Durability\n" +
            "Corrosion Residency\n" +
            "High quality material\n" +
            "Strong built up";
    String f4 = "Long Durability\n" +
            "Corrosion Residency\n" +
            "Competitive Price";
    String f5 = "Long Durability\n" +
            "Corrosion Residency\n" +
            "Futuristic technologies\n" +
            "Excellent material\n" +
            "Strong built-up\n" +
            "Superior on every parameter";
    String f6 = "Long Durability\n" +
            "Corrosion Residency\n" +
            "Competitive Price\n" +
            "Maximum output";
    String f7 = "Long Durability\n" +
            "Corrosion Residency\n" +
            "Competitive Price\n" +
            "Maximum output";
    String f8 = "Long Durability\n" +
            "Corrosion Residency\n" +
            "Competitive Price\n" +
            "Accurate dimensions";
    String f9 = "Portable\n" +
            "Rechargeable\n" +
            "Excellent finish";
    String f10 = "Durable\n" +
            "Highly efficient\n" +
            "Reliable performance\n" +
            "Robustness";
    String f11 = "Long Durability\n" +
            "Corrosion Residency\n" +
            "Competitive Price";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);
        int[] productImages = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9, R.drawable.pic10, R.drawable.pic11};
        TextView header = findViewById(R.id.header);
        ImageView imageSelected = findViewById(R.id.imageSelected);
        TextView description = findViewById(R.id.desc);
        TextView features = findViewById(R.id.feature);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        header.setText(name);
        switch (name){
            case "Single Screw And Barrel":
                imageSelected.setImageResource(productImages[0]);
                description.setText(pro1);
                features.setText(f1);
                break;
            case "Parallel Twin Screw And Barrel":
                imageSelected.setImageResource(productImages[1]);
                description.setText(pro2);
                features.setText(f2);
                break;
            case "Conical Screw And Barrel":
                imageSelected.setImageResource(productImages[2]);
                description.setText(pro3);
                features.setText(f3);
                break;
            case "Segment Screw And Barrel":
                imageSelected.setImageResource(productImages[3]);
                description.setText(pro4);
                features.setText(f4);
                break;
            case "Injection Moulding Screw And Barrel":
                imageSelected.setImageResource(productImages[4]);
                description.setText(pro5);
                features.setText(f5);
                break;
            case "Food Process Screw And Barrel":
                imageSelected.setImageResource(productImages[5]);
                description.setText(pro6);
                features.setText(f6);
                break;
            case "Groove Feed Sleeve And Barrel":
                imageSelected.setImageResource(productImages[6]);
                description.setText(pro7);
                features.setText(f7);
                break;
            case "Hss Sleeve":
                imageSelected.setImageResource(productImages[7]);
                description.setText(pro8);
                features.setText(f8);
                break;
            case "Mixer Blades":
                imageSelected.setImageResource(productImages[8]);
                description.setText(pro9);
                features.setText(f9);
                break;
            case "Pulverizer Blade":
                imageSelected.setImageResource(productImages[9]);
                description.setText(pro10);
                features.setText(f10);
                break;
            case "Screws Ring Plunger And Torpedo":
                imageSelected.setImageResource(productImages[10]);
                description.setText(pro11);
                features.setText(f11);
                break;
            default:
                Log.e("tag","not done");
                break;
        }
    }
}
