package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SneakerFill: ImageVector
    get() {
        if (_SneakerFill != null) {
            return _SneakerFill!!
        }
        _SneakerFill = ImageVector.Builder(
            name = "Filled.SneakerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(228.65f, 129.11f)
                lineToRelative(-28.06f, -9.35f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.63f, 0f)
                lineToRelative(-43.23f, 15.72f)
                arcTo(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.71f, -5.88f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.22f, -9.73f)
                lineTo(168f, 113.67f)
                arcToRelative(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -4.8f)
                arcToRelative(23.93f, 23.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.8f, -5.25f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.17f, -0.91f)
                lineToRelative(-24.22f, 8.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.44f, -5.39f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.22f, -9.73f)
                lineTo(146f, 88.93f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.31f, -5.34f)
                lineToRelative(-3.06f, -7.16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.05f, -2.19f)
                lineToRelative(-25.5f, 9.27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.44f, -5.39f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.22f, -9.73f)
                lineToRelative(24f, -8.73f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.31f, -5.33f)
                lineTo(130.39f, 41.6f)
                reflectiveCurveToRelative(0f, -0.07f, 0f, -0.1f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 110.25f, 33f)
                lineTo(34.53f, 60.49f)
                arcTo(16.05f, 16.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 75.53f)
                verticalLineTo(192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(240f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(167.06f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228.65f, 129.11f)
                close()
                moveTo(240f, 192f)
                horizontalLineTo(40f)
                verticalLineTo(176f)
                horizontalLineTo(240f)
                close()
            }
        }.build()

        return _SneakerFill!!
    }

@Suppress("ObjectPropertyName")
private var _SneakerFill: ImageVector? = null
