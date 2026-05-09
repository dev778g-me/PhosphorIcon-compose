package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BroomFill: ImageVector
    get() {
        if (_BroomFill != null) {
            return _BroomFill!!
        }
        _BroomFill = ImageVector.Builder(
            name = "Filled.BroomFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.29f, 216.7f)
                curveTo(212.86f, 205.69f, 200f, 182.12f, 200f, 152f)
                verticalLineTo(134.69f)
                arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.09f, -14.87f)
                lineToRelative(-28.65f, -11.46f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156.79f, 98f)
                lineToRelative(22.32f, -56.67f)
                curveTo(184f, 28.79f, 178f, 14.21f, 165.34f, 9.51f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -30.7f, 13.71f)
                lineTo(112.25f, 80.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.41f, 4.5f)
                lineTo(73.11f, 73.08f)
                arcToRelative(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.38f, 3.66f)
                curveTo(34.68f, 98.4f, 24f, 123.71f, 24f, 152f)
                arcToRelative(111.53f, 111.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.15f, 77.53f)
                arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 61f, 232f)
                horizontalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -7.51f)
                arcTo(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 235.29f, 216.7f)
                close()
                moveTo(115.11f, 216f)
                arcToRelative(87.52f, 87.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.26f, -41.71f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.25f, -6.18f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 75.28f, 178f)
                arcToRelative(105.33f, 105.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.36f, 38f)
                horizontalLineTo(64.44f)
                arcTo(95.62f, 95.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 152f)
                arcToRelative(85.92f, 85.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.73f, -36.3f)
                lineToRelative(137.8f, 55.13f)
                curveToRelative(3f, 18.06f, 10.55f, 33.5f, 21.89f, 45.19f)
                close()
            }
        }.build()

        return _BroomFill!!
    }

@Suppress("ObjectPropertyName")
private var _BroomFill: ImageVector? = null
