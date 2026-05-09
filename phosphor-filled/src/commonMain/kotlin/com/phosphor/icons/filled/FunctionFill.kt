package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FunctionFill: ImageVector
    get() {
        if (_FunctionFill != null) {
            return _FunctionFill!!
        }
        _FunctionFill = ImageVector.Builder(
            name = "Filled.FunctionFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                horizontalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(176f, 72f)
                horizontalLineTo(159.92f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.73f, 13f)
                lineToRelative(-6.55f, 35f)
                horizontalLineTo(168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(134.64f)
                lineToRelative(-7.11f, 37.9f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96.08f, 200f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(96.08f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 111.81f, 171f)
                lineTo(118.36f, 136f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(33.36f)
                lineToRelative(7.11f, -37.9f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 159.92f, 56f)
                horizontalLineTo(176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _FunctionFill!!
    }

@Suppress("ObjectPropertyName")
private var _FunctionFill: ImageVector? = null
