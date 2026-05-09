package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowFatLineDownFill: ImageVector
    get() {
        if (_ArrowFatLineDownFill != null) {
            return _ArrowFatLineDownFill!!
        }
        _ArrowFatLineDownFill = ImageVector.Builder(
            name = "Filled.ArrowFatLineDownFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(229.66f, 141.66f)
                lineToRelative(-96f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-96f, -96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 128f)
                horizontalLineTo(72f)
                verticalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                close()
                moveTo(184f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 40f)
                close()
            }
        }.build()

        return _ArrowFatLineDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLineDownFill: ImageVector? = null
