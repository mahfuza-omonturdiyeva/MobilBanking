package uz.gita.mobilbanking.ui.screen.transfer

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.mobilbanking.R
import uz.gita.mobilbanking.databinding.ScreenTransferAllCardsBinding
import uz.gita.mobilbanking.ui.adapter.CardAdapter
import uz.gita.mobilbanking.utils.showToast
import uz.gita.mobilbanking.viewmodel.transfers.impl.TransfersViewModelImpl

@AndroidEntryPoint
class AllReceiverCardsScreen : Fragment(R.layout.screen_transfer_all_cards) {
    private val binding by viewBinding(ScreenTransferAllCardsBinding::bind)
    private val viewModel: TransfersViewModelImpl by activityViewModels<TransfersViewModelImpl>()
    private lateinit var adapter: CardAdapter

    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter=CardAdapter(){
            viewModel.setReceiverPan(it.pan)
            findNavController().navigate(AllReceiverCardsScreenDirections.actionAllReceiverCardsScreenToTransfersScreen2())
        }
        binding.containerCards.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        binding.containerCards.adapter=adapter

        viewModel.getAllCardNotSender()

        viewModel.progressLiveData.observe(this, progressObserver)
        viewModel.notConnectionLiveData.observe(this,notConnectionObserver)
        viewModel.allCardNotSenderLiveData.observe(this){
            adapter.submitList(it)
        }
        viewModel.errorLiveData.observe(this,errorObserver )
        viewModel.messageLiveData.observe(this, messageObserver)

        binding.imgBtnClose.setOnClickListener {
            findNavController().navigate(AllReceiverCardsScreenDirections.actionAllReceiverCardsScreenToTransfersScreen2())
        }
    }

    private val messageObserver = Observer<String> {
        showToast(it)
    }
    private val errorObserver = Observer<String> {
        showToast(it)
    }
    private val notConnectionObserver = Observer<String> {
        showToast(it)
    }
    private val progressObserver = Observer<Boolean> {
        if (it) {
            binding.progress.visibility = View.VISIBLE
        } else binding.progress.visibility = View.GONE
    }
}