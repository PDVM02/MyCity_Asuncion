package com.villalbapablo.asuncion.ui

import androidx.lifecycle.ViewModel
import com.villalbapablo.asuncion.data.LocalAsuncionDataProvider
import com.villalbapablo.asuncion.model.Asuncion
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class AsuncionViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        AsuncionUiState(
            asuncionList = LocalAsuncionDataProvider.getAsuncionData(),
            currentAsuncion = LocalAsuncionDataProvider.getAsuncionData().getOrElse(0) {
                LocalAsuncionDataProvider.defaultAsuncion
            }
        )
    )
    val uiState: StateFlow<AsuncionUiState> = _uiState

    fun updateCurrentAsuncion(selectedAsuncion: Asuncion) {
        _uiState.update {
            it.copy(currentAsuncion = selectedAsuncion)
        }
    }

    fun navigateToListPage() {
        _uiState.update {
            it.copy(isShowingListPage = true)
        }
    }


    fun navigateToDetailPage() {
        _uiState.update {
            it.copy(isShowingListPage = false)
        }
    }
}

data class AsuncionUiState(
    val asuncionList: List<Asuncion> = emptyList(),
    val currentAsuncion: Asuncion = LocalAsuncionDataProvider.defaultAsuncion,
    val isShowingListPage: Boolean = true
)
