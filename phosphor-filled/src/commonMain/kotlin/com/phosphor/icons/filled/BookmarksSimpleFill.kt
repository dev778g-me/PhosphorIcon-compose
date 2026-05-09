package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BookmarksSimpleFill: ImageVector
    get() {
        if (_BookmarksSimpleFill != null) {
            return _BookmarksSimpleFill!!
        }
        _BookmarksSimpleFill = ImageVector.Builder(
            name = "Filled.BookmarksSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 56f)
                horizontalLineTo(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 72f)
                verticalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.65f, 6.51f)
                lineTo(112f, 193.83f)
                lineToRelative(51.36f, 36.68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 224f)
                verticalLineTo(72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 56f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 24f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineTo(192f)
                verticalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 24f)
                close()
            }
        }.build()

        return _BookmarksSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarksSimpleFill: ImageVector? = null
