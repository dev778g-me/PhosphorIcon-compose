package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PowerFill: ImageVector
    get() {
        if (_PowerFill != null) {
            return _PowerFill!!
        }
        _PowerFill = ImageVector.Builder(
            name = "Filled.PowerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(120f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(128f, 208f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83.55f, 61.48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.9f, 13.29f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 71.1f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.9f, -13.29f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 208f)
                close()
            }
        }.build()

        return _PowerFill!!
    }

@Suppress("ObjectPropertyName")
private var _PowerFill: ImageVector? = null
