package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AlignRightSimpleFill: ImageVector
    get() {
        if (_AlignRightSimpleFill != null) {
            return _AlignRightSimpleFill!!
        }
        _AlignRightSimpleFill = ImageVector.Builder(
            name = "Filled.AlignRightSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 56f)
                verticalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(184f, 80f)
                horizontalLineTo(32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 96f)
                verticalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 80f)
                close()
            }
        }.build()

        return _AlignRightSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _AlignRightSimpleFill: ImageVector? = null
