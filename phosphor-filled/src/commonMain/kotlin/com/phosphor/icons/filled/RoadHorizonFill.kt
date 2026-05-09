package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RoadHorizonFill: ImageVector
    get() {
        if (_RoadHorizonFill != null) {
            return _RoadHorizonFill!!
        }
        _RoadHorizonFill = ImageVector.Builder(
            name = "Filled.RoadHorizonFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239f, 188.08f)
                lineTo(173.68f, 72f)
                horizontalLineToRelative(58f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 64.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 56f)
                lineTo(24.27f, 56f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 63.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 72f)
                lineTo(82.32f, 72f)
                lineTo(17f, 188.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, 9.43f)
                arcToRelative(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2.49f)
                lineTo(116f, 200f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(120f, 176.27f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, 8f)
                verticalLineToRelative(20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(91.77f)
                arcToRelative(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -2.49f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239f, 188.08f)
                close()
                moveTo(136f, 140f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 124f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(136f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _RoadHorizonFill!!
    }

@Suppress("ObjectPropertyName")
private var _RoadHorizonFill: ImageVector? = null
