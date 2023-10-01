package com.maslan.navigationcomponent.ui.kisiselbilgiler

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.maslan.navigationcomponent.R
import com.maslan.navigationcomponent.common.delegete.viewBinding
import com.maslan.navigationcomponent.data.model.KisiselBilgiModel
import com.maslan.navigationcomponent.databinding.FragmentKisiselBilgilerBinding


class KisiselBilgilerFragment : Fragment(R.layout.fragment_kisisel_bilgiler) {
    private val binding by viewBinding(FragmentKisiselBilgilerBinding::bind)

    private val args by navArgs<KisiselBilgilerFragmentArgs>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView2.text = args.name

        binding.butonsonraki.setOnClickListener {

            val email = binding.emailAdres.text.toString()
            val phone = binding.phone.text.toString()
            val kisiselObject = KisiselBilgiModel(args.name, phone, email)

            val action =
                KisiselBilgilerFragmentDirections.actionKisiselBilgilerFragmentToCustomFragment(
                    kisiselObject
                )

            findNavController().navigate(action)
        }


    }


}