package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BatteryChargingFill: ImageVector
    get() {
        if (_BatteryChargingFill != null) {
            return _BatteryChargingFill!!
        }
        _BatteryChargingFill = ImageVector.Builder(
            name = "Filled.BatteryChargingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 96f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(240f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(224f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                lineTo(32f, 200f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 176f)
                lineTo(8f, 80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 56f)
                lineTo(200f, 56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 80f)
                close()
                moveTo(138.81f, 123.79f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 132f, 120f)
                lineTo(112.94f, 120f)
                lineToRelative(10.22f, -20.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.32f, -7.16f)
                lineToRelative(-16f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 100f, 136f)
                horizontalLineToRelative(19.06f)
                lineToRelative(-10.22f, 20.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.32f, 7.16f)
                lineToRelative(16f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 138.81f, 123.79f)
                close()
            }
        }.build()

        return _BatteryChargingFill!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryChargingFill: ImageVector? = null
