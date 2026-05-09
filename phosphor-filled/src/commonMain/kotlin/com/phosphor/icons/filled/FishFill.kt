package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FishFill: ImageVector
    get() {
        if (_FishFill != null) {
            return _FishFill!!
        }
        _FishFill = ImageVector.Builder(
            name = "Filled.FishFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 76f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 76f)
                close()
                moveTo(216.72f, 143.64f)
                curveToRelative(-19.37f, 34.9f, -55.44f, 53.76f, -107.24f, 56.1f)
                lineToRelative(-22f, 51.41f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80.1f, 256f)
                lineToRelative(-0.51f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.19f, -5.78f)
                lineTo(57.6f, 198.39f)
                lineTo(5.8f, 183.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -15.05f)
                lineToRelative(51.41f, -22f)
                curveToRelative(2.35f, -51.78f, 21.21f, -87.84f, 56.09f, -107.22f)
                curveToRelative(24.75f, -13.74f, 52.74f, -15.84f, 71.88f, -15.18f)
                curveToRelative(18.64f, 0.64f, 36f, 4.27f, 38.86f, 6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 2.83f)
                curveToRelative(1.69f, 2.85f, 5.33f, 20.21f, 6f, 38.85f)
                curveTo(232.55f, 90.89f, 230.46f, 118.89f, 216.72f, 143.64f)
                close()
                moveTo(212.42f, 43.57f)
                curveToRelative(-14.15f, -3f, -64.1f, -11f, -100.3f, 14.75f)
                arcToRelative(81.21f, 81.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 15.07f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39.35f, 38.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.73f, 8.73f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 38.47f, 39.34f)
                arcToRelative(80.81f, 80.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, -16f)
                curveTo(223.42f, 107.73f, 215.42f, 57.74f, 212.42f, 43.57f)
                close()
            }
        }.build()

        return _FishFill!!
    }

@Suppress("ObjectPropertyName")
private var _FishFill: ImageVector? = null
