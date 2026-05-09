package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberSixFill: ImageVector
    get() {
        if (_NumberSixFill != null) {
            return _NumberSixFill!!
        }
        _NumberSixFill = ImageVector.Builder(
            name = "Filled.NumberSixFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(200f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(128f, 192f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -38.3f, -65.62f)
                curveToRelative(0.07f, -0.13f, 0.12f, -0.26f, 0.2f, -0.38f)
                lineToRelative(33.48f, -58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.86f, 8f)
                lineToRelative(-16.52f, 28.61f)
                arcTo(44.79f, 44.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 104f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 88f)
                close()
                moveTo(156f, 148f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, -28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 148f)
                close()
            }
        }.build()

        return _NumberSixFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSixFill: ImageVector? = null
