package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CalendarFill: ImageVector
    get() {
        if (_CalendarFill != null) {
            return _CalendarFill!!
        }
        _CalendarFill = ImageVector.Builder(
            name = "Filled.CalendarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(184f, 32f)
                lineTo(184f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                lineTo(88f, 32f)
                lineTo(88f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(112f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(96f, 132.94f)
                lineToRelative(-4.42f, 2.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, -14.32f)
                lineToRelative(16f, -8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 120f)
                close()
                moveTo(168f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(136f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.4f, -12.8f)
                lineToRelative(28.78f, -38.37f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 145.07f, 132f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13.85f, -8f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 136f)
                arcToRelative(23.76f, 23.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.84f, 14.45f)
                lineTo(152f, 176f)
                close()
                moveTo(48f, 80f)
                lineTo(48f, 48f)
                lineTo(72f, 48f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(88f, 48f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(184f, 48f)
                horizontalLineToRelative(24f)
                lineTo(208f, 80f)
                close()
            }
        }.build()

        return _CalendarFill!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarFill: ImageVector? = null
