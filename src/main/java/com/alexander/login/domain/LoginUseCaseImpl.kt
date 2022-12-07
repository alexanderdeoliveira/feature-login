package com.alexander.login.domain

import com.alexander.login.data.model.LoginResponse
import com.alexander.login.data.repository.LoginRepository

internal class LoginUseCaseImpl(
    private val loginRepository: LoginRepository
): LoginUseCase {
    override suspend fun login(user: String, password: String): LoginResponse? {
        return loginRepository.login(user, password)
    }
}