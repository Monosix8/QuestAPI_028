package com.example.localrestapi.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.localrestapi.modeldata.DetailSiswa
import com.example.localrestapi.modeldata.UIStateSiswa
import com.example.localrestapi.modeldata.toDataSiswa
import com.example.localrestapi.repositori.RepositoryDataSiswa
import retrofit2.Response

class EntryViewModel(private val repositoryDataSiswa: RepositoryDataSiswa):
    ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

