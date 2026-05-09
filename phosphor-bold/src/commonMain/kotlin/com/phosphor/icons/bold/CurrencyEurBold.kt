package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CurrencyEurBold: ImageVector
    get() {
        if (_CurrencyEurBold != null) {
            return _CurrencyEurBold!!
        }
        _CurrencyEurBold = ImageVector.Builder(
            name = "Bold.CurrencyEurBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 108f)
                lineTo(136f, 108f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 148f)
                lineTo(120f, 148f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 197.67f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 144f)
                verticalLineTo(112f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 58.33f)
            }
        }.build()

        return _CurrencyEurBold!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEurBold: ImageVector? = null
