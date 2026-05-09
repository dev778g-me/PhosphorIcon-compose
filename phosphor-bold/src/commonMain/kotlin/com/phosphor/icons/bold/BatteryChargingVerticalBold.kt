package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BatteryChargingVerticalBold: ImageVector
    get() {
        if (_BatteryChargingVerticalBold != null) {
            return _BatteryChargingVerticalBold!!
        }
        _BatteryChargingVerticalBold = ImageVector.Builder(
            name = "Bold.BatteryChargingVerticalBold",
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
                moveTo(128f, 172f)
                lineToRelative(16f, -32f)
                lineToRelative(-32f, 0f)
                lineToRelative(16f, -32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 12f)
                lineTo(152f, 12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 44f)
                lineTo(176f, 44f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 60f)
                lineTo(192f, 228f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 244f)
                lineTo(80f, 244f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 228f)
                lineTo(64f, 60f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 44f)
                close()
            }
        }.build()

        return _BatteryChargingVerticalBold!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingVerticalBold: ImageVector? = null
