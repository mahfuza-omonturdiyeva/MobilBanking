package uz.gita.mobilbanking.utils

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}


fun Fragment.showToast(message: String) {
    requireContext().showToast(message)
}