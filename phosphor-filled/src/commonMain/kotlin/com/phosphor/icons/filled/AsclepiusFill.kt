package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AsclepiusFill: ImageVector
    get() {
        if (_AsclepiusFill != null) {
            return _AsclepiusFill!!
        }
        _AsclepiusFill = ImageVector.Builder(
            name = "Filled.AsclepiusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 128f)
                verticalLineToRelative(72f)
                horizontalLineToRelative(11.62f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 188.53f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.93f, -10.87f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.06f, -3.49f)
                verticalLineToRelative(-8.79f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, -3.81f)
                arcTo(28.06f, 28.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 187.71f)
                curveToRelative(0.16f, 15.56f, -13f, 28.29f, -28.59f, 28.29f)
                horizontalLineTo(136f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(216f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96.27f, 200f)
                horizontalLineTo(120f)
                verticalLineTo(128f)
                horizontalLineTo(104.46f)
                curveToRelative(-8.6f, 0f, -16f, 6.6f, -16.44f, 15.19f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.87f, 16.51f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.11f, 3.89f)
                verticalLineTo(172f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -36f, -36.87f)
                curveTo(64.47f, 119.48f, 81f, 104f, 100.68f, 104f)
                horizontalLineTo(120f)
                verticalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16.81f)
                curveTo(183.56f, 78.6f, 176.14f, 72f, 167.54f, 72f)
                horizontalLineTo(156f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                verticalLineTo(44f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                horizontalLineToRelative(15.22f)
                curveToRelative(24.62f, 0f, 45.2f, 20.15f, 44.77f, 44.76f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 128f)
                close()
                moveTo(92.66f, 72f)
                horizontalLineTo(100f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineTo(44f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                horizontalLineTo(64f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(56f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.66f, 72f)
                close()
            }
        }.build()

        return _AsclepiusFill!!
    }

@Suppress("ObjectPropertyName")
private var _AsclepiusFill: ImageVector? = null
