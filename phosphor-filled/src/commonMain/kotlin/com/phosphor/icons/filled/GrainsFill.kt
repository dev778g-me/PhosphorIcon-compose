package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GrainsFill: ImageVector
    get() {
        if (_GrainsFill != null) {
            return _GrainsFill!!
        }
        _GrainsFill = ImageVector.Builder(
            name = "Filled.GrainsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 56f)
                arcToRelative(87.52f, 87.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31.84f, 6f)
                curveToRelative(-14.32f, -29.7f, -43.25f, -44.46f, -44.57f, -45.13f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, 0f)
                curveTo(123.1f, 17.51f, 94.17f, 32.27f, 79.85f, 62f)
                arcTo(87.52f, 87.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(80f)
                arcToRelative(88.12f, 88.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 75.48f, 87.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.52f, -4f)
                lineTo(120f, 176.27f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, 8f)
                verticalLineToRelative(51.14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.52f, 4f)
                arcTo(88.12f, 88.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 144f)
                lineTo(216f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 56f)
                close()
                moveTo(120f, 149.46f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, -37.09f)
                lineTo(56f, 72.44f)
                arcTo(72.1f, 72.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 144f)
                close()
                moveTo(128f, 107.36f)
                arcTo(88.61f, 88.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 94.16f, 69.11f)
                curveToRelative(9.21f, -19.21f, 26.4f, -31.33f, 33.84f, -35.9f)
                curveToRelative(7.45f, 4.58f, 24.63f, 16.7f, 33.84f, 35.9f)
                arcTo(88.61f, 88.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 107.36f)
                close()
                moveTo(200f, 112.36f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 37.09f)
                lineTo(136f, 144f)
                arcToRelative(72.1f, 72.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -71.56f)
                close()
            }
        }.build()

        return _GrainsFill!!
    }

@Suppress("ObjectPropertyName")
private var _GrainsFill: ImageVector? = null
