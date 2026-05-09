package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MonitorPlayFill: ImageVector
    get() {
        if (_MonitorPlayFill != null) {
            return _MonitorPlayFill!!
        }
        _MonitorPlayFill = ImageVector.Builder(
            name = "Filled.MonitorPlayFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(96f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 224f)
                close()
                moveTo(232f, 64f)
                lineTo(232f, 176f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                lineTo(48f, 200f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                lineTo(24f, 64f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 40f)
                lineTo(208f, 40f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 64f)
                close()
                moveTo(164f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, -6.55f)
                lineToRelative(-40f, -28f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 108f, 92f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.59f, 6.55f)
                lineToRelative(40f, -28f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164f, 120f)
                close()
            }
        }.build()

        return _MonitorPlayFill!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorPlayFill: ImageVector? = null
