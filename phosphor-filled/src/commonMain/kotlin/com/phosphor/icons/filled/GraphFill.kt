package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GraphFill: ImageVector
    get() {
        if (_GraphFill != null) {
            return _GraphFill!!
        }
        _GraphFill = ImageVector.Builder(
            name = "Filled.GraphFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 152f)
                arcToRelative(31.84f, 31.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19.53f, 6.68f)
                lineToRelative(-23.11f, -18f)
                arcTo(31.65f, 31.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 128f)
                curveToRelative(0f, -0.74f, 0f, -1.48f, -0.08f, -2.21f)
                lineToRelative(13.23f, -4.41f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 168f, 104f)
                curveToRelative(0f, 0.74f, 0f, 1.48f, 0.08f, 2.21f)
                lineToRelative(-13.23f, 4.41f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 96f)
                arcToRelative(32.59f, 32.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.27f, 0.44f)
                lineTo(115.89f, 81f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 96f, 88f)
                arcToRelative(32.59f, 32.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.27f, -0.44f)
                lineToRelative(6.84f, 15.4f)
                arcToRelative(31.92f, 31.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.57f, 39.64f)
                lineTo(73.83f, 165.44f)
                arcToRelative(32.06f, 32.06f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.63f, 12f)
                lineToRelative(25.71f, -22.84f)
                arcToRelative(31.91f, 31.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 37.36f, -1.24f)
                lineToRelative(23.11f, 18f)
                arcTo(31.65f, 31.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, -32f)
                close()
                moveTo(200f, 88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 88f)
                close()
                moveTo(80f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 56f)
                close()
                moveTo(56f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 208f)
                close()
                moveTo(200f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 200f)
                close()
            }
        }.build()

        return _GraphFill!!
    }

@Suppress("ObjectPropertyName")
private var _GraphFill: ImageVector? = null
