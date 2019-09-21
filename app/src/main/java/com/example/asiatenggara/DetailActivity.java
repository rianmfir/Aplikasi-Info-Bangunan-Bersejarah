package com.example.asiatenggara;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asiatenggara.Model.Bangunan;

import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    ImageView imagePhoto;
    TextView nama, tahun, keterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);

        Bangunan b = getIntent().getParcelableExtra("kunci");

        imagePhoto = findViewById(R.id.profile_image);
        nama = findViewById(R.id.nama_bangunan);
        tahun = findViewById(R.id.dibangun);
        keterangan = findViewById(R.id.keterangan);

        imagePhoto.setImageResource(b.getPhoto());

        nama.setText(b.getName());
        tahun.setText(b.getRemarks());
        keterangan.setText(b.getKet());

        setActionBarTitle("Bangunan Bersejarah");

    }

    private void setActionBarTitle(String tittle) {
        getSupportActionBar().setTitle(tittle);
    }
}
