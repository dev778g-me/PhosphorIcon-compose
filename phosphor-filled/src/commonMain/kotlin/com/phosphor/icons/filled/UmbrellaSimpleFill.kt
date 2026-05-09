package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.UmbrellaSimpleFill: ImageVector
    get() {
        if (_UmbrellaSimpleFill != null) {
            return _UmbrellaSimpleFill!!
        }
        _UmbrellaSimpleFill = ImageVector.Builder(
            name = "Filled.UmbrellaSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.76f, 138.83f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 144f)
                horizontalLineTo(136f)
                verticalLineToRelative(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                verticalLineTo(144f)
                horizontalLineTo(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -17.37f)
                arcToRelative(112.44f, 112.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188.2f, -72.88f)
                arcTo(111.56f, 111.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 126.63f)
                arcTo(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 235.76f, 138.83f)
                close()
            }
        }.build()

        return _UmbrellaSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaSimpleFill: ImageVector? = null
