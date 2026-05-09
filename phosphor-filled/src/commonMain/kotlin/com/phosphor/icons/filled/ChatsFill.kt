package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChatsFill: ImageVector
    get() {
        if (_ChatsFill != null) {
            return _ChatsFill!!
        }
        _ChatsFill = ImageVector.Builder(
            name = "Filled.ChatsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(184f, 80f)
                lineTo(184f, 48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(40f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 48f)
                lineTo(24f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6.22f)
                lineTo(72f, 154f)
                lineTo(72f, 184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(93.59f)
                lineTo(219f, 230.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 1.78f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                close()
                moveTo(189.45f, 185.78f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -1.78f)
                lineTo(88f, 184f)
                lineTo(88f, 152f)
                horizontalLineToRelative(80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(184f, 96f)
                horizontalLineToRelative(32f)
                lineTo(216f, 207.25f)
                close()
            }
        }.build()

        return _ChatsFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatsFill: ImageVector? = null
