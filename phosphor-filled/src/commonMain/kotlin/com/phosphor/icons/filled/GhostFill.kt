package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GhostFill: ImageVector
    get() {
        if (_GhostFill != null) {
            return _GhostFill!!
        }
        _GhostFill = ImageVector.Builder(
            name = "Filled.GhostFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcToRelative(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 96f)
                verticalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.07f, 6.19f)
                lineToRelative(24.26f, -19.85f)
                lineTo(93.6f, 222.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.13f, 0f)
                lineTo(128f, 202.34f)
                lineToRelative(24.27f, 19.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.13f, 0f)
                lineToRelative(24.27f, -19.85f)
                lineToRelative(24.26f, 19.85f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 216f)
                lineTo(224f, 120f)
                arcTo(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(100f, 128f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 128f)
                close()
                moveTo(156f, 128f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 128f)
                close()
            }
        }.build()

        return _GhostFill!!
    }

@Suppress("ObjectPropertyName")
private var _GhostFill: ImageVector? = null
