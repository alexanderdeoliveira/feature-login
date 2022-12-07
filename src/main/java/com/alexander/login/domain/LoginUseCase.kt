package com.alexander.login.domain

import com.alexander.login.data.model.LoginResponse

internal interface LoginUseCase {
    suspend fun login(user: String, password: String): LoginResponse?
}