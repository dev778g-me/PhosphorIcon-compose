package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RectangleFill: ImageVector
    get() {
        if (_RectangleFill != null) {
            return _RectangleFill!!
        }
        _RectangleFill = ImageVector.Builder(
            name = "Filled.RectangleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(40f, 40f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                lineTo(232f, 200f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 216f)
                lineTo(40f, 216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 200f)
                lineTo(24f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                close()
            }
        }.build()

        return _RectangleFill!!
    }

@Suppress("ObjectPropertyName")
private var _RectangleFill: ImageVector? = null
