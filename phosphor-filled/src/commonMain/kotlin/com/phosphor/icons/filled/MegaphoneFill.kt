package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MegaphoneFill: ImageVector
    get() {
        if (_MegaphoneFill != null) {
            return _MegaphoneFill!!
        }
        _MegaphoneFill = ImageVector.Builder(
            name = "Filled.MegaphoneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 72f)
                horizontalLineTo(160.2f)
                curveToRelative(-2.91f, -0.17f, -53.62f, -3.74f, -101.91f, -44.24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 40f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 26.29f, 12.25f)
                curveToRelative(37.77f, -31.68f, 77f, -40.76f, 93.71f, -43.3f)
                verticalLineToRelative(31.72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 159.12f, 214f)
                lineToRelative(11f, 7.33f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 194.5f, 212f)
                lineToRelative(11.77f, -44.36f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 72f)
                close()
                moveTo(179f, 207.89f)
                lineToRelative(0f, 0.11f)
                lineToRelative(-11f, -7.33f)
                verticalLineTo(168f)
                horizontalLineToRelative(21.6f)
                close()
                moveTo(200f, 152f)
                horizontalLineTo(168f)
                verticalLineTo(88f)
                horizontalLineToRelative(32f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 64f)
                close()
            }
        }.build()

        return _MegaphoneFill!!
    }

@Suppress("ObjectPropertyName")
private var _MegaphoneFill: ImageVector? = null
