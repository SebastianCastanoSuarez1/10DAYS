package com.example.a10days

import Model.Game
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.a10days.ui.theme._10DAYSTheme

class GameScreen {
    @Preview("Light Theme")
    @Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    fun HeroPreview() {
        val game = Game(
            titulo = R.string.titulo1,
            logoJuego = R.drawable.logo_01,
            Protagonista = R.drawable.altair,
            name = R.string.protagonista1,
            sinopsis = R.string.sinopsis1
        )
        _10DAYSTheme {
            HeroItem(game =game )
        }
    }
    @Composable
    fun HeroItem(
        game: Game,
        modifier: Modifier = Modifier
    ) {
        Card(
            modifier = modifier,
            elevation = CardDefaults.cardElevation(defaultElevation = dimensionResource(R.dimen.padding_min))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(R.dimen.padding_medium))
                    .sizeIn(minHeight = dimensionResource(R.dimen.padding_big))
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(game.titulo),
                        style = MaterialTheme.typography.displaySmall
                    )
                }
                Spacer(Modifier.width(dimensionResource(R.dimen.padding_medium)))
                Box(
                    modifier = Modifier
                        .size(dimensionResource(R.dimen.padding_big))
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.padding_small)))

                ) {
                    Image(
                        painter = painterResource(game.logoJuego),
                        contentDescription = null,
                        alignment = Alignment.TopCenter,
                        contentScale = ContentScale.FillWidth
                    )
                }
            }
        }
    }
}