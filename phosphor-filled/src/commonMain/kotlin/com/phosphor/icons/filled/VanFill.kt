package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.VanFill: ImageVector
    get() {
        if (_VanFill != null) {
            return _VanFill!!
        }
        _VanFill = ImageVector.Builder(
            name = "Filled.VanFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(254.07f, 106.79f)
                lineTo(208.53f, 53.73f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196.26f, 48f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 64f)
                lineTo(16f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(49f, 192f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62f, 0f)
                horizontalLineToRelative(50f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62f, 0f)
                horizontalLineToRelative(17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(256f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 254.07f, 106.79f)
                close()
                moveTo(32f, 104f)
                lineTo(32f, 64f)
                lineTo(88f, 64f)
                verticalLineToRelative(40f)
                close()
                moveTo(80f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 200f)
                close()
                moveTo(160f, 104f)
                lineTo(104f, 104f)
                lineTo(104f, 64f)
                horizontalLineToRelative(56f)
                close()
                moveTo(192f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 200f)
                close()
                moveTo(176f, 104f)
                lineTo(176f, 64f)
                horizontalLineToRelative(20.26f)
                lineToRelative(34.33f, 40f)
                close()
            }
        }.build()

        return _VanFill!!
    }

@Suppress("ObjectPropertyName")
private var _VanFill: ImageVector? = null
