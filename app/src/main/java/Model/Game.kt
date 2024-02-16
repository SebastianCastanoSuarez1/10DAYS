package Model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Game(
    @StringRes val titulo: Int,
    @DrawableRes val logoJuego: Int,
    @DrawableRes val Protagonista: Int,
    @StringRes val name: Int,
    @StringRes val sinopsis: Int
)