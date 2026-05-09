package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BatteryVerticalFullFill: ImageVector
    get() {
        if (_BatteryVerticalFullFill != null) {
            return _BatteryVerticalFullFill!!
        }
        _BatteryVerticalFullFill = ImageVector.Builder(
            name = "Filled.BatteryVerticalFullFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(96f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 8f)
                close()
                moveTo(200f, 56f)
                lineTo(200f, 224f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                lineTo(80f, 248f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                lineTo(56f, 56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 32f)
                horizontalLineToRelative(96f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 56f)
                close()
                moveTo(184f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(80f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(72f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                close()
                moveTo(160f, 64f)
                lineTo(96f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(88f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(168f, 72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 64f)
                close()
            }
        }.build()

        return _BatteryVerticalFullFill!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryVerticalFullFill: ImageVector? = null
