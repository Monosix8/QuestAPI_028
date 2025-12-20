package com.example.localrestapi.repositori

import com.example.mydatasiswa.model.DataSiswa
import com.example.mydatasiswa.service.ServiceApiSiswa
import retrofit2.Response

interface RepositoryDataSiswa {

    suspend fun getDataSiswa(): List<DataSiswa>

    suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepositoryDataSiswa {

    override suspend fun getDataSiswa(): List<DataSiswa> =
        serviceApiSiswa.getSiswa()

    override suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void> =
        serviceApiSiswa.postSiswa(dataSiswa)
}
