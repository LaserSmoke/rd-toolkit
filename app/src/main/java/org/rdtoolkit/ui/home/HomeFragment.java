package org.rdtoolkit.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import org.rdtoolkit.MainActivity;
import org.rdtoolkit.R;

public class HomeFragment extends Fragment {

    HomeViewModel homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle saveInstanceState){
        super.onViewCreated(view,saveInstanceState);

        homeViewModel=new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        EditText edtxt_oatient_id =view.findViewById((R.id.edt_patient_id));
        EditText edtxt_test_id=view.findViewById(R.id.edt_test_id);

        Button button=view.findViewById(R.id.btn_start_test);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                homeViewModel.setPatientId(edtxt_oatient_id.getText().toString());
                homeViewModel.setTestId(edtxt_test_id.getText().toString());
                ((MainActivity)getActivity()).simulateTestRequest(view);
            }
        });
    }
}