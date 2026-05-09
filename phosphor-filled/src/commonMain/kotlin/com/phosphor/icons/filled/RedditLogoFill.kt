package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RedditLogoFill: ImageVector
    get() {
        if (_RedditLogoFill != null) {
            return _RedditLogoFill!!
        }
        _RedditLogoFill = ImageVector.Builder(
            name = "Filled.RedditLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 104f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -52.94f, -24.19f)
                curveToRelative(-16.75f, -8.9f, -36.76f, -14.28f, -57.66f, -15.53f)
                lineToRelative(5.19f, -31.17f)
                lineToRelative(17.72f, 2.72f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.87f, -15.74f)
                lineToRelative(-26f, -4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.11f, 6.59f)
                lineTo(121.2f, 64.16f)
                curveToRelative(-21.84f, 0.94f, -42.82f, 6.38f, -60.26f, 15.65f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -42.59f, 47.74f)
                arcTo(59f, 59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 144f)
                curveToRelative(0f, 21.93f, 12f, 42.35f, 33.91f, 57.49f)
                curveTo(70.88f, 216f, 98.61f, 224f, 128f, 224f)
                reflectiveCurveToRelative(57.12f, -8f, 78.09f, -22.51f)
                curveTo(228f, 186.35f, 240f, 165.93f, 240f, 144f)
                arcToRelative(59f, 59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.35f, -16.45f)
                arcTo(32.16f, 32.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 104f)
                close()
                moveTo(72f, 128f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 128f)
                close()
                moveTo(163.75f, 183.07f)
                arcToRelative(76.18f, 76.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -71.5f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, -14.14f)
                arcToRelative(60.18f, 60.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56.5f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 14.14f)
                close()
                moveTo(168f, 144f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 144f)
                close()
            }
        }.build()

        return _RedditLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _RedditLogoFill: ImageVector? = null
