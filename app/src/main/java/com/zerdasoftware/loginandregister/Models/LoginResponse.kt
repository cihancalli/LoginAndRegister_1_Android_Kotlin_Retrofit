package com.zerdasoftware.loginandregister.Models

data class LoginResponse(val error: Boolean, val message:String, val user: User)