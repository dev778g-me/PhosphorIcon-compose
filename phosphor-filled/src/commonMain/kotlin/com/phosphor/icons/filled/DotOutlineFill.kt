package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DotOutlineFill: ImageVector
    get() {
        if (_DotOutlineFill != null) {
            return _DotOutlineFill!!
        }
        _DotOutlineFill = ImageVector.Builder(
            name = "Filled.DotOutlineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 128f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, -28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 128f)
                close()
            }
        }.build()

        return _DotOutlineFill!!
    }

@Suppress("ObjectPropertyName")
private var _DotOutlineFill: ImageVector? = null
