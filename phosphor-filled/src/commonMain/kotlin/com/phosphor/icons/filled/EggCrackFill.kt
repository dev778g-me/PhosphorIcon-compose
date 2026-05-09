package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EggCrackFill: ImageVector
    get() {
        if (_EggCrackFill != null) {
            return _EggCrackFill!!
        }
        _EggCrackFill = ImageVector.Builder(
            name = "Filled.EggCrackFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 152f)
                arcToRelative(88.11f, 88.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -87.8f, 88f)
                curveToRelative(-50.66f, 0.12f, -90.21f, -43f, -88.12f, -93.62f)
                curveToRelative(1.21f, -29.21f, 11.71f, -60.54f, 29.23f, -86.82f)
                curveTo(87.5f, 32.29f, 109.43f, 16f, 128f, 16f)
                curveToRelative(13.25f, 0f, 28.23f, 8.32f, 42.34f, 23f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, 5.44f)
                lineTo(122f, 98.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 13.09f)
                lineToRelative(24.61f, 6.15f)
                lineToRelative(-6.51f, 32.52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.28f, 9.41f)
                arcTo(7.7f, 7.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.83f, -6.43f)
                lineToRelative(8f, -40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.9f, -9.33f)
                lineToRelative(-19.16f, -4.79f)
                lineToRelative(36.89f, -41.33f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.29f, 0.41f)
                curveToRelative(0.24f, 0.34f, 0.47f, 0.68f, 0.7f, 1f)
                curveTo(205.3f, 87.54f, 216f, 121.23f, 216f, 152f)
                close()
            }
        }.build()

        return _EggCrackFill!!
    }

@Suppress("ObjectPropertyName")
private var _EggCrackFill: ImageVector? = null
