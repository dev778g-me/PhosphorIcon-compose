package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ScissorsFill: ImageVector
    get() {
        if (_ScissorsFill != null) {
            return _ScissorsFill!!
        }
        _ScissorsFill = ImageVector.Builder(
            name = "Filled.ScissorsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236.52f, 187.09f)
                lineToRelative(-143f, -97.87f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14.38f, 17.27f)
                lineToRelative(21.39f, 21.69f)
                lineTo(79.15f, 149.54f)
                lineToRelative(0f, 0f)
                arcToRelative(35.91f, 35.91f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.38f, 17.27f)
                lineToRelative(26.91f, -18.41f)
                lineTo(170f, 198.64f)
                arcToRelative(32.26f, 32.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.7f, 9.37f)
                arcToRelative(31.52f, 31.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.11f, -0.27f)
                lineToRelative(0.28f, 0f)
                lineToRelative(36.27f, -6.11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.19f, -14.5f)
                close()
                moveTo(74.14f, 90.09f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 76f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 74.14f, 90.13f)
                close()
                moveTo(74.14f, 194.09f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 180f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 74.14f, 194.15f)
                close()
                moveTo(135.14f, 92.59f)
                lineTo(169.94f, 57.4f)
                arcToRelative(32.19f, 32.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26.84f, -9.14f)
                lineToRelative(0.28f, 0f)
                lineToRelative(36f, 6.07f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.09f, 4.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.67f, 10.12f)
                lineToRelative(-69.93f, 47.85f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.51f, 0f)
                lineToRelative(-26.31f, -18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 135.18f, 92.65f)
                close()
            }
        }.build()

        return _ScissorsFill!!
    }

@Suppress("ObjectPropertyName")
private var _ScissorsFill: ImageVector? = null
