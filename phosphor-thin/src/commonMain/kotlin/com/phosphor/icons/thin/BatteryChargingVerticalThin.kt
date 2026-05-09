package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.BatteryChargingVerticalThin: ImageVector
    get() {
        if (_BatteryChargingVerticalThin != null) {
            return _BatteryChargingVerticalThin!!
        }
        _BatteryChargingVerticalThin = ImageVector.Builder(
            name = "Thin.BatteryChargingVerticalThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 168f)
                lineToRelative(16f, -32f)
                lineToRelative(-32f, 0f)
                lineToRelative(16f, -32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 8f)
                lineTo(160f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 40f)
                lineTo(176f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 56f)
                lineTo(192f, 224f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 240f)
                lineTo(80f, 240f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 224f)
                lineTo(64f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 40f)
                close()
            }
        }.build()

        return _BatteryChargingVerticalThin!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingVerticalThin: ImageVector? = null
