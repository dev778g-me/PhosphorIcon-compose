package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HandSwipeRightFill: ImageVector
    get() {
        if (_HandSwipeRightFill != null) {
            return _HandSwipeRightFill!!
        }
        _HandSwipeRightFill = ImageVector.Builder(
            name = "Filled.HandSwipeRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 128f)
                verticalLineToRelative(50.93f)
                curveToRelative(0f, 25.59f, -8.48f, 39.93f, -8.84f, 40.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 224f)
                lineTo(64f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.9f, -3.95f)
                lineTo(26.15f, 160f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.53f, -22.23f)
                curveToRelative(7.66f, -4f, 17.1f, -0.84f, 21.4f, 6.62f)
                lineToRelative(21f, 36.44f)
                arcToRelative(6.09f, 6.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3.09f)
                lineToRelative(0.12f, 0f)
                arcTo(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 175.74f)
                lineTo(88f, 56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.77f, -16f)
                curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f)
                lineTo(120f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 8f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, -8.25f)
                lineTo(136f, 112f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.77f, -16f)
                curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f)
                lineTo(168f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 8f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, -8.25f)
                verticalLineToRelative(-7.28f)
                curveToRelative(0f, -8.61f, 6.62f, -16f, 15.23f, -16.43f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                close()
                moveTo(253.66f, 50.34f)
                lineTo(221.66f, 18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineTo(228.69f, 48f)
                lineTo(176f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(52.69f)
                lineTo(210.34f, 82.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineToRelative(32f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 253.66f, 50.34f)
                close()
            }
        }.build()

        return _HandSwipeRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandSwipeRightFill: ImageVector? = null
