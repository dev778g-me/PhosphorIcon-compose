package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HighHeelFill: ImageVector
    get() {
        if (_HighHeelFill != null) {
            return _HighHeelFill!!
        }
        _HighHeelFill = ImageVector.Builder(
            name = "Filled.HighHeelFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(32f, 144f)
                arcToRelative(95.28f, 95.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 37.53f, 7.67f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.47f, 3.7f)
                lineTo(72f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 148f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                close()
                moveTo(231f, 156.19f)
                lineTo(180f, 144.71f)
                lineTo(69.66f, 34.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.56f, 0.26f)
                curveTo(36.11f, 58.64f, 24f, 89f, 24f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                arcToRelative(111.2f, 111.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.34f, 19.7f)
                arcToRelative(112.45f, 112.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.55f, 50.39f)
                arcTo(15.9f, 15.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 150.72f, 208f)
                lineTo(240f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineToRelative(-4.73f)
                arcTo(31.72f, 31.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231f, 156.19f)
                close()
            }
        }.build()

        return _HighHeelFill!!
    }

@Suppress("ObjectPropertyName")
private var _HighHeelFill: ImageVector? = null
