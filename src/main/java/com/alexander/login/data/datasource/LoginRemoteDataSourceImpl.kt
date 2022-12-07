package com.alexander.login.data.datasource

import com.alexander.login.data.api.LoginApi
import com.alexander.login.data.model.LoginResponse

internal class LoginRemoteDataSourceImpl(
    private val loginApi: LoginApi
): LoginRemoteDataSource {
    override suspend fun login(user: String, password: String): LoginResponse? {
        return loginApi.login(user, password)
    }
}