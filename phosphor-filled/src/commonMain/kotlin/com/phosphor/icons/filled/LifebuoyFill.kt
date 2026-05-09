package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LifebuoyFill: ImageVector
    get() {
        if (_LifebuoyFill != null) {
            return _LifebuoyFill!!
        }
        _LifebuoyFill = ImageVector.Builder(
            name = "Filled.LifebuoyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(96f, 128f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 128f)
                close()
                moveTo(184.28f, 60.4f)
                lineTo(155.79f, 88.9f)
                arcToRelative(47.84f, 47.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -55.58f, 0f)
                lineTo(71.72f, 60.4f)
                arcToRelative(87.83f, 87.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112.56f, 0f)
                close()
                moveTo(71.72f, 195.6f)
                lineToRelative(28.49f, -28.5f)
                arcToRelative(47.84f, 47.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 55.58f, 0f)
                lineToRelative(28.49f, 28.5f)
                arcToRelative(87.83f, 87.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -112.56f, 0f)
                close()
            }
        }.build()

        return _LifebuoyFill!!
    }

@Suppress("ObjectPropertyName")
private var _LifebuoyFill: ImageVector? = null
