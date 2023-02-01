package com.example.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.textview.MaterialTextView;

public class MyBottomSheet extends BottomSheetDialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_sheet,container,false);

        MaterialTextView tvDownload = v.findViewById(R.id.tvDownload);
        MaterialTextView tvCopy = v.findViewById(R.id.tvCopy);

        tvDownload.setOnClickListener(v1 -> {
            Toast.makeText(requireContext() , "Downloading", Toast.LENGTH_SHORT).show();
        });
        tvCopy.setOnClickListener(v1 -> {
            Toast.makeText(requireContext() , "Link Copy", Toast.LENGTH_SHORT).show();
        });

        return v;
    }
}
