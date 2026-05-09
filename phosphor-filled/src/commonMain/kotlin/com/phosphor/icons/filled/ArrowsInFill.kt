package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowsInFill: ImageVector
    get() {
        if (_ArrowsInFill != null) {
            return _ArrowsInFill!!
        }
        _ArrowsInFill = ImageVector.Builder(
            name = "Filled.ArrowsInFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(144f, 104f)
                lineTo(144f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineTo(172f, 72.69f)
                lineToRelative(30.34f, -30.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(183.31f, 84f)
                lineToRelative(14.35f, 14.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 112f)
                lineTo(152f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 104f)
                close()
                moveTo(104f, 144f)
                lineTo(64f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                lineTo(72.69f, 172f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineTo(84f, 183.31f)
                lineToRelative(14.34f, 14.35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 192f)
                lineTo(112f, 152f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 144f)
                close()
                moveTo(183.31f, 172f)
                lineTo(197.66f, 157.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 144f)
                lineTo(152f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                lineTo(172f, 183.31f)
                lineToRelative(30.34f, 30.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
                moveTo(107.06f, 56.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.72f, 1.73f)
                lineTo(84f, 72.69f)
                lineTo(53.66f, 42.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 42.34f, 53.66f)
                lineTo(72.69f, 84f)
                lineTo(58.34f, 98.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 112f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(112f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 107.06f, 56.61f)
                close()
            }
        }.build()

        return _ArrowsInFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsInFill: ImageVector? = null
