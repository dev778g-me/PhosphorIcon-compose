package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PerspectiveFill: ImageVector
    get() {
        if (_PerspectiveFill != null) {
            return _PerspectiveFill!!
        }
        _PerspectiveFill = ImageVector.Builder(
            name = "Filled.PerspectiveFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(224f)
                verticalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                arcToRelative(16.47f, 16.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.87f, -0.26f)
                lineToRelative(-160f, -29.09f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 178.91f)
                verticalLineTo(144f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(240f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 136f)
                close()
                moveTo(36f, 112f)
                horizontalLineTo(220f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineTo(48.42f)
                arcToRelative(16.48f, 16.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.07f, -11.08f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.79f, -5.08f)
                lineToRelative(-160f, 29.09f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 77.09f)
                verticalLineTo(108f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 112f)
                close()
            }
        }.build()

        return _PerspectiveFill!!
    }

@Suppress("ObjectPropertyName")
private var _PerspectiveFill: ImageVector? = null
