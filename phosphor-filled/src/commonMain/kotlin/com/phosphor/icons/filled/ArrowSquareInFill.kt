package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowSquareInFill: ImageVector
    get() {
        if (_ArrowSquareInFill != null) {
            return _ArrowSquareInFill!!
        }
        _ArrowSquareInFill = ImageVector.Builder(
            name = "Filled.ArrowSquareInFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 136f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                lineTo(88f, 179.31f)
                lineTo(45.66f, 221.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(76.69f, 168f)
                lineTo(50.34f, 141.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 128f)
                horizontalLineToRelative(64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 136f)
                close()
                moveTo(208f, 32f)
                horizontalLineTo(80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 48f)
                verticalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(48f)
                horizontalLineTo(208f)
                verticalLineTo(176f)
                horizontalLineTo(160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
            }
        }.build()

        return _ArrowSquareInFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquareInFill: ImageVector? = null
