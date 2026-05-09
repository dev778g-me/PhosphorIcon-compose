package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CompassRoseFill: ImageVector
    get() {
        if (_CompassRoseFill != null) {
            return _CompassRoseFill!!
        }
        _CompassRoseFill = ImageVector.Builder(
            name = "Filled.CompassRoseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(249.94f, 120.24f)
                lineToRelative(-27.05f, -6.76f)
                arcToRelative(95.86f, 95.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80.37f, -80.37f)
                lineToRelative(-6.76f, -27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.52f, 0f)
                lineToRelative(-6.76f, 27.05f)
                arcToRelative(95.86f, 95.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80.37f, 80.37f)
                lineToRelative(-27f, 6.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.52f)
                lineToRelative(27.05f, 6.76f)
                arcToRelative(95.86f, 95.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80.37f, 80.37f)
                lineToRelative(6.76f, 27.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.52f, 0f)
                lineToRelative(6.76f, -27.05f)
                arcToRelative(95.86f, 95.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80.37f, -80.37f)
                lineToRelative(27.05f, -6.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -15.52f)
                close()
                moveTo(205.77f, 109.24f)
                lineTo(158.6f, 97.4f)
                lineTo(146.8f, 50.23f)
                arcTo(79.88f, 79.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 205.77f, 109.2f)
                close()
                moveTo(109.2f, 50.24f)
                lineTo(97.4f, 97.4f)
                lineTo(50.23f, 109.2f)
                arcTo(79.88f, 79.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 109.2f, 50.23f)
                close()
                moveTo(50.2f, 146.81f)
                lineTo(97.4f, 158.6f)
                lineToRelative(11.8f, 47.17f)
                arcTo(79.88f, 79.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 50.23f, 146.8f)
                close()
                moveTo(146.77f, 205.81f)
                lineTo(158.57f, 158.64f)
                lineTo(205.74f, 146.84f)
                arcTo(79.88f, 79.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 146.8f, 205.77f)
                close()
            }
        }.build()

        return _CompassRoseFill!!
    }

@Suppress("ObjectPropertyName")
private var _CompassRoseFill: ImageVector? = null
