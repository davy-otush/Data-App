package com.otundo.dataapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var count = MutableLiveData<Int>()

    fun updateCount() {
        count.value = count.value?.plus(1)

    }
    init {
       count.value = 0
    }
}