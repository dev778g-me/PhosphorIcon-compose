package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GearFill: ImageVector
    get() {
        if (_GearFill != null) {
            return _GearFill!!
        }
        _GearFill = ImageVector.Builder(
            name = "Filled.GearFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 130.16f)
                quadToRelative(0.06f, -2.16f, 0f, -4.32f)
                lineToRelative(14.92f, -18.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.48f, -7.06f)
                arcToRelative(107.6f, 107.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.88f, -26.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -3.93f)
                lineToRelative(-23.72f, -2.64f)
                quadToRelative(-1.48f, -1.56f, -3f, -3f)
                lineTo(186f, 40.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.94f, -6f)
                arcToRelative(107.29f, 107.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -26.25f, -10.86f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.06f, 1.48f)
                lineTo(130.16f, 40f)
                quadTo(128f, 40f, 125.84f, 40f)
                lineTo(107.2f, 25.11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.06f, -1.48f)
                arcTo(107.6f, 107.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 73.89f, 34.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.93f, 6f)
                lineTo(67.32f, 64.27f)
                quadToRelative(-1.56f, 1.49f, -3f, 3f)
                lineTo(40.54f, 70f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 3.94f)
                arcToRelative(107.71f, 107.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.87f, 26.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.49f, 7.06f)
                lineTo(40f, 125.84f)
                quadTo(40f, 128f, 40f, 130.16f)
                lineTo(25.11f, 148.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.48f, 7.06f)
                arcToRelative(107.6f, 107.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.88f, 26.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3.93f)
                lineToRelative(23.72f, 2.64f)
                quadToRelative(1.49f, 1.56f, 3f, 3f)
                lineTo(70f, 215.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.94f, 6f)
                arcToRelative(107.71f, 107.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 26.25f, 10.87f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.06f, -1.49f)
                lineTo(125.84f, 216f)
                quadToRelative(2.16f, 0.06f, 4.32f, 0f)
                lineToRelative(18.64f, 14.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.06f, 1.48f)
                arcToRelative(107.21f, 107.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 26.25f, -10.88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.93f, -6f)
                lineToRelative(2.64f, -23.72f)
                quadToRelative(1.56f, -1.48f, 3f, -3f)
                lineTo(215.46f, 186f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -3.94f)
                arcToRelative(107.71f, 107.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.87f, -26.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.49f, -7.06f)
                close()
                moveTo(128f, 168f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                close()
            }
        }.build()

        return _GearFill!!
    }

@Suppress("ObjectPropertyName")
private var _GearFill: ImageVector? = null
