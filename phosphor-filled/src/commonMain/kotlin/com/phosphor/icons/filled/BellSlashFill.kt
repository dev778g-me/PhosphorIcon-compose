package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BellSlashFill: ImageVector
    get() {
        if (_BellSlashFill != null) {
            return _BellSlashFill!!
        }
        _BellSlashFill = ImageVector.Builder(
            name = "Filled.BellSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.84f, 192f)
                verticalLineToRelative(0f)
                arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0.28f)
                lineTo(83.27f, 43.19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -6f)
                arcTo(79.55f, 79.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 129.17f, 24f)
                curveTo(173f, 24.66f, 207.8f, 61.1f, 208f, 104.92f)
                curveToRelative(0.14f, 34.88f, 8.31f, 61.54f, 13.82f, 71f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 221.84f, 192f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.85f, 10.76f)
                lineTo(182.62f, 200f)
                lineTo(167.16f, 200f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -78.41f, 0f)
                lineTo(47.91f, 200f)
                arcToRelative(15.78f, 15.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.59f, -7.59f)
                arcToRelative(16.42f, 16.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, -16.68f)
                curveToRelative(5.55f, -9.73f, 13.7f, -36.64f, 13.7f, -71.73f)
                arcTo(79.42f, 79.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.79f, 63.85f)
                lineTo(42f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.84f, 34.62f)
                close()
                moveTo(150.59f, 200f)
                lineTo(105.32f, 200f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.27f, 0f)
                close()
            }
        }.build()

        return _BellSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _BellSlashFill: ImageVector? = null
