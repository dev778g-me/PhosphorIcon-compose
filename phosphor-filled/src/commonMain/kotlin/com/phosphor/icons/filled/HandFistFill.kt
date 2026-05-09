package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HandFistFill: ImageVector
    get() {
        if (_HandFistFill != null) {
            return _HandFistFill!!
        }
        _HandFistFill = ImageVector.Builder(
            name = "Filled.HandFistFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 120f)
                verticalLineToRelative(8f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127.63f, 232f)
                curveToRelative(-54f, -0.19f, -98f, -42.06f, -103.12f, -94.78f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.56f, -4f)
                arcTo(35.94f, 35.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 122.59f)
                arcToRelative(35.92f, 35.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 53.94f, 2.33f)
                arcToRelative(40.36f, 40.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.87f, 13f)
                arcTo(47.94f, 47.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.67f, 8f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.33f, -8.26f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, -7.47f)
                lineTo(160f, 128f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                lineTo(136f, 88f)
                horizontalLineToRelative(64f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 120f)
                close()
                moveTo(44.73f, 120f)
                curveTo(55.57f, 119.6f, 64f, 110.37f, 64f, 99.52f)
                verticalLineToRelative(-23f)
                curveTo(64f, 65.63f, 55.57f, 56.4f, 44.73f, 56f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 76f)
                verticalLineToRelative(24f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44.73f, 120f)
                close()
                moveTo(100.73f, 120f)
                curveToRelative(10.84f, -0.39f, 19.27f, -9.62f, 19.27f, -20.47f)
                verticalLineToRelative(-47f)
                curveToRelative(0f, -10.85f, -8.43f, -20.08f, -19.27f, -20.47f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 52f)
                verticalLineToRelative(48f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 100.73f, 120f)
                close()
                moveTo(176f, 52f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.73f, -20f)
                curveTo(144.43f, 32.4f, 136f, 41.63f, 136f, 52.48f)
                lineTo(136f, 72f)
                horizontalLineToRelative(36f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                close()
            }
        }.build()

        return _HandFistFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandFistFill: ImageVector? = null
