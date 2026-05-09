package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LinuxLogoFill: ImageVector
    get() {
        if (_LinuxLogoFill != null) {
            return _LinuxLogoFill!!
        }
        _LinuxLogoFill = ImageVector.Builder(
            name = "Filled.LinuxLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(161.22f, 209.74f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.31f, 6.26f)
                lineTo(98.1f, 216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.31f, -6.26f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.43f, 0f)
                close()
                moveTo(230.15f, 213.11f)
                arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.43f, 2.89f)
                lineTo(184.56f, 216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.76f, -2.65f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -105.59f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71.45f, 216f)
                lineTo(32.23f, 216f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.42f, -2.93f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.75f, 203f)
                curveToRelative(0.06f, -0.07f, 7.64f, -9.78f, 15.12f, -28.72f)
                curveTo(47.77f, 156.8f, 56f, 127.64f, 56f, 88f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                curveToRelative(0f, 39.64f, 8.23f, 68.8f, 15.13f, 86.28f)
                curveToRelative(7.48f, 18.94f, 15.06f, 28.65f, 15.13f, 28.74f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 230.15f, 213.11f)
                close()
                moveTo(88f, 100f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 100f)
                close()
                moveTo(167.16f, 132.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.73f, -3.58f)
                lineTo(128f, 143.06f)
                lineTo(99.58f, 128.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.15f, 14.32f)
                lineToRelative(32f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.15f, 0f)
                lineToRelative(32f, -16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 167.16f, 132.42f)
                close()
                moveTo(168f, 100f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 100f)
                close()
            }
        }.build()

        return _LinuxLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _LinuxLogoFill: ImageVector? = null
