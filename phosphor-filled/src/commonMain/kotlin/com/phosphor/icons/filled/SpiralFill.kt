package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SpiralFill: ImageVector
    get() {
        if (_SpiralFill != null) {
            return _SpiralFill!!
        }
        _SpiralFill = ImageVector.Builder(
            name = "Filled.SpiralFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                arcToRelative(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, -96f)
                curveToRelative(-1.4f, 0f, -2.8f, 0f, -4.18f, 0.1f)
                arcTo(80.06f, 80.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 128f)
                arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
                arcToRelative(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44f, -44f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, 28f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
                arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -64f)
                arcToRelative(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
                arcToRelative(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -88f, 88f)
                arcToRelative(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, -96f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 32f)
                arcTo(112.12f, 112.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 144f)
                close()
            }
        }.build()

        return _SpiralFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpiralFill: ImageVector? = null
