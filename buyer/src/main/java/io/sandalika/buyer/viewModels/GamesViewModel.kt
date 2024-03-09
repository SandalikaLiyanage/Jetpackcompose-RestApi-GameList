package io.sandalika.buyer.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.sandalika.buyer.config.ApiService
import io.sandalika.buyer.models.Game
import kotlinx.coroutines.launch

class GamesViewModel : ViewModel(){
    private val _games =  mutableStateListOf<Game>()
    var error : String by mutableStateOf("")
    val games : List<Game>
        get() = _games

    fun getGames(){
        viewModelScope.launch {
            val apiService =ApiService.getInstance()
            try{
                _games.clear()
                _games.addAll(apiService.getGames().subList(0, 10))
            }catch (e: Exception){
                error= e.message.toString()
            }
        }
    }

}