package io.sandalika.buyer.ui.components

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import io.sandalika.buyer.ui.theme.MeredioTheme
import io.sandalika.buyer.viewModels.GamesViewModel

@Composable
fun GameList(vm:GamesViewModel){
    LaunchedEffect(Unit, block ={
        Log.d("GameList","calling")
        vm.getGames()
    })
   Column{
//       Button(onClick = { vm.getGames() }) {
//           Text(text = "Get Game")
//       }

       LazyColumn(modifier=Modifier.fillMaxWidth()) {
           items(vm.games) { game ->
               GameRow(game = game)
           }
       }
   }
}
    @Preview(showBackground = true)
    @Composable
    fun GameListPreview() {
        MeredioTheme {
           // GameList(games=games)
        }
    }

