package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.WatchFill: ImageVector
    get() {
        if (_WatchFill != null) {
            return _WatchFill!!
        }
        _WatchFill = ImageVector.Builder(
            name = "Filled.WatchFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(175.3f, 63.53f)
                lineToRelative(-6.24f, -34.38f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 153.32f, 16f)
                lineTo(102.68f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 86.94f, 29.15f)
                lineTo(80.7f, 63.53f)
                arcToRelative(79.9f, 79.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 128.94f)
                lineToRelative(6.24f, 34.38f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 102.68f, 240f)
                horizontalLineToRelative(50.64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.74f, -13.15f)
                lineToRelative(6.24f, -34.38f)
                arcToRelative(79.9f, 79.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -128.94f)
                close()
                moveTo(102.68f, 32f)
                horizontalLineToRelative(50.64f)
                lineToRelative(3.91f, 21.55f)
                arcToRelative(79.75f, 79.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -58.46f, 0f)
                close()
                moveTo(153.32f, 224f)
                lineTo(102.68f, 224f)
                lineToRelative(-3.91f, -21.55f)
                arcToRelative(79.75f, 79.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 58.46f, 0f)
                close()
                moveTo(168f, 136f)
                lineTo(128f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(120f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _WatchFill!!
    }

@Suppress("ObjectPropertyName")
private var _WatchFill: ImageVector? = null
