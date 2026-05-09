package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BootFill: ImageVector
    get() {
        if (_BootFill != null) {
            return _BootFill!!
        }
        _BootFill = ImageVector.Builder(
            name = "Filled.BootFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 112f)
                lineTo(112.27f, 112f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.25f, -7.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 96f)
                horizontalLineToRelative(44f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(160f, 84f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(112.27f, 80f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 72.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 64f)
                horizontalLineToRelative(44f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(160f, 56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(32.22f, 40f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.08f, 1.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, 9.22f)
                curveToRelative(11.06f, 28.84f, 8.76f, 83.71f, -0.22f, 114.93f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 168f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(66.11f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, -1.69f)
                lineTo(85.89f, 208f)
                horizontalLineToRelative(16.22f)
                lineToRelative(12.62f, 6.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 1.69f)
                horizontalLineToRelative(28.22f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, -1.69f)
                lineTo(169.89f, 208f)
                horizontalLineToRelative(16.22f)
                lineToRelative(12.62f, 6.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 1.69f)
                lineTo(232f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(248f, 168f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 112f)
                close()
                moveTo(232f, 200f)
                lineTo(205.89f, 200f)
                lineToRelative(-12.62f, -6.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, -1.69f)
                lineTo(169.89f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, 1.69f)
                lineTo(150.11f, 200f)
                lineTo(121.89f, 200f)
                lineToRelative(-12.62f, -6.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, -1.69f)
                lineTo(85.89f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, 1.69f)
                lineTo(66.11f, 200f)
                lineTo(40f, 200f)
                lineTo(40f, 176f)
                lineTo(232f, 176f)
                close()
            }
        }.build()

        return _BootFill!!
    }

@Suppress("ObjectPropertyName")
private var _BootFill: ImageVector? = null
