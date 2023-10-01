package com.maslan.navigationcomponent.ui.custom

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.maslan.navigationcomponent.R
import com.maslan.navigationcomponent.common.delegete.viewBinding
import com.maslan.navigationcomponent.data.model.SorularModel
import com.maslan.navigationcomponent.databinding.FragmentCustomBinding

class CustomFragment : Fragment(R.layout.fragment_custom) {
    private val binding by viewBinding(FragmentCustomBinding::bind)

    private val args by navArgs<CustomFragmentArgs>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvName.text = args.information.nameSurname

        binding.butonsonraki2.setOnClickListener {

            val hobi = binding.cevap1.text.toString()
            val hobibir = binding.cevap2.text.toString()
            val hobiiki = binding.cevap3.text.toString()

            val customObject = SorularModel(
                args.information.nameSurname,
                args.information.email,
                args.information.phone,
                hobi,
                hobibir,
                hobiiki
            )

            val action =
                CustomFragmentDirections.actionCustomFragmentToSonucEkraniFragment(
                    customObject
                )

            findNavController().navigate(action)


        }


    }


}