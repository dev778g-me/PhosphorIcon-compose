package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.UsersFourFill: ImageVector
    get() {
        if (_UsersFourFill != null) {
            return _UsersFourFill!!
        }
        _UsersFourFill = ImageVector.Builder(
            name = "Filled.UsersFourFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.4f, 219.19f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 232f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.4f, -12.8f)
                arcTo(67.88f, 67.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53f, 197.51f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.93f, 0f)
                arcToRelative(67.42f, 67.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14.29f)
                arcToRelative(67.42f, 67.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, -14.29f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.93f, 0f)
                arcTo(67.85f, 67.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 230.4f, 219.19f)
                close()
                moveTo(27.2f, 126.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.2f, -1.6f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83.2f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.8f, 0f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83.2f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.8f, -9.61f)
                arcTo(67.85f, 67.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 203f, 93.51f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -53.93f, 0f)
                arcToRelative(67.42f, 67.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21f, 14.29f)
                arcToRelative(67.42f, 67.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21f, -14.29f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -53.93f, 0f)
                arcTo(67.88f, 67.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.6f, 115.2f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.2f, 126.4f)
                close()
            }
        }.build()

        return _UsersFourFill!!
    }

@Suppress("ObjectPropertyName")
private var _UsersFourFill: ImageVector? = null
