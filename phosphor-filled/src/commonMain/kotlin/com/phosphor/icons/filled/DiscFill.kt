package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DiscFill: ImageVector
    get() {
        if (_DiscFill != null) {
            return _DiscFill!!
        }
        _DiscFill = ImageVector.Builder(
            name = "Filled.DiscFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(188.3f, 43.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.65f, -0.5f)
                curveToRelative(-0.23f, -0.16f, -0.47f, -0.31f, -0.71f, -0.45f)
                arcToRelative(103.85f, 103.85f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.36f, 1f)
                close()
                moveTo(128f, 152f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 152f)
                close()
                moveTo(216f, 128f)
                curveToRelative(0f, 2.47f, -0.11f, 4.92f, -0.31f, 7.34f)
                lineTo(168f, 126.92f)
                arcToRelative(39.83f, 39.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, -26.41f)
                lineToRelative(27.78f, -39.67f)
                arcTo(87.8f, 87.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                close()
            }
        }.build()

        return _DiscFill!!
    }

@Suppress("ObjectPropertyName")
private var _DiscFill: ImageVector? = null
