package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PersonSimpleBikeFill: ImageVector
    get() {
        if (_PersonSimpleBikeFill != null) {
            return _PersonSimpleBikeFill!!
        }
        _PersonSimpleBikeFill = ImageVector.Builder(
            name = "Filled.PersonSimpleBikeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 52f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 52f)
                close()
                moveTo(240f, 176f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 176f)
                close()
                moveTo(224f, 176f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, -24f, 24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 176f)
                close()
                moveTo(200f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(155.31f, 104f)
                lineTo(125.66f, 74.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineToRelative(-32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
                lineTo(120f, 155.31f)
                lineTo(120f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineTo(99.31f, 112f)
                lineTo(120f, 91.31f)
                lineToRelative(26.34f, 26.35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 120f)
                horizontalLineToRelative(40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 112f)
                close()
                moveTo(96f, 176f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 176f)
                close()
                moveTo(80f, 176f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, -24f, 24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 176f)
                close()
            }
        }.build()

        return _PersonSimpleBikeFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleBikeFill: ImageVector? = null
