package com.example.maintest.tests

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.memory.MemoryCache
import coil.request.ImageRequest
import com.example.maintest.R

@Composable
fun TrayParallaxImage(imageUrl: String?, resPlaceholder : Int, modifier : Modifier){
    val imageDpSize = DpSize(275.dp, 244.dp)
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(imageUrl)
            .build(),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = modifier.fillMaxSize().testTag("TrayParallaxImage"),

    )
}

@Composable
fun TrayParallaxImageTest(){
    val imageUrl =
        "https://image.develop.monumentalsportsnetwork.com/00000151-11b4-d29b-a17d-55fdb2b80000/images/2023/01/11/1673416289157_fixedaspectratiocoverelementsontop_16x9Images.png"

    val modifier = Modifier
        .size(300.dp, 300.dp)
        .clip(RoundedCornerShape(16.dp))

    val resPlaceholder = R.drawable.img

    TrayParallaxImage( "demo",resPlaceholder, modifier)


}

@Composable
fun TrayParallaxImageTest2(){
    val imageUrl ="demo"

    val modifier = Modifier
        .size(300.dp, 300.dp)
        .clip(RoundedCornerShape(16.dp))

    val resPlaceholder = R.drawable.img

    TrayParallaxImage(imageUrl, resPlaceholder, modifier)


}
