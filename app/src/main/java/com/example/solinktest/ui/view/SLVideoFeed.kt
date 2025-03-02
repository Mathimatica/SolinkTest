package com.example.solinktest.ui.view

//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.DisposableEffect
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.viewinterop.AndroidView
//import androidx.media3.common.MediaItem
//import androidx.media3.exoplayer.ExoPlayer
//import androidx.media3.ui.PlayerView

//@Composable
//fun VideoFeedScreen() {
//    val context = LocalContext.current
//
//    // Initialize ExoPlayer
//    val exoPlayer = remember {
//        ExoPlayer.Builder(context).build().apply {
//            // Sample video URL (replace with any valid MP4 URL)
//            val videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
//            val mediaItem = MediaItem.fromUri(videoUrl)
//            setMediaItem(mediaItem)
//            prepare()
//            playWhenReady = true // Auto-play when ready
//        }
//    }
//
//    // Use AndroidView to embed the PlayerView in Compose
//    AndroidView(
//        factory = {
//            PlayerView(context).apply {
//                player = exoPlayer
//            }
//        },
//        modifier = Modifier.fillMaxSize()
//    )
//
//    // Clean up ExoPlayer when the composable is disposed
//    DisposableEffect(Unit) {
//        onDispose {
//            exoPlayer.release()
//        }
//    }
//}