package com.example.kotlinexp

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment : Fragment() {


    lateinit var viewmodel: ViewModelClass


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View? = inflater.inflate(R.layout.fragment_main, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ViewModelProviders.of(this).get(ViewModelClass::class.java)
        if (resources.getBoolean(R.bool.isTablet)){
            initDataForTablet()
        }else{
            initDataForPhone()
        }
    }

    fun initDataForPhone(){

    }

    fun initDataForTablet(){

    }

}