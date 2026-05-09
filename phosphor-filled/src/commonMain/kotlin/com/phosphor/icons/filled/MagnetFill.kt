package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MagnetFill: ImageVector
    get() {
        if (_MagnetFill != null) {
            return _MagnetFill!!
        }
        _MagnetFill = ImageVector.Builder(
            name = "Filled.MagnetFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(207f, 50.25f)
                arcTo(87.46f, 87.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144.6f, 24f)
                horizontalLineToRelative(-0.33f)
                arcTo(87.48f, 87.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 82f, 49.81f)
                lineTo(20.61f, 112f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, 22.56f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 4.69f)
                horizontalLineToRelative(0.09f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.36f, -4.82f)
                lineTo(133f, 100.69f)
                arcToRelative(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.41f, -0.21f)
                arcToRelative(15.6f, 15.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.73f, 11.19f)
                arcToRelative(16.89f, 16.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.85f, 12f)
                lineTo(93f, 183.88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.17f, 22.79f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.52f, 0.12f)
                lineTo(205.81f, 175f)
                curveTo(240.26f, 140.5f, 240.79f, 84.56f, 207f, 50.25f)
                close()
                moveTo(60.65f, 151.89f)
                lineTo(32f, 123.24f)
                lineTo(61.42f, 93.43f)
                lineTo(89.9f, 121.91f)
                close()
                moveTo(132.79f, 224f)
                lineToRelative(-28.68f, -28.65f)
                lineToRelative(30.13f, -29.13f)
                lineToRelative(28.49f, 28.48f)
                close()
            }
        }.build()

        return _MagnetFill!!
    }

@Suppress("ObjectPropertyName")
private var _MagnetFill: ImageVector? = null
