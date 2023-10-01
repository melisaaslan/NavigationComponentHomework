package com.maslan.navigationcomponent.ui.sonucekrani

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.maslan.navigationcomponent.R
import com.maslan.navigationcomponent.common.delegete.viewBinding
import com.maslan.navigationcomponent.databinding.FragmentSonucEkraniBinding
import com.maslan.navigationcomponent.ui.custom.CustomFragmentDirections


class SonucEkraniFragment : Fragment(R.layout.fragment_sonuc_ekrani) {

    private val binding by viewBinding(FragmentSonucEkraniBinding::bind)

    private val args by navArgs<SonucEkraniFragmentArgs>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.butongeri.setOnClickListener {


            findNavController().navigate(R.id.anasayfaFragment)
            //buraya tekrar bak

        }
        with(binding) {

            textView7.text = args.sorular.nameSurname
            textView3.text = args.sorular.email
            textView4.text = args.sorular.phone
            textView5.text = args.sorular.hobi
            textView6.text = args.sorular.hobibir
            textView8.text = args.sorular.hobiiki





        }
} }