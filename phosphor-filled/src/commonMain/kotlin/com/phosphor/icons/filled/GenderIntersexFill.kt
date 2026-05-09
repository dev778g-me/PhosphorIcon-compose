package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GenderIntersexFill: ImageVector
    get() {
        if (_GenderIntersexFill != null) {
            return _GenderIntersexFill!!
        }
        _GenderIntersexFill = ImageVector.Builder(
            name = "Filled.GenderIntersexFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(147.91f, 113.72f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -25.63f, -25.63f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 147.91f, 113.72f)
                close()
                moveTo(216f, 40f)
                verticalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                horizontalLineTo(200f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 40f)
                close()
                moveTo(188f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(152.27f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 55.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 64f)
                horizontalLineToRelative(8.69f)
                lineTo(144.92f, 79.77f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 112f, 159.26f)
                verticalLineTo(176f)
                horizontalLineTo(92.27f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 183.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 192f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15.73f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, -8f)
                verticalLineTo(192f)
                horizontalLineToRelative(19.73f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.25f, -7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8.53f)
                horizontalLineTo(128f)
                verticalLineTo(159.26f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.24f, -68.18f)
                lineTo(172f, 75.31f)
                verticalLineToRelative(8.42f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 179.47f, 92f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 188f, 84f)
                close()
            }
        }.build()

        return _GenderIntersexFill!!
    }

@Suppress("ObjectPropertyName")
private var _GenderIntersexFill: ImageVector? = null
