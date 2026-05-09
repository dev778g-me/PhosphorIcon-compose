package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShuffleSimpleFill: ImageVector
    get() {
        if (_ShuffleSimpleFill != null) {
            return _ShuffleSimpleFill!!
        }
        _ShuffleSimpleFill = ImageVector.Builder(
            name = "Filled.ShuffleSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 48f)
                lineTo(216f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.66f, 5.66f)
                lineTo(188f, 79.31f)
                lineTo(156.28f, 111f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 145f, 99.72f)
                lineTo(176.69f, 68f)
                lineTo(162.34f, 53.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 40f)
                horizontalLineToRelative(40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                close()
                moveTo(211.06f, 160.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.72f, 1.73f)
                lineTo(188f, 176.69f)
                lineTo(53.66f, 42.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 42.34f, 53.66f)
                lineTo(176.69f, 188f)
                lineToRelative(-14.35f, 14.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 216f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(216f, 168f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 211.06f, 160.61f)
                close()
                moveTo(99.72f, 145f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineTo(111f, 156.28f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 99.72f, 145f)
                close()
            }
        }.build()

        return _ShuffleSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleSimpleFill: ImageVector? = null
