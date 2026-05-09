package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BatteryMediumFill: ImageVector
    get() {
        if (_BatteryMediumFill != null) {
            return _BatteryMediumFill!!
        }
        _BatteryMediumFill = ImageVector.Builder(
            name = "Filled.BatteryMediumFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(112f, 96f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(48f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(40f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 96f)
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
                moveTo(208f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(32f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(200f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                close()
                moveTo(248f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(256f, 96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 88f)
                close()
            }
        }.build()

        return _BatteryMediumFill!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryMediumFill: ImageVector? = null
