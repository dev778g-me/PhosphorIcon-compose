package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FilmStripFill: ImageVector
    get() {
        if (_FilmStripFill != null) {
            return _FilmStripFill!!
        }
        _FilmStripFill = ImageVector.Builder(
            name = "Filled.FilmStripFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(184f, 56f)
                horizontalLineToRelative(32f)
                lineTo(216f, 72f)
                lineTo(184f, 72f)
                close()
                moveTo(72f, 200f)
                lineTo(40f, 200f)
                lineTo(40f, 184f)
                lineTo(72f, 184f)
                close()
                moveTo(72f, 72f)
                lineTo(40f, 72f)
                lineTo(40f, 56f)
                lineTo(72f, 56f)
                close()
                moveTo(120f, 200f)
                lineTo(88f, 200f)
                lineTo(88f, 184f)
                horizontalLineToRelative(32f)
                close()
                moveTo(120f, 72f)
                lineTo(88f, 72f)
                lineTo(88f, 56f)
                horizontalLineToRelative(32f)
                close()
                moveTo(168f, 200f)
                lineTo(136f, 200f)
                lineTo(136f, 184f)
                horizontalLineToRelative(32f)
                close()
                moveTo(168f, 72f)
                lineTo(136f, 72f)
                lineTo(136f, 56f)
                horizontalLineToRelative(32f)
                close()
                moveTo(216f, 200f)
                lineTo(184f, 200f)
                lineTo(184f, 184f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()

        return _FilmStripFill!!
    }

@Suppress("ObjectPropertyName")
private var _FilmStripFill: ImageVector? = null
