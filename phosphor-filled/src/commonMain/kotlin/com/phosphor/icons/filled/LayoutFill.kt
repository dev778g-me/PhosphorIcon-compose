package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LayoutFill: ImageVector
    get() {
        if (_LayoutFill != null) {
            return _LayoutFill!!
        }
        _LayoutFill = ImageVector.Builder(
            name = "Filled.LayoutFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(40f, 56f)
                horizontalLineTo(216f)
                verticalLineTo(96f)
                horizontalLineTo(40f)
                close()
                moveTo(216f, 200f)
                horizontalLineTo(112f)
                verticalLineTo(112f)
                horizontalLineTo(216f)
                verticalLineToRelative(88f)
                close()
            }
        }.build()

        return _LayoutFill!!
    }

@Suppress("ObjectPropertyName")
private var _LayoutFill: ImageVector? = null
