package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CoinVerticalFill: ImageVector
    get() {
        if (_CoinVerticalFill != null) {
            return _CoinVerticalFill!!
        }
        _CoinVerticalFill = ImageVector.Builder(
            name = "Filled.CoinVerticalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(198.51f, 56.09f)
                curveTo(186.44f, 35.4f, 169.92f, 24f, 152f, 24f)
                lineTo(104f, 24f)
                curveTo(86.08f, 24f, 69.56f, 35.4f, 57.49f, 56.09f)
                curveTo(46.21f, 75.42f, 40f, 101f, 40f, 128f)
                reflectiveCurveToRelative(6.21f, 52.58f, 17.49f, 71.91f)
                curveTo(69.56f, 220.6f, 86.08f, 232f, 104f, 232f)
                horizontalLineToRelative(48f)
                curveToRelative(17.92f, 0f, 34.44f, -11.4f, 46.51f, -32.09f)
                curveTo(209.79f, 180.58f, 216f, 155f, 216f, 128f)
                reflectiveCurveTo(209.79f, 75.42f, 198.51f, 56.09f)
                close()
                moveTo(199.79f, 120f)
                horizontalLineToRelative(-32f)
                arcToRelative(152.78f, 152.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.68f, -48f)
                lineTo(188.7f, 72f)
                curveTo(194.82f, 85.38f, 198.86f, 102f, 199.79f, 120f)
                close()
                moveTo(179.19f, 56f)
                lineTo(150.46f, 56f)
                arcToRelative(83.13f, 83.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -16f)
                lineTo(152f, 40f)
                curveTo(162f, 40f, 171.4f, 46f, 179.19f, 56f)
                close()
                moveTo(152f, 216f)
                lineTo(138.49f, 216f)
                arcToRelative(83.13f, 83.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -16f)
                horizontalLineToRelative(28.73f)
                curveTo(171.4f, 210f, 162f, 216f, 152f, 216f)
                close()
                moveTo(188.7f, 184f)
                lineTo(158.12f, 184f)
                arcToRelative(152.78f, 152.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.68f, -48f)
                horizontalLineToRelative(32f)
                curveTo(198.86f, 154f, 194.82f, 170.62f, 188.7f, 184f)
                close()
            }
        }.build()

        return _CoinVerticalFill!!
    }

@Suppress("ObjectPropertyName")
private var _CoinVerticalFill: ImageVector? = null
