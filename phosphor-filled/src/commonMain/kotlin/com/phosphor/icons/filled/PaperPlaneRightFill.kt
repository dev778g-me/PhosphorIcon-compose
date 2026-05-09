package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PaperPlaneRightFill: ImageVector
    get() {
        if (_PaperPlaneRightFill != null) {
            return _PaperPlaneRightFill!!
        }
        _PaperPlaneRightFill = ImageVector.Builder(
            name = "Filled.PaperPlaneRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 127.89f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.18f, 14f)
                lineTo(63.9f, 237.9f)
                arcTo(16.15f, 16.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 240f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15f, -21.33f)
                lineToRelative(27f, -79.95f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71.72f, 136f)
                horizontalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.26f, -7.47f)
                horizontalLineToRelative(-72f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.79f, -2.72f)
                lineToRelative(-27f, -79.94f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.84f, 18.07f)
                lineToRelative(168f, 95.89f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 127.89f)
                close()
            }
        }.build()

        return _PaperPlaneRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaperPlaneRightFill: ImageVector? = null
