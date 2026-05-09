package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StickerFill: ImageVector
    get() {
        if (_StickerFill != null) {
            return _StickerFill!!
        }
        _StickerFill = ImageVector.Builder(
            name = "Filled.StickerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 32f)
                horizontalLineTo(88f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 88f)
                verticalLineToRelative(80f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
                horizontalLineToRelative(48f)
                arcToRelative(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.53f, -0.41f)
                curveToRelative(26.23f, -8.75f, 76.31f, -58.83f, 85.06f, -85.06f)
                arcTo(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 136f)
                verticalLineTo(88f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 32f)
                close()
                moveTo(136f, 207.42f)
                verticalLineTo(176f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, -40f)
                horizontalLineToRelative(31.42f)
                curveTo(198.16f, 157.55f, 157.55f, 198.16f, 136f, 207.42f)
                close()
            }
        }.build()

        return _StickerFill!!
    }

@Suppress("ObjectPropertyName")
private var _StickerFill: ImageVector? = null
