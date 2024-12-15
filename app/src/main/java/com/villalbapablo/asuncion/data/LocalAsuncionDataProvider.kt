package com.villalbapablo.asuncion.data

import com.villalbapablo.asuncion.R
import com.villalbapablo.asuncion.model.Asuncion

object LocalAsuncionDataProvider{
    val defaultAsuncion = getAsuncionData()[0]

    fun getAsuncionData(): List<Asuncion> {
        return listOf(
            Asuncion(
                id = 1,
                titleResourceId = R.string.palma,
                subtitleResourceId = R.string.asuncion_subtitle_list,
                estrellasCount = 4 ,
                olympic = true,
                imageResourceId = R.drawable.palma_s,
                asuncionImageBanner = R.drawable.palma__1_,
                asuncionDetails = R.string.asuncion_detail_text
            ),
            Asuncion(
                id = 2,
                titleResourceId = R.string.recova,
                subtitleResourceId = R.string.asuncion_subtitle_list,
                estrellasCount = 3,
                olympic = true,
                imageResourceId = R.drawable.recova_s,
                asuncionImageBanner = R.drawable.recova_b,
                asuncionDetails = R.string.asuncion_detail_text
            ),
            Asuncion(
                id = 3,
                titleResourceId = R.string.costanera,
                subtitleResourceId = R.string.asuncion_subtitle_list,
                estrellasCount = 3,
                olympic = true,
                imageResourceId = R.drawable.costanera_asunci_s,
                asuncionImageBanner = R.drawable.costanera_asunci_b,
                asuncionDetails = R.string.asuncion_detail_text
            ),
            Asuncion(
                id = 4,
                titleResourceId = R.string.independencia,
                subtitleResourceId = R.string.asuncion_subtitle_list,
                estrellasCount = 5,
                olympic = false,
                imageResourceId = R.drawable.independencia_s,
                asuncionImageBanner = R.drawable.independencia_b,
                asuncionDetails = R.string.asuncion_detail_text
            ),
            Asuncion(
                id = 5,
                titleResourceId = R.string.sacro,
                subtitleResourceId = R.string.asuncion_subtitle_list,
                estrellasCount = 2,
                olympic = true,
                imageResourceId = R.drawable.sacro_s,
                asuncionImageBanner = R.drawable.sacro_b,
                asuncionDetails = R.string.asuncion_detail_text
            )
        )
    }
}
