package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FarmFill: ImageVector
    get() {
        if (_FarmFill != null) {
            return _FarmFill!!
        }
        _FarmFill = ImageVector.Builder(
            name = "Filled.FarmFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136.83f, 220.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.09f, 2.23f)
                arcTo(183.15f, 183.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                arcToRelative(199.11f, 199.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.6f, 33.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136.83f, 220.43f)
                close()
                moveTo(24f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                arcToRelative(214.81f, 214.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 151.17f, 61.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.2f, -11.42f)
                arcTo(230.69f, 230.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 144f)
                close()
                moveTo(232f, 160f)
                arcToRelative(216.51f, 216.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48.59f, 5.49f)
                quadToRelative(8.24f, 6.25f, 16f, 13.16f)
                arcTo(201.53f, 201.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                curveToRelative(-6f, 0f, -11.93f, 0.29f, -17.85f, 0.86f)
                quadToRelative(8.32f, 8.67f, 15.94f, 18.14f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.48f, 10f)
                arcTo(247f, 247f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                arcToRelative(265.43f, 265.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 4.38f)
                lineTo(72f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, -6.4f)
                lineToRelative(64f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 0f)
                lineToRelative(64f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 80f)
                verticalLineToRelative(32.5f)
                curveToRelative(5.31f, -0.32f, 10.64f, -0.5f, 16f, -0.5f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                arcToRelative(246.3f, 246.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -84.26f, 14.69f)
                quadToRelative(9.44f, 5f, 18.46f, 10.78f)
                arcTo(232.2f, 232.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(128.07f, 133.27f)
                arcTo(261.51f, 261.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 119.81f)
                lineTo(168f, 96f)
                lineTo(120f, 96f)
                verticalLineToRelative(34f)
                curveTo(122.71f, 131f, 125.4f, 132.13f, 128.07f, 133.27f)
                close()
            }
        }.build()

        return _FarmFill!!
    }

@Suppress("ObjectPropertyName")
private var _FarmFill: ImageVector? = null
