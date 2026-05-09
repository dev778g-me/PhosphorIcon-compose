package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CoinsFill: ImageVector
    get() {
        if (_CoinsFill != null) {
            return _CoinsFill!!
        }
        _CoinsFill = ImageVector.Builder(
            name = "Filled.CoinsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 89.57f)
                lineTo(184f, 84f)
                curveToRelative(0f, -25.08f, -37.83f, -44f, -88f, -44f)
                reflectiveCurveTo(8f, 58.92f, 8f, 84f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 20.89f, 26.25f, 37.49f, 64f, 42.46f)
                lineTo(72f, 172f)
                curveToRelative(0f, 25.08f, 37.83f, 44f, 88f, 44f)
                reflectiveCurveToRelative(88f, -18.92f, 88f, -44f)
                lineTo(248f, 132f)
                curveTo(248f, 111.3f, 222.58f, 94.68f, 184f, 89.57f)
                close()
                moveTo(56f, 146.87f)
                curveTo(36.41f, 141.4f, 24f, 132.39f, 24f, 124f)
                lineTo(24f, 109.93f)
                curveToRelative(8.16f, 5.78f, 19.09f, 10.44f, 32f, 13.57f)
                close()
                moveTo(136f, 123.5f)
                curveToRelative(12.91f, -3.13f, 23.84f, -7.79f, 32f, -13.57f)
                lineTo(168f, 124f)
                curveToRelative(0f, 8.39f, -12.41f, 17.4f, -32f, 22.87f)
                close()
                moveTo(120f, 194.87f)
                curveTo(100.41f, 189.4f, 88f, 180.39f, 88f, 172f)
                verticalLineToRelative(-4.17f)
                curveToRelative(2.63f, 0.1f, 5.29f, 0.17f, 8f, 0.17f)
                curveToRelative(3.88f, 0f, 7.67f, -0.13f, 11.39f, -0.35f)
                arcTo(121.92f, 121.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 171.41f)
                close()
                moveTo(120f, 150.25f)
                arcTo(163f, 163f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 152f)
                arcToRelative(163f, 163f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -1.75f)
                lineTo(72f, 126.46f)
                arcTo(183.74f, 183.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 128f)
                arcToRelative(183.74f, 183.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -1.54f)
                close()
                moveTo(184f, 198.25f)
                arcToRelative(165.45f, 165.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                lineTo(136f, 174.4f)
                arcToRelative(179.48f, 179.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 1.6f)
                arcToRelative(183.74f, 183.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -1.54f)
                close()
                moveTo(232f, 172f)
                curveToRelative(0f, 8.39f, -12.41f, 17.4f, -32f, 22.87f)
                lineTo(200f, 171.5f)
                curveToRelative(12.91f, -3.13f, 23.84f, -7.79f, 32f, -13.57f)
                close()
            }
        }.build()

        return _CoinsFill!!
    }

@Suppress("ObjectPropertyName")
private var _CoinsFill: ImageVector? = null
