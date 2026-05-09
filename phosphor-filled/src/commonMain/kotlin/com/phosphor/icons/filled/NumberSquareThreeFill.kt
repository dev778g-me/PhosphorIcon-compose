package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberSquareThreeFill: ImageVector
    get() {
        if (_NumberSquareThreeFill != null) {
            return _NumberSquareThreeFill!!
        }
        _NumberSquareThreeFill = ImageVector.Builder(
            name = "Filled.NumberSquareThreeFill",
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
                moveTo(124f, 184f)
                arcToRelative(35.71f, 35.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25.71f, -10.81f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 109.71f, 162f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 124f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.55f, -12.59f)
                lineTo(136.63f, 88f)
                horizontalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.55f, 12.59f)
                lineToRelative(-21f, 30f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 184f)
                close()
            }
        }.build()

        return _NumberSquareThreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSquareThreeFill: ImageVector? = null
