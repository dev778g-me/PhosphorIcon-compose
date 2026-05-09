package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DropHalfFill: ImageVector
    get() {
        if (_DropHalfFill != null) {
            return _DropHalfFill!!
        }
        _DropHalfFill = ImageVector.Builder(
            name = "Filled.DropHalfFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(174f, 47.75f)
                arcToRelative(254.19f, 254.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -41.45f, -38.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.18f, 0f)
                arcTo(254.19f, 254.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 82f, 47.75f)
                curveTo(54.51f, 79.32f, 40f, 112.6f, 40f, 144f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 0f)
                curveTo(216f, 112.6f, 201.49f, 79.32f, 174f, 47.75f)
                close()
                moveTo(56f, 144f)
                curveToRelative(0f, -57.23f, 55.47f, -105f, 72f, -118f)
                verticalLineTo(216f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 144f)
                close()
            }
        }.build()

        return _DropHalfFill!!
    }

@Suppress("ObjectPropertyName")
private var _DropHalfFill: ImageVector? = null
