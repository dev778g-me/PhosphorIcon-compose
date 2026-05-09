package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StackPlusFill: ImageVector
    get() {
        if (_StackPlusFill != null) {
            return _StackPlusFill!!
        }
        _StackPlusFill = ImageVector.Builder(
            name = "Filled.StackPlusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -6.91f)
                lineToRelative(96f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.06f, 0f)
                lineToRelative(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 13.82f)
                lineToRelative(-96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.06f, 0f)
                lineToRelative(-96f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 80f)
                close()
                moveTo(220f, 121.09f)
                lineTo(128f, 174.74f)
                lineTo(36f, 121.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 134.91f)
                lineToRelative(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 0f)
                lineToRelative(96f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 220f, 121.09f)
                close()
                moveTo(232f, 192f)
                lineTo(216f, 192f)
                lineTo(216f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(16f)
                lineTo(184f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(216f, 208f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(140f, 215.76f)
                lineTo(128f, 222.76f)
                lineTo(36f, 169.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 182.91f)
                lineToRelative(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 0f)
                lineToRelative(16f, -9.33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 140f, 215.76f)
                close()
            }
        }.build()

        return _StackPlusFill!!
    }

@Suppress("ObjectPropertyName")
private var _StackPlusFill: ImageVector? = null
