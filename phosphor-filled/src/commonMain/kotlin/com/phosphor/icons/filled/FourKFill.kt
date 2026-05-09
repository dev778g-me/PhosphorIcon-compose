package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FourKFill: ImageVector
    get() {
        if (_FourKFill != null) {
            return _FourKFill!!
        }
        _FourKFill = ImageVector.Builder(
            name = "Filled.FourKFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(79.55f, 136f)
                lineTo(96f, 113f)
                verticalLineToRelative(23f)
                close()
                moveTo(232f, 56f)
                lineTo(232f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(124f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineToRelative(-4f)
                lineTo(112f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.51f, -4.65f)
                lineToRelative(-40f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 152f)
                lineTo(96f, 152f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(112f, 152f)
                horizontalLineToRelative(4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124f, 144f)
                close()
                moveTo(173.59f, 121.77f)
                lineTo(198.07f, 93.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.14f, -10.42f)
                lineTo(157.8f, 115.6f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineTo(152f, 122.37f)
                lineTo(152f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(152f, 147f)
                lineToRelative(10.62f, -12.39f)
                lineToRelative(22.52f, 37.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.72f, -8.24f)
                close()
            }
        }.build()

        return _FourKFill!!
    }

@Suppress("ObjectPropertyName")
private var _FourKFill: ImageVector? = null
