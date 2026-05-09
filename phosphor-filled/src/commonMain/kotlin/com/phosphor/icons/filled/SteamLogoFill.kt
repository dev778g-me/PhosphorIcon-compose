package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SteamLogoFill: ImageVector
    get() {
        if (_SteamLogoFill != null) {
            return _SteamLogoFill!!
        }
        _SteamLogoFill = ImageVector.Builder(
            name = "Filled.SteamLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.92f, 132.11f)
                curveToRelative(-2.09f, 54f, -45.83f, 97.72f, -99.81f, 99.81f)
                arcTo(104.06f, 104.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.6f, 109.76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.77f, -2.08f)
                lineToRelative(43f, 43f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 42.42f, 34.92f)
                lineToRelative(61.1f, -49.84f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -50.71f, -50.65f)
                lineToRelative(-43f, 52.74f)
                lineTo(35f, 87.67f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.76f, -4.6f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 197.7f, 49f)
                close()
                moveTo(121.58f, 118.55f)
                lineTo(90.77f, 156.33f)
                arcTo(11.83f, 11.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 163.19f)
                arcTo(12.19f, 12.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 99.85f, 176f)
                arcToRelative(11.84f, 11.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.78f, -2.74f)
                lineToRelative(0f, 0f)
                lineToRelative(37.78f, -30.81f)
                arcTo(36.18f, 36.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 121.58f, 118.55f)
                close()
                moveTo(175.9f, 110f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 158f, 127.9f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 175.9f, 110f)
                close()
            }
        }.build()

        return _SteamLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _SteamLogoFill: ImageVector? = null
