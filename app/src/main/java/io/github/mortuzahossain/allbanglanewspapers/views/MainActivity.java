package io.github.mortuzahossain.allbanglanewspapers.views;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.mortuzahossain.allbanglanewspapers.R;
import io.github.mortuzahossain.allbanglanewspapers.adapter.TabAdapter;
import io.github.mortuzahossain.allbanglanewspapers.utils.SharingUtils;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_share:
                SharingUtils.shareAPK(this);
                return true;
            case R.id.menu_send:
                SharingUtils.sendInformation(this, "Share via", "Download Apps", "Download All " +
                        "Bangla Newspaper apps and more from :" + "https://play.google.com/store/apps/details?id=" + getPackageName() + "&hl=en_US");
                return true;
            case R.id.menu_rate:
                SharingUtils.showRateDialog(this, "Rate App", "Rate this app on playstore if it is " +
                        "helpfull and share your fillings with us.", R.drawable.ic_baseline_rate_review);
                return true;
            case R.id.menu_more:
                SharingUtils.showMoreApps(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}