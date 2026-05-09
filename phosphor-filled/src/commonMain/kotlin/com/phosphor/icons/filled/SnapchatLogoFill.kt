package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SnapchatLogoFill: ImageVector
    get() {
        if (_SnapchatLogoFill != null) {
            return _SnapchatLogoFill!!
        }
        _SnapchatLogoFill = ImageVector.Builder(
            name = "Filled.SnapchatLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(245.47f, 189.74f)
                curveToRelative(-7.1f, 6.67f, -17.67f, 7.71f, -27.88f, 8.72f)
                curveToRelative(-6.31f, 0.62f, -12.83f, 1.27f, -16.39f, 3.23f)
                curveToRelative(-3.37f, 1.86f, -6.85f, 6.62f, -10.21f, 11.22f)
                curveToRelative(-5.4f, 7.41f, -11.53f, 15.8f, -21.23f, 18.28f)
                horizontalLineToRelative(0f)
                arcToRelative(26.35f, 26.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.64f, 0.81f)
                curveToRelative(-6.88f, 0f, -13.7f, -2.32f, -19.9f, -4.43f)
                curveToRelative(-5.55f, -1.89f, -10.8f, -3.68f, -15.21f, -3.68f)
                reflectiveCurveToRelative(-9.66f, 1.79f, -15.21f, 3.68f)
                curveToRelative(-8.19f, 2.79f, -17.47f, 6f, -26.54f, 3.62f)
                curveToRelative(-9.71f, -2.48f, -15.84f, -10.87f, -21.24f, -18.28f)
                curveToRelative(-3.36f, -4.6f, -6.84f, -9.36f, -10.21f, -11.22f)
                curveToRelative(-3.56f, -2f, -10.08f, -2.61f, -16.38f, -3.23f)
                curveToRelative(-10.22f, -1f, -20.79f, -2.05f, -27.89f, -8.72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.77f, -13.36f)
                curveToRelative(0.09f, 0f, 12.84f, -4.86f, 25.36f, -19f)
                arcToRelative(94f, 94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.74f, -30.2f)
                lineTo(37f, 119.43f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 43f, 104.57f)
                lineToRelative(17.85f, 7.15f)
                arcTo(151.24f, 151.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 80f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 0f)
                arcToRelative(149f, 149f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.21f, 31.73f)
                lineTo(213f, 104.57f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 219f, 119.43f)
                lineToRelative(-19.3f, 7.72f)
                curveToRelative(14.08f, 38.35f, 42.64f, 49.09f, 43f, 49.23f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.77f, 13.36f)
                close()
            }
        }.build()

        return _SnapchatLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _SnapchatLogoFill: ImageVector? = null
