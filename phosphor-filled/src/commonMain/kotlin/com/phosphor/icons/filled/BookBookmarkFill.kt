package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BookBookmarkFill: ImageVector
    get() {
        if (_BookBookmarkFill != null) {
            return _BookBookmarkFill!!
        }
        _BookBookmarkFill = ImageVector.Builder(
            name = "Filled.BookBookmarkFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 24f)
                lineTo(72f, 24f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 56f)
                lineTo(40f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(192f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(56f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                lineTo(208f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(216f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 24f)
                close()
                moveTo(184f, 120f)
                lineTo(158.39f, 100.8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.8f, 0f)
                lineTo(128f, 120f)
                lineTo(128f, 40f)
                horizontalLineToRelative(56f)
                close()
            }
        }.build()

        return _BookBookmarkFill!!
    }

@Suppress("ObjectPropertyName")
private var _BookBookmarkFill: ImageVector? = null
