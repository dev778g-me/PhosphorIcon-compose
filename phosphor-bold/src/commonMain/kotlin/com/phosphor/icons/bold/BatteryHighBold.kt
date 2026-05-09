package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BatteryHighBold: ImageVector
    get() {
        if (_BatteryHighBold != null) {
            return _BatteryHighBold!!
        }
        _BatteryHighBold = ImageVector.Builder(
            name = "Bold.BatteryHighBold",
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
                moveTo(28f, 64f)
                lineTo(196f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212f, 80f)
                lineTo(212f, 176f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 192f)
                lineTo(28f, 192f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 176f)
                lineTo(12f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(132f, 104f)
                lineTo(132f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92f, 104f)
                lineTo(92f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(52f, 104f)
                lineTo(52f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(244f, 104f)
                lineTo(244f, 152f)
            }
        }.build()

        return _BatteryHighBold!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryHighBold: ImageVector? = null
