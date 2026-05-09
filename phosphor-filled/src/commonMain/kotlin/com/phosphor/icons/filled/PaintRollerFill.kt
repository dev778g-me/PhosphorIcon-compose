package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PaintRollerFill: ImageVector
    get() {
        if (_PaintRollerFill != null) {
            return _PaintRollerFill!!
        }
        _PaintRollerFill = ImageVector.Builder(
            name = "Filled.PaintRollerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 104f)
                verticalLineToRelative(50f)
                arcToRelative(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.6f, 15.38f)
                lineTo(136f, 198f)
                verticalLineToRelative(34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(198f)
                arcToRelative(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.6f, -15.38f)
                lineTo(232f, 154f)
                verticalLineTo(104f)
                horizontalLineTo(216f)
                verticalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(104f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(32f)
                verticalLineTo(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineTo(88f)
                horizontalLineToRelative(16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 104f)
                close()
            }
        }.build()

        return _PaintRollerFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaintRollerFill: ImageVector? = null
