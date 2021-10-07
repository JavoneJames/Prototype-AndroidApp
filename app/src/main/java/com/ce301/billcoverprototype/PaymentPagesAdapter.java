package com.ce301.billcoverprototype;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PaymentPagesAdapter extends FragmentStateAdapter {
    public PaymentPagesAdapter(@NonNull PaymentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new SoloPaymentActivity();
        }
        return new GroupPaymentActivity();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
