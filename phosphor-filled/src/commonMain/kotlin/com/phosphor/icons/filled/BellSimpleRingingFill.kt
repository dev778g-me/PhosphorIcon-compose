package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BellSimpleRingingFill: ImageVector
    get() {
        if (_BellSimpleRingingFill != null) {
            return _BellSimpleRingingFill!!
        }
        _BellSimpleRingingFill = ImageVector.Builder(
            name = "Filled.BellSimpleRingingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 224f)
                close()
                moveTo(227.39f, 60.32f)
                arcToRelative(111.36f, 111.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -39.12f, -43.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.54f, 13.53f)
                arcToRelative(94.13f, 94.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.46f, 36.91f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.2f, -7.36f)
                close()
                moveTo(35.71f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.1f, -4.32f)
                arcTo(94.13f, 94.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76.27f, 30.77f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.54f, -13.53f)
                arcTo(111.36f, 111.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.61f, 60.32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.71f, 72f)
                close()
                moveTo(208f, 112f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -160f, 0f)
                curveToRelative(0f, 26.28f, -4.78f, 48.39f, -13.81f, 63.94f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 200f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.79f, -24.06f)
                curveTo(212.78f, 160.38f, 208f, 138.27f, 208f, 112f)
                close()
            }
        }.build()

        return _BellSimpleRingingFill!!
    }

@Suppress("ObjectPropertyName")
private var _BellSimpleRingingFill: ImageVector? = null
