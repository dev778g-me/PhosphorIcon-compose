package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PersonSimpleSkiFill: ImageVector
    get() {
        if (_PersonSimpleSkiFill != null) {
            return _PersonSimpleSkiFill!!
        }
        _PersonSimpleSkiFill = ImageVector.Builder(
            name = "Filled.PersonSimpleSkiFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(144f, 60f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 60f)
                close()
                moveTo(37.76f, 87.68f)
                lineToRelative(111f, 32.36f)
                lineToRelative(5.61f, 5.61f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 128f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(163.31f, 112f)
                lineToRelative(-4.72f, -4.72f)
                lineToRelative(0f, 0f)
                lineToRelative(-24.9f, -24.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineTo(112f, 92.67f)
                lineTo(42.24f, 72.32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.48f, 15.36f)
                close()
                moveTo(238.66f, 193.15f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.1f, -2.22f)
                arcToRelative(53.78f, 53.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -45f, 6.9f)
                lineToRelative(-62.79f, -18.28f)
                lineToRelative(29.9f, -29.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.46f, -13.35f)
                lineToRelative(-56f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.4f, 15.39f)
                lineTo(128.73f, 148f)
                lineToRelative(-26.5f, 26.49f)
                lineToRelative(-76f, -22.13f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.48f, 15.36f)
                lineToRelative(156.31f, 45.52f)
                arcToRelative(69.78f, 69.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 58.37f, -8.95f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 238.66f, 193.15f)
                close()
            }
        }.build()

        return _PersonSimpleSkiFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleSkiFill: ImageVector? = null
