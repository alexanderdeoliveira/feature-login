package com.alexander.login.data.api

import com.alexander.login.data.model.LoginResponse

internal interface LoginApi {
    suspend fun login(user: String, password: String): LoginResponse
}