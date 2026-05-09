package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SkipBackFill: ImageVector
    get() {
        if (_SkipBackFill != null) {
            return _SkipBackFill!!
        }
        _SkipBackFill = ImageVector.Builder(
            name = "Filled.SkipBackFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 47.88f)
                verticalLineTo(208.12f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.43f, 13.43f)
                lineTo(64f, 146.77f)
                verticalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(69.23f)
                lineTo(183.57f, 34.45f)
                arcTo(15.95f, 15.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 47.88f)
                close()
            }
        }.build()

        return _SkipBackFill!!
    }

@Suppress("ObjectPropertyName")
private var _SkipBackFill: ImageVector? = null
