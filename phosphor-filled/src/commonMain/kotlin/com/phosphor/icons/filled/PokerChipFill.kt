package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PokerChipFill: ImageVector
    get() {
        if (_PokerChipFill != null) {
            return _PokerChipFill!!
        }
        _PokerChipFill = ImageVector.Builder(
            name = "Filled.PokerChipFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(60.4f, 71.72f)
                lineTo(77.47f, 88.79f)
                arcToRelative(63.66f, 63.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13f, 31.21f)
                lineTo(40.37f, 120f)
                arcTo(87.6f, 87.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60.4f, 71.72f)
                close()
                moveTo(40.37f, 136f)
                lineTo(64.52f, 136f)
                arcToRelative(63.66f, 63.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 31.21f)
                lineTo(60.4f, 184.28f)
                arcTo(87.6f, 87.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.37f, 136f)
                close()
                moveTo(120f, 215.63f)
                arcToRelative(87.6f, 87.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48.28f, -20f)
                lineToRelative(17.07f, -17.07f)
                arcTo(63.66f, 63.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 191.48f)
                close()
                moveTo(120f, 64.52f)
                arcToRelative(63.66f, 63.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31.21f, 13f)
                lineTo(71.72f, 60.4f)
                arcToRelative(87.6f, 87.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48.28f, -20f)
                close()
                moveTo(215.63f, 120f)
                lineTo(191.48f, 120f)
                arcToRelative(63.66f, 63.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.95f, -31.21f)
                lineTo(195.6f, 71.72f)
                arcTo(87.6f, 87.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.63f, 120f)
                close()
                moveTo(136f, 40.37f)
                arcToRelative(87.6f, 87.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48.28f, 20f)
                lineTo(167.21f, 77.47f)
                arcToRelative(63.66f, 63.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31.21f, -13f)
                close()
                moveTo(136f, 215.63f)
                lineTo(136f, 191.48f)
                arcToRelative(63.66f, 63.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.21f, -12.95f)
                lineToRelative(17.07f, 17.07f)
                arcTo(87.6f, 87.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 215.63f)
                close()
                moveTo(195.6f, 184.28f)
                lineTo(178.53f, 167.21f)
                arcTo(63.66f, 63.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 191.48f, 136f)
                horizontalLineToRelative(24.15f)
                arcTo(87.6f, 87.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 195.6f, 184.28f)
                close()
            }
        }.build()

        return _PokerChipFill!!
    }

@Suppress("ObjectPropertyName")
private var _PokerChipFill: ImageVector? = null
