package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CoinVerticalLight: ImageVector
    get() {
        if (_CoinVerticalLight != null) {
            return _CoinVerticalLight!!
        }
        _CoinVerticalLight = ImageVector.Builder(
            name = "Light.CoinVerticalLight",
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
                moveTo(48f, 128f)
                arcToRelative(56f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 112f, 0f)
                arcToRelative(56f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -112f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 32f)
                horizontalLineToRelative(48f)
                curveToRelative(30.93f, 0f, 56f, 43f, 56f, 96f)
                reflectiveCurveToRelative(-25.07f, 96f, -56f, 96f)
                horizontalLineTo(104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(145.74f, 64f)
                lineTo(193.74f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 128f)
                lineTo(208f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(145.74f, 192f)
                lineTo(193.74f, 192f)
            }
        }.build()

        return _CoinVerticalLight!!
    }

@Suppress("ObjectPropertyName")
private var _CoinVerticalLight: ImageVector? = null
