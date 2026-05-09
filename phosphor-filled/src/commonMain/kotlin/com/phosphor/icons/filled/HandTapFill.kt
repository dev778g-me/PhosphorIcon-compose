package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HandTapFill: ImageVector
    get() {
        if (_HandTapFill != null) {
            return _HandTapFill!!
        }
        _HandTapFill = ImageVector.Builder(
            name = "Filled.HandTapFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(64f, 64f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(207.23f, 120f)
                curveToRelative(-8.61f, 0.4f, -15.23f, 7.82f, -15.23f, 16.43f)
                verticalLineToRelative(7.28f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, -8f)
                lineTo(176f, 120.45f)
                curveToRelative(0f, -8.61f, -6.62f, -16f, -15.23f, -16.43f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 120f)
                verticalLineToRelative(15.73f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, -8f)
                lineTo(128f, 64.45f)
                curveToRelative(0f, -8.61f, -6.62f, -16f, -15.23f, -16.43f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 64f)
                lineTo(96f, 183.74f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.72f, 8.16f)
                lineToRelative(-0.12f, 0f)
                arcToRelative(6.09f, 6.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -3.09f)
                lineToRelative(-21f, -36.44f)
                curveToRelative(-4.3f, -7.46f, -13.74f, -10.57f, -21.4f, -6.62f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.15f, 168f)
                lineTo(65.1f, 228.05f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 232f)
                lineTo(208f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, -4.42f)
                curveToRelative(0.36f, -0.72f, 8.84f, -15.06f, 8.84f, -40.65f)
                lineTo(224f, 136f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 207.23f, 120f)
                close()
            }
        }.build()

        return _HandTapFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandTapFill: ImageVector? = null
