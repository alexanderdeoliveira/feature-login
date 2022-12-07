package com.alexander.login.data.datasource

import com.alexander.login.data.model.LoginResponse

internal interface LoginRemoteDataSource {
    suspend fun login(user: String, password: String): LoginResponse?
}