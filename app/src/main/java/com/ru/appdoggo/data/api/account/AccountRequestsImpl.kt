package com.ru.appdoggo.data.api.account

import com.ru.appdoggo.data.api.ApiService
import com.ru.appdoggo.data.api.BaseRequest
import com.ru.appdoggo.data.api.NetworkResult
import javax.inject.Inject

/**
 * Имплементация AccountRequests
 */
class AccountRequestsImpl @Inject constructor(
    private val apiService: ApiService,
    private val requests: BaseRequest
) : AccountRequests {

    override fun register(username: String, password: String): NetworkResult<String> {
        return requests.make(apiService.register(createMapForRegister(username, password)))
    }

    override fun login(username: String) {
        TODO("Not yet implemented")
    }


    private fun createMapForRegister(
        username: String,
        password: String
    ): Map<String, String> {
        val map = HashMap<String, String>()
        map.put(ApiService.USERNAME_PARAM, username)
        map.put(ApiService.PASSWORD_PARAM, password)
        return map
    }
}