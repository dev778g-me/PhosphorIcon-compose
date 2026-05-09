package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SlidersFill: ImageVector
    get() {
        if (_SlidersFill != null) {
            return _SlidersFill!!
        }
        _SlidersFill = ImageVector.Builder(
            name = "Filled.SlidersFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(84f, 136f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, 26.83f)
                lineTo(64f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(48f, 162.83f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -53.66f)
                lineTo(48f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(69.17f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 136f)
                close()
                moveTo(136f, 61.17f)
                lineTo(136f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(120f, 61.17f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 53.66f)
                lineTo(120f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 114.83f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -53.66f)
                close()
                moveTo(208f, 141.17f)
                lineTo(208f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(192f, 141.17f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 53.66f)
                lineTo(192f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(208f, 194.83f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -53.66f)
                close()
            }
        }.build()

        return _SlidersFill!!
    }

@Suppress("ObjectPropertyName")
private var _SlidersFill: ImageVector? = null
