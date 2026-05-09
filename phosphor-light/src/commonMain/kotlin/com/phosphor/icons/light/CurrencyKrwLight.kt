package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CurrencyKrwLight: ImageVector
    get() {
        if (_CurrencyKrwLight != null) {
            return _CurrencyKrwLight!!
        }
        _CurrencyKrwLight = ImageVector.Builder(
            name = "Light.CurrencyKrwLight",
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
                moveTo(16f, 136f)
                lineTo(240f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 72f)
                lineToRelative(52f, 128f)
                lineToRelative(52f, -128f)
                lineToRelative(52f, 128f)
                lineToRelative(52f, -128f)
            }
        }.build()

        return _CurrencyKrwLight!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyKrwLight: ImageVector? = null
