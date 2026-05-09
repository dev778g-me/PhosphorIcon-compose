package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CompassToolFill: ImageVector
    get() {
        if (_CompassToolFill != null) {
            return _CompassToolFill!!
        }
        _CompassToolFill = ImageVector.Builder(
            name = "Filled.CompassToolFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(215.12f, 123.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.24f, -7.28f)
                arcToRelative(79.58f, 79.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -33.08f, 33.5f)
                lineToRelative(-18.24f, -41.05f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 44.91f)
                verticalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineTo(44.91f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.56f, 63.9f)
                lineTo(56.69f, 220.75f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.62f, 6.5f)
                lineToRelative(25.14f, -56.56f)
                arcTo(95.48f, 95.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 176f)
                arcToRelative(99.13f, 99.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.6f, -5.21f)
                lineToRelative(25.09f, 56.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.62f, -6.5f)
                lineToRelative(-25f, -56.25f)
                arcTo(95.81f, 95.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.12f, 123.64f)
                close()
                moveTo(128f, 160f)
                arcToRelative(79.52f, 79.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25f, -4f)
                lineToRelative(18.08f, -40.68f)
                arcToRelative(35.75f, 35.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.88f, 0f)
                lineToRelative(18.14f, 40.8f)
                arcTo(83.21f, 83.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 160f)
                close()
            }
        }.build()

        return _CompassToolFill!!
    }

@Suppress("ObjectPropertyName")
private var _CompassToolFill: ImageVector? = null
