package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SkipForwardFill: ImageVector
    get() {
        if (_SkipForwardFill != null) {
            return _SkipForwardFill!!
        }
        _SkipForwardFill = ImageVector.Builder(
            name = "Filled.SkipForwardFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 40f)
                verticalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(146.77f)
                lineTo(72.43f, 221.55f)
                arcTo(15.95f, 15.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 208.12f)
                verticalLineTo(47.88f)
                arcTo(15.95f, 15.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72.43f, 34.45f)
                lineTo(192f, 109.23f)
                verticalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _SkipForwardFill!!
    }

@Suppress("ObjectPropertyName")
private var _SkipForwardFill: ImageVector? = null
