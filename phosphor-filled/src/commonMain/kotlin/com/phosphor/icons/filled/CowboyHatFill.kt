package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CowboyHatFill: ImageVector
    get() {
        if (_CowboyHatFill != null) {
            return _CowboyHatFill!!
        }
        _CowboyHatFill = ImageVector.Builder(
            name = "Filled.CowboyHatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.78f, 3.76f)
                arcTo(179.9f, 179.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 195.41f, 143f)
                lineToRelative(-1.63f, -8.57f)
                verticalLineToRelative(0f)
                lineTo(178.32f, 53.07f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -25.72f, -9.55f)
                lineToRelative(-0.13f, 0.1f)
                lineTo(128f, 64f)
                lineTo(103.53f, 43.62f)
                lineToRelative(-0.13f, -0.1f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -25.72f, 9.53f)
                lineTo(62.23f, 134.38f)
                verticalLineToRelative(0f)
                lineTo(60.59f, 143f)
                arcToRelative(179.27f, 179.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.81f, -19.25f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 120f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 80f)
                horizontalLineTo(216f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -80f)
                close()
                moveTo(76.68f, 144f)
                horizontalLineTo(179.31f)
                lineToRelative(2.54f, 13.35f)
                arcToRelative(113.28f, 113.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -27.35f, 19f)
                curveTo(139.1f, 183.77f, 128.06f, 184f, 128f, 184f)
                curveToRelative(-0.33f, 0f, -25.49f, -0.4f, -53.86f, -26.6f)
                close()
            }
        }.build()

        return _CowboyHatFill!!
    }

@Suppress("ObjectPropertyName")
private var _CowboyHatFill: ImageVector? = null
