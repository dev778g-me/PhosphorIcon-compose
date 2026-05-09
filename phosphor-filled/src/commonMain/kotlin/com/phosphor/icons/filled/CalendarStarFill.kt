package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CalendarStarFill: ImageVector
    get() {
        if (_CalendarStarFill != null) {
            return _CalendarStarFill!!
        }
        _CalendarStarFill = ImageVector.Builder(
            name = "Filled.CalendarStarFill",
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
                moveTo(72f, 64f)
                lineTo(72f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(178.55f, 124.7f)
                lineTo(154.09f, 144.89f)
                lineTo(161.55f, 175f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.49f, 4.17f)
                arcToRelative(4.05f, 4.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.39f, 0.79f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -0.55f)
                lineTo(128f, 163.18f)
                lineToRelative(-27.64f, 16.27f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94.45f, 175f)
                lineToRelative(7.46f, -30.15f)
                lineTo(77.45f, 124.7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.24f, -7.08f)
                lineToRelative(32.24f, -2.49f)
                lineToRelative(12.4f, -28.71f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.34f, 0f)
                lineToRelative(12.4f, 28.71f)
                lineToRelative(32.24f, 2.49f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.24f, 7.08f)
                close()
                moveTo(184f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(168f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _CalendarStarFill!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarStarFill: ImageVector? = null
