package com.villalbapablo.asuncion.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Asuncion(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    val estrellasCount: Int,
    val olympic: Boolean,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val asuncionImageBanner: Int,
    @StringRes val asuncionDetails: Int
)
