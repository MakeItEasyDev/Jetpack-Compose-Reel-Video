package com.jetpack.tiktokreelvideo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.jetpack.tiktokreelvideo.ui.theme.TiktokReelVideoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TiktokReelVideoTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ShortViewCompose(
                        activity = this,
                        videoItemsUrl = videoUrls,
                        clickItemPosition = 0
                    )
                }
            }
        }
    }
}

val videoUrls = listOf(
    "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4",
    "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
    "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4"
)