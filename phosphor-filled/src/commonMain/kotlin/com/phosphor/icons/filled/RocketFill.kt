package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RocketFill: ImageVector
    get() {
        if (_RocketFill != null) {
            return _RocketFill!!
        }
        _RocketFill = ImageVector.Builder(
            name = "Filled.RocketFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(112f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 224f)
                close()
                moveTo(223.62f, 155.83f)
                lineTo(211.26f, 211.46f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25.51f, 9.11f)
                lineTo(158.51f, 200f)
                horizontalLineToRelative(-61f)
                lineTo(70.25f, 220.57f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25.51f, -9.11f)
                lineTo(32.38f, 155.83f)
                arcToRelative(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.32f, -13.71f)
                lineToRelative(28.56f, -34.26f)
                arcToRelative(123.07f, 123.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.57f, -36.67f)
                curveToRelative(12.9f, -32.34f, 36f, -52.63f, 45.37f, -59.85f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.6f, 0f)
                curveToRelative(9.34f, 7.22f, 32.47f, 27.51f, 45.37f, 59.85f)
                arcToRelative(123.07f, 123.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.57f, 36.67f)
                lineToRelative(28.56f, 34.26f)
                arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.62f, 155.83f)
                close()
                moveTo(84.39f, 189.83f)
                quadTo(68.28f, 160.5f, 64.83f, 132.16f)
                lineTo(48f, 152.36f)
                lineTo(60.36f, 208f)
                lineToRelative(0.18f, -0.13f)
                close()
                moveTo(140f, 100f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140f, 100f)
                close()
                moveTo(208f, 152.36f)
                lineTo(191.17f, 132.16f)
                quadToRelative(-3.42f, 28.28f, -19.56f, 57.69f)
                lineToRelative(23.85f, 18f)
                lineToRelative(0.18f, 0.13f)
                close()
            }
        }.build()

        return _RocketFill!!
    }

@Suppress("ObjectPropertyName")
private var _RocketFill: ImageVector? = null
