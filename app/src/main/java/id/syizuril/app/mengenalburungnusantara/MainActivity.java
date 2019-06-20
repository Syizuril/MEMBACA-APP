package id.syizuril.app.mengenalburungnusantara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Burung> list = new ArrayList<>();
    final String STATE_TITLE = "state_title";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";
    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();

        if(savedInstanceState == null){
            setActionBarTitle("Mode List");
            list.addAll(BurungData.getListData());
            showRecyclerList();
            mode = R.id.action_list;
        }else{
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<Burung> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            setActionBarTitle(stateTitle);
            list.addAll(stateList);
            setMode(stateMode);
        }
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListBurungAdapter listBurungAdapter = new ListBurungAdapter(this);
        listBurungAdapter.setListBurung(list);
        rvCategory.setAdapter(listBurungAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedBurung(list.get(position));
            }
        });
    }

    private void showSelectedBurung(Burung burung){
        Intent data = new Intent(this, DetailActivity.class);
        data.putExtra(DetailActivity.EXTRA_NAMA, burung.getName());
        data.putExtra(DetailActivity.EXTRA_REMARKS, burung.getRemarks());
        data.putExtra(DetailActivity.EXTRA_PHOTO, burung.getPhoto());
        data.putExtra(DetailActivity.EXTRA_KERAJAAN, burung.getKerajaan());
        data.putExtra(DetailActivity.EXTRA_KELAS, burung.getKelas());
        data.putExtra(DetailActivity.EXTRA_GENUS, burung.getGenus());
        data.putExtra(DetailActivity.EXTRA_DESKRIPSI, burung.getDeskripsi());
        data.putExtra(DetailActivity.EXTRA_FAMILIA, burung.getFamilia());
        data.putExtra(DetailActivity.EXTRA_ORDO, burung.getOrdo());
        data.putExtra(DetailActivity.EXTRA_SPESIES, burung.getSpesies());
        startActivity(data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        String title = null;
        switch (selectedMode){
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }
        mode = selectedMode;
        setActionBarTitle(title);
    }

    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridBurungAdapter gridBurungAdapter = new GridBurungAdapter(this);
        gridBurungAdapter.setListBurung(list);
        rvCategory.setAdapter(gridBurungAdapter);
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST, list);
        outState.putInt(STATE_MODE, mode);
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewBurungAdapter cardViewBurungAdapter = new CardViewBurungAdapter(this);
        cardViewBurungAdapter.setListBurung(list);
        rvCategory.setAdapter(cardViewBurungAdapter);
    }

}
