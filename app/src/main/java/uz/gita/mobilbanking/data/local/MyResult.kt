package uz.gita.mobilbanking.data.local

sealed class MyResult<T> {
    class Success<T>(val data: T) : MyResult<T>()
    class Message<T>(val data: String) : MyResult<T>()
    class Error<T>(val error: Throwable) : MyResult<T>()
}