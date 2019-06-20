package id.syizuril.app.mengenalburungnusantara;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_REMARKS ="extra_remarks";
    public static final String EXTRA_KERAJAAN = "extra_kerajaan";
    public static final String EXTRA_KELAS = "extra_kelas";
    public static final String EXTRA_ORDO = "extra_ordo";
    public static final String EXTRA_FAMILIA = "extra_familia";
    public static final String EXTRA_GENUS = "extra_genus";
    public static final String EXTRA_SPESIES = "extra_spesies";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";

    TextView tvNama, tvRemarks, tvKerajaan, tvKelas, tvOrdo, tvFamilia, tvGenus, tvSpesies, tvDeskripsi;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_item_name);
        tvRemarks = findViewById(R.id.tv_item_remarks);
        imgPhoto = findViewById(R.id.img_item_photo);
        tvKerajaan = findViewById(R.id.tv_item_kerajaan);
        tvKelas = findViewById(R.id.tv_item_kelas);
        tvOrdo = findViewById(R.id.tv_item_ordo);
        tvFamilia = findViewById(R.id.tv_item_familia);
        tvGenus = findViewById(R.id.tv_item_genus);
        tvDeskripsi = findViewById(R.id.tv_item_deskripsi);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String kerajaan = getIntent().getStringExtra(EXTRA_KERAJAAN);
        String kelas = getIntent().getStringExtra(EXTRA_KELAS);
        String ordo = getIntent().getStringExtra(EXTRA_ORDO);
        String familia = getIntent().getStringExtra(EXTRA_FAMILIA);
        String genus = getIntent().getStringExtra(EXTRA_GENUS);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);

        tvNama.setText(nama);
        tvKerajaan.setText(kerajaan);
        tvKelas.setText(kelas);
        tvOrdo.setText(ordo);
        tvFamilia.setText(familia);
        tvGenus.setText(genus);
        tvDeskripsi.setText(deskripsi);

        Glide.with(DetailActivity.this)
                .load(getIntent().getStringExtra(EXTRA_PHOTO))
                .into(imgPhoto);
    }
}
