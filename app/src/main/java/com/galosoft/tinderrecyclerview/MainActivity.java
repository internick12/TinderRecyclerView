  package com.galosoft.tinderrecyclerview;

  import android.os.Bundle;
  import android.support.v7.app.AppCompatActivity;

  import com.athbk.avatarview.TinderRecyclerView;
  import com.galosoft.tinderrecyclerview.Adapter.CustomAdapter;
  import com.galosoft.tinderrecyclerview.Model.Item;

  import java.util.ArrayList;
  import java.util.List;

  public class MainActivity extends AppCompatActivity {

    List<Item> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TinderRecyclerView recyclerView = findViewById(R.id.recycler_view);

        initData();

        CustomAdapter adapter = new CustomAdapter(itemList, this);
        recyclerView.initRecyclerView(this, adapter);

    }

      private void initData() {
        Item item = new Item("https://images.unsplash.com/photo-1568312442641-d6c790fdf0f6?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", 0);
        itemList.add(item);
        item = new Item("https://images.unsplash.com/photo-1567647753830-de3fe7ce9f28?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", 1);
        itemList.add(item);
        item = new Item("https://images.unsplash.com/photo-1567637903900-7a2f05e37e1a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", 2);
        itemList.add(item);
        item = new Item("https://images.unsplash.com/photo-1567117068494-1cb546a001ad?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", 3);
        itemList.add(item);
        item = new Item("https://images.unsplash.com/photo-1443926818681-717d074a57af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", 4);
        itemList.add(item);
        item = new Item("https://images.unsplash.com/photo-1446080501695-8e929f879f2b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", 5);
        itemList.add(item);


      }
  }
