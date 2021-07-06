package com.example.myapplication.network

enum class ResponseResultStatus {
    SUCCESS,
    LOADING,
    ERROR
}

data class ResponseResult<S>(
        var status: ResponseResultStatus? = null,
        var result: S? = null,
        var message: String? = null,
        var code: Int? = null
) {
    companion object {
        fun <S> success(data: S?): ResponseResult<S> {
            return ResponseResult(ResponseResultStatus.SUCCESS, data)
        }

        fun <S> error(message: String?, data: S? = null): ResponseResult<S> {
            return ResponseResult(ResponseResultStatus.ERROR, data, message)
        }

        fun <S> loading(message: String? = null): ResponseResult<S> {
            return ResponseResult(ResponseResultStatus.LOADING, null, message)
        }
    }
}