package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowFatLineUpFill: ImageVector
    get() {
        if (_ArrowFatLineUpFill != null) {
            return _ArrowFatLineUpFill!!
        }
        _ArrowFatLineUpFill = ImageVector.Builder(
            name = "Filled.ArrowFatLineUpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.39f, 123.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                horizontalLineTo(184f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(128f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineToRelative(96f, -96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(96f, 96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231.39f, 123.06f)
                close()
                moveTo(176f, 208f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _ArrowFatLineUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLineUpFill: ImageVector? = null
