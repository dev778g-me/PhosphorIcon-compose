package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ScrollFill: ImageVector
    get() {
        if (_ScrollFill != null) {
            return _ScrollFill!!
        }
        _ScrollFill = ImageVector.Builder(
            name = "Filled.ScrollFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(220.8f, 169.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 168f)
                horizontalLineToRelative(-8f)
                lineTo(208f, 64f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                lineTo(40f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 64f)
                curveTo(8f, 77.61f, 18.05f, 85.54f, 19.2f, 86.4f)
                horizontalLineToRelative(0f)
                arcTo(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.87f, -14.33f)
                horizontalLineToRelative(0f)
                curveTo(28.83f, 73.62f, 24f, 69.74f, 24f, 64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                lineTo(56f, 192f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                lineTo(200f, 224f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                curveTo(232f, 178.39f, 222f, 170.46f, 220.8f, 169.6f)
                close()
                moveTo(104f, 96f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(104f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                close()
                moveTo(96f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(104f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 136f)
                close()
                moveTo(200f, 208f)
                lineTo(107.71f, 208f)
                arcTo(31.82f, 31.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 192f)
                arcToRelative(26.92f, 26.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.21f, -8f)
                horizontalLineToRelative(102f)
                arcToRelative(12.58f, 12.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.23f, 8f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 208f)
                close()
            }
        }.build()

        return _ScrollFill!!
    }

@Suppress("ObjectPropertyName")
private var _ScrollFill: ImageVector? = null
