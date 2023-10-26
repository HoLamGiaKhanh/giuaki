package com.example.eduuefthithuchanh;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<SanPham > listSanPham;
    SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        listSanPham=new ArrayList<>();
        listSanPham.add(new SanPham("Beer",45000,R.drawable.beer));
        listSanPham.add(new SanPham("Coconut Cocktail",19000000,R.drawable.coconutcocktail));
        listSanPham.add(new SanPham("Lemonade",23000000,R.drawable.lemonade));
        listSanPham.add(new SanPham("Milkshade",14000000,R.drawable.milkshake));
        listSanPham.add(new SanPham("Orange juice",14000000,R.drawable.orangejuice));
        listSanPham.add(new SanPham("Coke",14000000,R.drawable.coke));
        listSanPham.add(new SanPham("Soda",14000000,R.drawable.soda));
        sanPhamAdapter=new SanPhamAdapter(getApplicationContext(),listSanPham);
        recyclerView.setAdapter(sanPhamAdapter);
    }
}
