package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CoinVerticalBold: ImageVector
    get() {
        if (_CoinVerticalBold != null) {
            return _CoinVerticalBold!!
        }
        _CoinVerticalBold = ImageVector.Builder(
            name = "Bold.CoinVerticalBold",
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
                moveTo(48f, 128f)
                arcToRelative(56f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 112f, 0f)
                arcToRelative(56f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -112f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
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
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 128f)
                lineTo(208f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(149.49f, 184f)
                lineTo(197.49f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(149.49f, 72f)
                lineTo(197.49f, 72f)
            }
        }.build()

        return _CoinVerticalBold!!
    }

@Suppress("ObjectPropertyName")
private var _CoinVerticalBold: ImageVector? = null
