package com.maslan.navigationcomponent.ui.anasayfa

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.maslan.navigationcomponent.R
import com.maslan.navigationcomponent.common.delegete.viewBinding
import com.maslan.navigationcomponent.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment(R.layout.fragment_anasayfa) {
    private val binding by viewBinding(FragmentAnasayfaBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonbasla.setOnClickListener {
            val nameSurname = binding.etName.text.toString()

            val action =
                AnasayfaFragmentDirections.anasayfaTobilgiler(
                    nameSurname
                )

            findNavController().navigate(action)
        }

    }

}
