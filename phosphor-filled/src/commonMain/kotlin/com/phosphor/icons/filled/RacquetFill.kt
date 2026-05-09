package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RacquetFill: ImageVector
    get() {
        if (_RacquetFill != null) {
            return _RacquetFill!!
        }
        _RacquetFill = ImageVector.Builder(
            name = "Filled.RacquetFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230f, 26.05f)
                curveTo(202f, -1.88f, 151.53f, 3.16f, 117.4f, 37.3f)
                curveToRelative(-31.79f, 31.79f, -38.33f, 77.77f, -16.51f, 106.49f)
                lineTo(71.33f, 173.35f)
                lineToRelative(-0.68f, -0.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.64f, 0f)
                lineTo(20.69f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.64f)
                lineToRelative(12.69f, 12.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 0f)
                horizontalLineToRelative(0f)
                lineTo(83.34f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.63f)
                lineToRelative(-0.69f, -0.69f)
                lineToRelative(29.56f, -29.56f)
                curveToRelative(11.29f, 8.58f, 25.24f, 12.79f, 40f, 12.79f)
                curveToRelative(22.72f, 0f, 47.25f, -10f, 66.54f, -29.3f)
                curveTo(252.83f, 104.47f, 257.88f, 54f, 230f, 26.05f)
                close()
                moveTo(224.23f, 104f)
                lineTo(200.06f, 104f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(32f)
                arcTo(72.45f, 72.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224.23f, 104f)
                close()
                moveTo(136f, 149.61f)
                arcTo(44.15f, 44.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.39f, 120f)
                lineTo(136f, 120f)
                close()
                moveTo(104f, 104f)
                arcToRelative(72.24f, 72.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.86f, -32f)
                lineTo(136f, 72f)
                verticalLineToRelative(32f)
                close()
                moveTo(152f, 72f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
                close()
                moveTo(229.67f, 56f)
                lineTo(200.06f, 56f)
                lineTo(200.06f, 26.28f)
                arcToRelative(44.23f, 44.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.66f, 29.66f)
                close()
                moveTo(183.85f, 24f)
                horizontalLineToRelative(0.16f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
                lineTo(152.01f, 31.76f)
                arcTo(72.47f, 72.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 183.9f, 23.9f)
                close()
                moveTo(136f, 42.06f)
                lineTo(136f, 55.94f)
                lineTo(122.16f, 55.94f)
                arcToRelative(89.72f, 89.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.56f, -7.32f)
                arcTo(93.17f, 93.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 42.06f)
                close()
                moveTo(152f, 151.98f)
                lineTo(152f, 120f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24.16f)
                arcTo(72.24f, 72.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152.05f, 152f)
                close()
                moveTo(200f, 133.84f)
                lineTo(200f, 120f)
                lineTo(214f, 120f)
                arcToRelative(91.62f, 91.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.56f, 7.32f)
                arcTo(89.64f, 89.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200.06f, 133.84f)
                close()
            }
        }.build()

        return _RacquetFill!!
    }

@Suppress("ObjectPropertyName")
private var _RacquetFill: ImageVector? = null
