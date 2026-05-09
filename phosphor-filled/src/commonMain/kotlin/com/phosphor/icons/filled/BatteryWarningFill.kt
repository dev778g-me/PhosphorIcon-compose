package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BatteryWarningFill: ImageVector
    get() {
        if (_BatteryWarningFill != null) {
            return _BatteryWarningFill!!
        }
        _BatteryWarningFill = ImageVector.Builder(
            name = "Filled.BatteryWarningFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 56f)
                lineTo(32f, 56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                lineTo(200f, 200f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                lineTo(224f, 80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 56f)
                close()
                moveTo(108f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(116f, 176f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 176f)
                close()
                moveTo(256f, 96f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(240f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _BatteryWarningFill!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryWarningFill: ImageVector? = null
