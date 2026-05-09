package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.OrangeFill: ImageVector
    get() {
        if (_OrangeFill != null) {
            return _OrangeFill!!
        }
        _OrangeFill = ImageVector.Builder(
            name = "Filled.OrangeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(165.87f, 72.58f)
                arcTo(64.06f, 64.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineToRelative(-8f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 33.06f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 8f)
                lineTo(64f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                arcToRelative(48.08f, 48.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.4f, 40.42f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 46.47f, 8.16f)
                close()
                moveTo(183.33f, 24f)
                arcToRelative(48.09f, 48.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46.66f, 40f)
                arcTo(48.09f, 48.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 183.33f, 24f)
                close()
                moveTo(183.89f, 161.32f)
                arcToRelative(57.5f, 57.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46.57f, 46.57f)
                arcTo(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.31f, -15.89f)
                arcToRelative(41.29f, 41.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 33.43f, -33.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.78f, 2.64f)
                close()
            }
        }.build()

        return _OrangeFill!!
    }

@Suppress("ObjectPropertyName")
private var _OrangeFill: ImageVector? = null
