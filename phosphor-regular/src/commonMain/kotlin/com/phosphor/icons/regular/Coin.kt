package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Coin: ImageVector
    get() {
        if (_Coin != null) {
            return _Coin!!
        }
        _Coin = ImageVector.Builder(
            name = "Regular.Coin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 104f)
                arcToRelative(104f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 208f, 0f)
                arcToRelative(104f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -208f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 152f)
                lineTo(128f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 104f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 24f, 40f, 48f, 104f, 48f)
                reflectiveCurveToRelative(104f, -24f, 104f, -48f)
                verticalLineTo(104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 142.11f)
                lineTo(192f, 190.11f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 142.11f)
                lineTo(64f, 190.11f)
            }
        }.build()

        return _Coin!!
    }

@Suppress("ObjectPropertyName")
private var _Coin: ImageVector? = null
