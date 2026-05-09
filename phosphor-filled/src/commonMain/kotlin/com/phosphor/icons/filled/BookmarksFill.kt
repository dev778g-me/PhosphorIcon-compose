package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BookmarksFill: ImageVector
    get() {
        if (_BookmarksFill != null) {
            return _BookmarksFill!!
        }
        _BookmarksFill = ImageVector.Builder(
            name = "Filled.BookmarksFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 24f)
                lineTo(96f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 40f)
                lineTo(80f, 56f)
                lineTo(64f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 72f)
                lineTo(48f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.65f, 6.51f)
                lineTo(112f, 193.83f)
                lineToRelative(51.36f, 36.68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 224f)
                lineTo(176f, 184.69f)
                lineToRelative(19.35f, 13.82f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 192f)
                lineTo(208f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 24f)
                close()
                moveTo(192f, 176.46f)
                lineTo(176f, 165f)
                lineTo(176f, 72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(96f, 56f)
                lineTo(96f, 40f)
                horizontalLineToRelative(96f)
                close()
            }
        }.build()

        return _BookmarksFill!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarksFill: ImageVector? = null
