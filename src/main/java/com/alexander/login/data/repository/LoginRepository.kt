package com.alexander.login.data.repository

import com.alexander.login.data.model.LoginResponse

internal interface LoginRepository {
    suspend fun login(user: String, password: String): LoginResponse?
}