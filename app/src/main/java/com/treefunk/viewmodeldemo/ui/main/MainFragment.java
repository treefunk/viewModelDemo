package com.treefunk.viewmodeldemo.ui.main;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.arch.lifecycle.Observer;
import com.treefunk.viewmodeldemo.R;
import com.treefunk.viewmodeldemo.databinding.MainFragmentBinding;
import static com.treefunk.viewmodeldemo.BR.myViewModel;


public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
//    private EditText dollarText;
//    private Button convertButton;
//    private TextView resultText;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    public MainFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        binding = DataBindingUtil.inflate(inflater,R.layout.main_fragment,container,false);
        binding.setLifecycleOwner(this);

        return binding.getRoot();
//        return inflater.inflate(R.layout.main_fragment, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        binding.setVariable(myViewModel,mViewModel);

//        dollarText = getView().findViewById(R.id.dollarText);
//        resultText = getView().findViewById(R.id.resultText);
//        convertButton = getView().findViewById(R.id.convertButton);

//        resultText.setText(mViewModel.getResult().toString());
//
//        final Observer<Float> resultObserver = new Observer<Float>() {
//            @Override
//            public void onChanged(@Nullable final Float result) {
//                resultText.setText(result.toString());
//            }
//        };
//
//        mViewModel.getResult().observe(this,resultObserver);
//
//
//        convertButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!dollarText.getText().toString().equals("")){
//                    mViewModel.setAmount(dollarText.getText().toString());
////                    resultText.setText(mViewModel.getResult().toString());
//                }else{
//                    resultText.setText("No value");
//                }
//            }
//        });





        // TODO: Use the ViewModel
    }

}
