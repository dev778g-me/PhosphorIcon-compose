package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FlyingSaucerFill: ImageVector
    get() {
        if (_FlyingSaucerFill != null) {
            return _FlyingSaucerFill!!
        }
        _FlyingSaucerFill = ImageVector.Builder(
            name = "Filled.FlyingSaucerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(183.59f, 213.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.18f, 5.06f)
                lineToRelative(-8f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.18f, -5.06f)
                close()
                moveTo(128f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 184f)
                close()
                moveTo(90.53f, 184.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.12f, 5.06f)
                lineToRelative(-8f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.18f, 5.06f)
                lineToRelative(8f, -24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.53f, 184.41f)
                close()
                moveTo(248f, 112f)
                curveToRelative(0f, 16.22f, -13.37f, 30.89f, -37.65f, 41.29f)
                curveTo(188.22f, 162.78f, 159f, 168f, 128f, 168f)
                reflectiveCurveToRelative(-60.22f, -5.22f, -82.35f, -14.71f)
                curveTo(21.37f, 142.89f, 8f, 128.22f, 8f, 112f)
                curveToRelative(0f, -8.37f, 3.67f, -20.79f, 21.17f, -32.5f)
                curveToRelative(11.37f, -7.61f, 26.94f, -13.76f, 45.18f, -17.85f)
                arcTo(63.64f, 63.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 173f, 50.45f)
                arcToRelative(64.84f, 64.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.11f, 11.3f)
                curveTo(223.43f, 71.09f, 248f, 89.74f, 248f, 112f)
                close()
                moveTo(176f, 96f)
                arcToRelative(47.66f, 47.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.06f, -23.35f)
                lineToRelative(-0.06f, -0.09f)
                arcTo(48.07f, 48.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 127.36f, 48f)
                curveTo(101.25f, 48.34f, 80f, 70.25f, 80f, 96.83f)
                verticalLineToRelative(3f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.13f, 7.76f)
                arcTo(188.24f, 188.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 112f)
                arcToRelative(188.09f, 188.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 41.85f, -4.37f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 99.87f)
                close()
            }
        }.build()

        return _FlyingSaucerFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlyingSaucerFill: ImageVector? = null
