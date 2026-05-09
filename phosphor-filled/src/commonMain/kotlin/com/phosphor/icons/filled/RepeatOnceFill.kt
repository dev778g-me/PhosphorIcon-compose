package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RepeatOnceFill: ImageVector
    get() {
        if (_RepeatOnceFill != null) {
            return _RepeatOnceFill!!
        }
        _RepeatOnceFill = ImageVector.Builder(
            name = "Filled.RepeatOnceFill",
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
                moveTo(136f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(144f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.58f, -7.16f)
                lineToRelative(-16f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.16f, 14.31f)
                lineToRelative(4.42f, -2.21f)
                lineTo(128f, 152f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 160f)
                close()
            }
        }.build()

        return _RepeatOnceFill!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatOnceFill: ImageVector? = null
