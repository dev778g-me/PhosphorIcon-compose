package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MonitorFill: ImageVector
    get() {
        if (_MonitorFill != null) {
            return _MonitorFill!!
        }
        _MonitorFill = ImageVector.Builder(
            name = "Filled.MonitorFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(48f, 40f)
                lineTo(208f, 40f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 64f)
                lineTo(232f, 176f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 200f)
                lineTo(48f, 200f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 176f)
                lineTo(24f, 64f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 40f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 216f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _MonitorFill!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorFill: ImageVector? = null
