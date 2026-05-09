package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BarricadeFill: ImageVector
    get() {
        if (_BarricadeFill != null) {
            return _BarricadeFill!!
        }
        _BarricadeFill = ImageVector.Builder(
            name = "Filled.BarricadeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 64f)
                lineTo(32f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 80f)
                verticalLineToRelative(72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(56f, 168f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(72f, 168f)
                lineTo(184f, 168f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(200f, 168f)
                horizontalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(240f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 64f)
                close()
                moveTo(32f, 152f)
                lineTo(32f, 92f)
                lineToRelative(60f, 60f)
                close()
                moveTo(224f, 152f)
                lineTo(167.31f, 152f)
                lineToRelative(-72f, -72f)
                lineTo(164f, 80f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()

        return _BarricadeFill!!
    }

@Suppress("ObjectPropertyName")
private var _BarricadeFill: ImageVector? = null
