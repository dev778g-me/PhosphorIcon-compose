package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EraserFill: ImageVector
    get() {
        if (_EraserFill != null) {
            return _EraserFill!!
        }
        _EraserFill = ImageVector.Builder(
            name = "Filled.EraserFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(225f, 80.4f)
                lineTo(183.6f, 39f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -33.94f, 0f)
                lineTo(31f, 157.66f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 33.94f)
                lineToRelative(30.06f, 30.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66.74f, 224f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineToRelative(-84.7f)
                lineTo(225f, 114.34f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 225f, 80.4f)
                close()
                moveTo(213.67f, 103f)
                lineTo(160f, 156.69f)
                lineTo(107.31f, 104f)
                lineTo(161f, 50.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(41.38f, 41.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.31f)
                close()
            }
        }.build()

        return _EraserFill!!
    }

@Suppress("ObjectPropertyName")
private var _EraserFill: ImageVector? = null
