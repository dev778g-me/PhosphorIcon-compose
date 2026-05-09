package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CaretDoubleDownFill: ImageVector
    get() {
        if (_CaretDoubleDownFill != null) {
            return _CaretDoubleDownFill!!
        }
        _CaretDoubleDownFill = ImageVector.Builder(
            name = "Filled.CaretDoubleDownFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 128f)
                horizontalLineTo(147.31f)
                lineToRelative(66.35f, -66.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 48f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                lineTo(108.69f, 128f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                lineToRelative(80f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 0f)
                lineToRelative(80f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 128f)
                close()
            }
        }.build()

        return _CaretDoubleDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleDownFill: ImageVector? = null
