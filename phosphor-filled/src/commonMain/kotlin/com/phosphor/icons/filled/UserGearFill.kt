package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.UserGearFill: ImageVector
    get() {
        if (_UserGearFill != null) {
            return _UserGearFill!!
        }
        _UserGearFill = ImageVector.Builder(
            name = "Filled.UserGearFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(198.13f, 194.85f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 208f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.12f, -13.15f)
                curveToRelative(14.94f, -17.78f, 33.52f, -30.41f, 54.17f, -37.17f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = true, isPositiveArc = true, 71.9f, 0f)
                curveTo(164.6f, 164.44f, 183.18f, 177.07f, 198.13f, 194.85f)
                close()
                moveTo(255.18f, 154f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.94f, 4f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -1.07f)
                lineToRelative(-4.67f, -2.7f)
                arcToRelative(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.58f, 4.39f)
                verticalLineTo(164f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-5.38f)
                arcToRelative(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.58f, -4.39f)
                lineToRelative(-4.67f, 2.7f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 1.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -14.93f)
                lineToRelative(4.66f, -2.69f)
                arcToRelative(23.6f, 23.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8.76f)
                lineToRelative(-4.66f, -2.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -13.86f)
                lineToRelative(4.67f, 2.7f)
                arcToRelative(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.58f, -4.39f)
                verticalLineTo(108f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(5.38f)
                arcToRelative(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.58f, 4.39f)
                lineToRelative(4.67f, -2.7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 13.86f)
                lineToRelative(-4.66f, 2.69f)
                arcToRelative(23.6f, 23.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8.76f)
                lineToRelative(4.66f, 2.69f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 255.18f, 154f)
                close()
                moveTo(224f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8f, -8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 144f)
                close()
            }
        }.build()

        return _UserGearFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserGearFill: ImageVector? = null
