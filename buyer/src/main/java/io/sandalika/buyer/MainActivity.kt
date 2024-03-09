package io.sandalika.buyer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.sandalika.buyer.ui.components.GameList
import io.sandalika.buyer.ui.theme.MeredioTheme
import io.sandalika.buyer.viewModels.GamesViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       val vm=GamesViewModel();
        super.onCreate(savedInstanceState)
        setContent {
            MeredioTheme(
                darkTheme= true
            ) {
                GameList(vm )
            }
//            val painter= painterResource(id = R.drawable.unsplash)
//            val description="login"
//
//
//                VectorAssets(
//                    painter=painter,
//                    contentDescription = description
//                )
//                IntroPage()
//
//                LoginUI(applicationContext)

            }
        }
    }



//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MeredioTheme {
//        Greeting("Android")
//    }
//}