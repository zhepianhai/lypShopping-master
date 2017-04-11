package zph.zhjx.com.shopping.me;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zph.zhjx.com.shopping.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {


    public MeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("TAG","MeFragment_onCreateView");
        return inflater.inflate(R.layout.fragment_me, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("TAG","MeFragment_onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("TAG","MeFragment_onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("TAG","MeFragment_onDestroy");
    }
}
