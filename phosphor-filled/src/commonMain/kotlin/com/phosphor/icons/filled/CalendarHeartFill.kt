package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CalendarHeartFill: ImageVector
    get() {
        if (_CalendarHeartFill != null) {
            return _CalendarHeartFill!!
        }
        _CalendarHeartFill = ImageVector.Builder(
            name = "Filled.CalendarHeartFill",
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
                moveTo(154.56f, 167.07f)
                arcToRelative(143.52f, 143.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.77f, 16.51f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.58f, 0f)
                arcToRelative(143.52f, 143.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.77f, -16.51f)
                curveTo(84.56f, 153f, 76f, 138.51f, 76f, 124f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, -14.41f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180f, 124f)
                curveTo(180f, 138.51f, 171.44f, 153f, 154.56f, 167.07f)
                close()
                moveTo(184f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(168f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _CalendarHeartFill!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarHeartFill: ImageVector? = null
