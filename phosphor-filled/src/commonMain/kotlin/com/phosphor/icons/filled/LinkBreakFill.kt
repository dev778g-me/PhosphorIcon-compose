package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LinkBreakFill: ImageVector
    get() {
        if (_LinkBreakFill != null) {
            return _LinkBreakFill!!
        }
        _LinkBreakFill = ImageVector.Builder(
            name = "Filled.LinkBreakFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(96f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(112f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(64f, 96f)
                lineTo(80f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(64f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                close()
                moveTo(128.08f, 181.66f)
                lineTo(120.87f, 188.87f)
                arcToRelative(38f, 38f, 0f, isMoreThanHalf = true, isPositiveArc = true, -53.74f, -53.74f)
                lineToRelative(7.21f, -7.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.32f, 11.31f)
                lineToRelative(-7.22f, 7.21f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.12f, 31.12f)
                lineToRelative(7.21f, -7.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.31f, 11.32f)
                close()
                moveTo(160f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(144f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(192f, 160f)
                lineTo(176f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(188.87f, 120.87f)
                lineTo(181.66f, 128.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.32f, -11.31f)
                lineToRelative(7.22f, -7.21f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31.12f, -31.12f)
                lineToRelative(-7.21f, 7.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.31f, -11.32f)
                lineToRelative(7.21f, -7.21f)
                arcToRelative(38f, 38f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.74f, 53.74f)
                close()
            }
        }.build()

        return _LinkBreakFill!!
    }

@Suppress("ObjectPropertyName")
private var _LinkBreakFill: ImageVector? = null
