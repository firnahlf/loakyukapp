package com.example.firna.loakyuk2;

import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class jual_user extends AppCompatActivity {

        @BindView(R.id.ivHome)
        ImageView ivHome;
        @BindView(R.id.ivList)
        ImageView ivList;

        @BindView(R.id.frameFragment)
        FrameLayout frameFragment;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_jual_user);

            ButterKnife.bind(this);

            initFragment(new HomeFragment());

            ivHome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    initFragment(new HomeFragment());
                }
            });

            ivSearch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    initFragment(new ListFragment());
                }
            });


        }

        private void initFragment(Fragment classFragment) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameFragment, classFragment);
            transaction.commit();
        }
    }
