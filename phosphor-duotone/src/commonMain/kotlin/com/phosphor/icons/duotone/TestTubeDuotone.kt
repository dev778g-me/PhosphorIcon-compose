package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TestTubeDuotone: ImageVector
    get() {
        if (_TestTubeDuotone != null) {
            return _TestTubeDuotone!!
        }
        _TestTubeDuotone = ImageVector.Builder(
            name = "Duotone.TestTubeDuotone",
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
                moveTo(72.82f, 131.18f)
                curveToRelative(9.37f, -3.65f, 25.78f, -6.36f, 47.18f, 4.82f)
                reflectiveCurveToRelative(37.81f, 8.47f, 47.18f, 4.82f)
                lineTo(94.77f, 213.23f)
                arcToRelative(36.77f, 36.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -52f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(36.77f, 36.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -52f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(94.77f, 213.23f)
                arcToRelative(36.77f, 36.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -52f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(36.77f, 36.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -52f)
                lineTo(172f, 32f)
                lineToRelative(60f, 60f)
                lineToRelative(-24f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72.82f, 131.18f)
                curveToRelative(9.37f, -3.65f, 25.78f, -6.36f, 47.18f, 4.82f)
                reflectiveCurveToRelative(37.81f, 8.47f, 47.18f, 4.82f)
            }
        }.build()

        return _TestTubeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TestTubeDuotone: ImageVector? = null
