package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TeaBagFill: ImageVector
    get() {
        if (_TeaBagFill != null) {
            return _TeaBagFill!!
        }
        _TeaBagFill = ImageVector.Builder(
            name = "Filled.TeaBagFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(112f, 136f)
                lineTo(112f, 72f)
                horizontalLineToRelative(19.47f)
                arcToRelative(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.72f, 7.77f)
                lineTo(165.72f, 114f)
                arcToRelative(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.28f, 8.24f)
                lineTo(168f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(56f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(40f, 122.22f)
                arcTo(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42.28f, 114f)
                lineTo(62.81f, 79.77f)
                arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76.53f, 72f)
                lineTo(96f, 72f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(224f, 160f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(208f, 64f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 64f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(16f)
                lineTo(112f, 64f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 0f)
                verticalLineToRelative(80f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _TeaBagFill!!
    }

@Suppress("ObjectPropertyName")
private var _TeaBagFill: ImageVector? = null
