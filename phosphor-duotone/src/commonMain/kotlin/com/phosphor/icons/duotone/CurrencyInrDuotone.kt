package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CurrencyInrDuotone: ImageVector
    get() {
        if (_CurrencyInrDuotone != null) {
            return _CurrencyInrDuotone!!
        }
        _CurrencyInrDuotone = ImageVector.Builder(
            name = "Duotone.CurrencyInrDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(72f, 40f)
                horizontalLineToRelative(36f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 104f)
                horizontalLineTo(72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 80f)
                lineTo(200f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 40f)
                lineTo(200f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 40f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 104f)
                horizontalLineTo(72f)
                lineToRelative(88f, 80f)
            }
        }.build()

        return _CurrencyInrDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyInrDuotone: ImageVector? = null
