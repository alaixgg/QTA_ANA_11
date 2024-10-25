package com.example.qta_octubre

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Bottom_bar : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_bar, container, false)
    }

   fun ir_mitades(view: View){
       val intent = Intent(requireContext(), Dos_mitades::class.java)
       startActivity(intent)
   }
    fun ir_palabras(view: View){
        val intent = Intent(requireContext(), Dos_palabras::class.java)
        startActivity(intent)
    }
    fun ir_quitar(view: View){
        val intent = Intent(requireContext(), quitar::class.java)
        startActivity(intent)
    }
}