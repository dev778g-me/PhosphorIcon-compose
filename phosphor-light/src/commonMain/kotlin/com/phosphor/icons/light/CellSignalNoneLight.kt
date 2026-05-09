package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CellSignalNoneLight: ImageVector
    get() {
        if (_CellSignalNoneLight != null) {
            return _CellSignalNoneLight!!
        }
        _CellSignalNoneLight = ImageVector.Builder(
            name = "Light.CellSignalNoneLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 192f)
                lineTo(40f, 200f)
            }
        }.build()

        return _CellSignalNoneLight!!
    }

@Suppress("ObjectPropertyName")
private var _CellSignalNoneLight: ImageVector? = null
