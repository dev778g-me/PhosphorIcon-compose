package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TrafficSignalFill: ImageVector
    get() {
        if (_TrafficSignalFill != null) {
            return _TrafficSignalFill!!
        }
        _TrafficSignalFill = ImageVector.Builder(
            name = "Filled.TrafficSignalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 144f)
                lineTo(200f, 144f)
                lineTo(200f, 80f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(200f, 64f)
                lineTo(200f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(72f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                lineTo(56f, 64f)
                lineTo(40f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(56f, 80f)
                verticalLineToRelative(64f)
                lineTo(40f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(56f, 160f)
                verticalLineToRelative(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(184f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(200f, 160f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(128f, 116f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, -28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 116f)
                close()
                moveTo(128f, 140f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 140f)
                close()
            }
        }.build()

        return _TrafficSignalFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficSignalFill: ImageVector? = null
