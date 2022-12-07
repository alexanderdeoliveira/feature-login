package com.alexander.login.data.repository

import com.alexander.login.data.datasource.LoginRemoteDataSource
import com.alexander.login.data.model.LoginResponse

internal class LoginRepositoryImpl(
    private val loginRemoteDataSource: LoginRemoteDataSource
): LoginRepository {
    override suspend fun login(user: String, password: String): LoginResponse? {
        return loginRemoteDataSource.login(user, password)
    }
}