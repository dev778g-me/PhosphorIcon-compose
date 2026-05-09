package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BasketFill: ImageVector
    get() {
        if (_BasketFill != null) {
            return _BasketFill!!
        }
        _BasketFill = ImageVector.Builder(
            name = "Filled.BasketFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(238f, 82.73f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 80f)
                lineTo(187.63f, 80f)
                lineTo(134f, 18.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 0f)
                lineTo(68.37f, 80f)
                lineTo(24f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.93f, 9.06f)
                lineTo(31.14f, 202.12f)
                arcTo(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47f, 216f)
                lineTo(209f, 216f)
                arcToRelative(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.86f, -13.88f)
                lineTo(239.93f, 89.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 238f, 82.73f)
                close()
                moveTo(81.6f, 184f)
                arcToRelative(7.32f, 7.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -7.2f)
                lineToRelative(-5.6f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.92f, -1.6f)
                lineToRelative(5.6f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 81.6f, 184f)
                close()
                moveTo(136f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(89.63f, 80f)
                lineTo(128f, 36.15f)
                lineTo(166.37f, 80f)
                close()
                moveTo(188.76f, 120.8f)
                lineTo(183.16f, 176.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.95f, 7.2f)
                arcToRelative(7.32f, 7.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, -8.76f)
                lineToRelative(5.6f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.92f, 1.6f)
                close()
            }
        }.build()

        return _BasketFill!!
    }

@Suppress("ObjectPropertyName")
private var _BasketFill: ImageVector? = null
