package com.brandyodhiambo.quench.views.screens.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.brandyodhiambo.quench.R

@Composable
fun Loader() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.water_drops))
    val progress by animateLottieCompositionAsState(composition)

    Column(
        modifier = Modifier
            .height(350.dp)
            .fillMaxWidth()
            .background(Color.White),
        verticalArrangement = Arrangement.Center
    ) {

        LottieAnimation(
            composition = composition,
            progress = { progress },
        )
    }

}