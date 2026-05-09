package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GearSixFill: ImageVector
    get() {
        if (_GearSixFill != null) {
            return _GearSixFill!!
        }
        _GearSixFill = ImageVector.Builder(
            name = "Filled.GearSixFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.94f, 107.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.89f, -5.4f)
                lineToRelative(-29.83f, -17f)
                lineToRelative(-0.12f, -33.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, -6.08f)
                arcToRelative(111.91f, 111.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -36.72f, -20.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.46f, 0.59f)
                lineTo(128f, 41.85f)
                lineTo(97.88f, 25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.47f, -0.6f)
                arcTo(111.92f, 111.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.73f, 45.15f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 6.07f)
                lineToRelative(-0.15f, 33.65f)
                lineToRelative(-29.83f, 17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.89f, 5.4f)
                arcToRelative(106.47f, 106.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 41.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.89f, 5.4f)
                lineToRelative(29.83f, 17f)
                lineToRelative(0.12f, 33.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, 6.08f)
                arcToRelative(111.91f, 111.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36.72f, 20.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.46f, -0.59f)
                lineTo(128f, 214.15f)
                lineTo(158.12f, 231f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.9f, 1f)
                arcToRelative(8.09f, 8.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.57f, -0.42f)
                arcToRelative(112.1f, 112.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36.68f, -20.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, -6.07f)
                lineToRelative(0.15f, -33.65f)
                lineToRelative(29.83f, -17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.89f, -5.4f)
                arcTo(106.47f, 106.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.94f, 107.21f)
                close()
                moveTo(128f, 168f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                close()
            }
        }.build()

        return _GearSixFill!!
    }

@Suppress("ObjectPropertyName")
private var _GearSixFill: ImageVector? = null
