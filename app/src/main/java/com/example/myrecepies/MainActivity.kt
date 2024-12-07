package com.example.myrecepies

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myrecepies.navigation.AppNavigation
import com.example.myrecepies.ui.RecipeAppTheme

import android.content.Context
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.example.myrecepies.data.DemoDataProvider
import com.example.myrecepies.ui.InstagramHome
import com.example.myrecepies.ui.theme.ComposeCookBookTheme


class MainActivity : AppCompatActivity()/*ComponentActivity()*/ {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)
        setContent {
            val posts = remember { DemoDataProvider.tweetList.filter { it.tweetImageId != 0 } }
            val profiles = remember { DemoDataProvider.tweetList }
            ComposeCookBookTheme {
                InstagramHome(
                    posts = posts,
                    profiles = profiles,
                    onLikeClicked = {},
                    onCommentsClicked = {},
                    onSendClicked = {},
                    onProfileClicked = {},
                    onMessagingClicked = {}
                )
            }
        }
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, MainActivity::class.java)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    ComposeCookBookTheme {
        InstagramHome(
            posts = DemoDataProvider.tweetList.filter { it.tweetImageId != 0 },
            profiles = DemoDataProvider.tweetList,
            onLikeClicked = {},
            onCommentsClicked = {},
            onSendClicked = {},
            onProfileClicked = {},
            onMessagingClicked = {}
        )
    }
}

