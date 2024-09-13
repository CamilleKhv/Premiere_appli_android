package com.example.myapplicationkerherve


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "HELLO $name",
        modifier = modifier
    )
}

@Composable
fun Screen() {
    val  url="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fsuperstarsbio.com%2Fwp-content%2Fuploads%2F2019%2F09%2FFlorence-Pugh-1.jpg&f=1&nofb=1&ipt=1063ea2fa883196e5f0fa1358b7874ef2144ae271711491e759dd291d51dde3a&ipo=images"

    Image(
        model=url,
        modifier=Modifier.fillMaxSize(),


    )
}

