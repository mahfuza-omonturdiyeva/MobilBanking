package uz.gita.mobilbanking.viewmodel.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import uz.gita.mobilbanking.data.request.LoginRequest
import uz.gita.mobilbanking.data.common.MyResult
import uz.gita.mobilbanking.domain.AuthRepository
import uz.gita.mobilbanking.utils.isConnected

class LoginViewModel : ViewModel() {
//    private val authRepository = AuthRepository()
//    val successLoginLiveData = MutableLiveData<Unit>()
//    val errorLiveData = MutableLiveData<String>()
//    val notConnectionLiveData = MutableLiveData<String>()
//    val progressLiveData = MutableLiveData<Boolean>()
//
//    fun login(data: LoginRequest) {
//        if (!isConnected()) {
//            notConnectionLiveData.value = "Internet mavjud emas"
//            return
//        }
//        progressLiveData.value = true
//        viewModelScope.launch(Dispatchers.IO) {
//            val result = authRepository.userLogin(data)
//            progressLiveData.postValue(false)
//            when (result) {
//                is MyResult.Success -> {
//                    successLoginLiveData.postValue(Unit)
//                }
//                is MyResult.Error -> {
//                    errorLiveData.postValue(result.error.message)
//                }
//
//                is MyResult.Message -> {
//                    errorLiveData.postValue(result.data)
//                }
//            }
//        }
//    }
}