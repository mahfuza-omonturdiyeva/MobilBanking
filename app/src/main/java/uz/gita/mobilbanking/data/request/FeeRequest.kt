package uz.gita.mobilbanking.data.request


data class FeeRequest(
    var sender: Int,
    var receiverPan: String,
    var amount: Double
)