package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BeerSteinFill: ImageVector
    get() {
        if (_BeerSteinFill != null) {
            return _BeerSteinFill!!
        }
        _BeerSteinFill = ImageVector.Builder(
            name = "Filled.BeerSteinFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 88f)
                lineTo(200f, 88f)
                lineTo(200f, 72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -40f)
                lineTo(148.82f, 32f)
                curveToRelative(-11.91f, -10.2f, -28f, -16f, -44.82f, -16f)
                curveTo(68.71f, 16f, 40f, 41.12f, 40f, 72f)
                lineTo(40f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(184f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(16f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                lineTo(240f, 112f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 88f)
                close()
                moveTo(104f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(88f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(152f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(136f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(57f, 64f)
                curveToRelative(4.46f, -18.24f, 23.85f, -32f, 47f, -32f)
                curveToRelative(13.87f, 0f, 27.06f, 5f, 36.21f, 13.78f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 145.74f, 48f)
                lineTo(160f, 48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 16f)
                close()
                moveTo(224f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(200f, 184f)
                lineTo(200f, 104f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                close()
            }
        }.build()

        return _BeerSteinFill!!
    }

@Suppress("ObjectPropertyName")
private var _BeerSteinFill: ImageVector? = null
