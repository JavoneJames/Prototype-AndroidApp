 package com.ce301.billcoverprototype;


 import android.os.Bundle;

 import androidx.annotation.Nullable;
 import androidx.appcompat.app.AppCompatActivity;
 import androidx.viewpager2.widget.ViewPager2;

 import com.google.android.material.tabs.TabLayout;
 import com.google.android.material.tabs.TabLayoutMediator;

 public class PaymentActivity extends AppCompatActivity {

     @Override
     protected void onCreate(@Nullable Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_payment);

         ViewPager2 viewPager2 = findViewById(R.id.view_page);
         viewPager2.setAdapter(new PaymentPagesAdapter(this));
         TabLayout tabLayout = findViewById(R.id.tablayout);
         TabLayoutMediator mediator = new TabLayoutMediator(tabLayout, viewPager2,
                 (tab, position) -> {
                     if (position == 0) {
                         tab.setText("Solo Payment");
                     }else{
                         tab.setText("Group Payment");
                     }
                 });
         mediator.attach();
     }
 }
