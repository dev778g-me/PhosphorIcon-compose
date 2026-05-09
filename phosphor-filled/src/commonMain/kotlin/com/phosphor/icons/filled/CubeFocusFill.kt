package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CubeFocusFill: ImageVector
    get() {
        if (_CubeFocusFill != null) {
            return _CubeFocusFill!!
        }
        _CubeFocusFill = ImageVector.Builder(
            name = "Filled.CubeFocusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 48f)
                lineTo(232f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(216f, 56f)
                lineTo(184f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 48f)
                close()
                moveTo(72f, 200f)
                lineTo(40f, 200f)
                lineTo(40f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(72f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(224f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(32f)
                lineTo(184f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(232f, 168f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 160f)
                close()
                moveTo(32f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(40f, 56f)
                lineTo(72f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(32f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(24f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 96f)
                close()
                moveTo(177.92f, 83.31f)
                lineTo(132f, 57.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.94f, 0f)
                lineTo(78.08f, 83.31f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                lineTo(128f, 118.79f)
                lineToRelative(49.92f, -28.53f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 177.92f, 83.31f)
                close()
                moveTo(64f, 107.53f)
                lineTo(64f, 160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 68f, 167f)
                lineToRelative(46f, 26.27f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -3.47f)
                lineTo(120f, 132.64f)
                lineTo(70f, 104.06f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 107.53f)
                close()
                moveTo(192f, 160f)
                lineTo(192f, 107.53f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -3.47f)
                lineToRelative(-50f, 28.58f)
                verticalLineToRelative(57.11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3.47f)
                lineTo(188f, 167f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 160f)
                close()
            }
        }.build()

        return _CubeFocusFill!!
    }

@Suppress("ObjectPropertyName")
private var _CubeFocusFill: ImageVector? = null
