package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RepeatFill: ImageVector
    get() {
        if (_RepeatFill != null) {
            return _RepeatFill!!
        }
        _RepeatFill = ImageVector.Builder(
            name = "Filled.RepeatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 128f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 56f)
                horizontalLineToRelative(96f)
                lineTo(192f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                lineToRelative(-24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 88f)
                lineTo(192f, 72f)
                lineTo(96f, 72f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(224f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 56f)
                lineTo(64f, 184f)
                lineTo(64f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.66f, -5.66f)
                lineToRelative(-24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
                lineToRelative(24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 216f)
                lineTo(64f, 200f)
                horizontalLineToRelative(96f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, -72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 120f)
                close()
            }
        }.build()

        return _RepeatFill!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatFill: ImageVector? = null
