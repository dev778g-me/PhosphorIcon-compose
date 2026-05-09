package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.OrangeSliceFill: ImageVector
    get() {
        if (_OrangeSliceFill != null) {
            return _OrangeSliceFill!!
        }
        _OrangeSliceFill = ImageVector.Builder(
            name = "Filled.OrangeSliceFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(51.18f, 145.51f)
                arcTo(95.5f, 95.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 88f)
                curveToRelative(0f, -1.41f, 0f, -2.81f, 0.09f, -4.21f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -3.79f)
                lineTo(107f, 80f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 6.83f)
                close()
                moveTo(120f, 183.66f)
                lineTo(120f, 99.31f)
                lineTo(61.83f, 157.49f)
                arcTo(95.68f, 95.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 183.66f)
                close()
                moveTo(204.82f, 145.51f)
                arcTo(95.5f, 95.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 88f)
                curveToRelative(0f, -1.41f, 0f, -2.81f, -0.09f, -4.21f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -3.79f)
                lineTo(149f, 80f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 6.83f)
                close()
                moveTo(248f, 80f)
                horizontalLineToRelative(-4.08f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4.14f)
                curveToRelative(0f, 1.28f, 0.07f, 2.57f, 0.07f, 3.86f)
                arcTo(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 88f)
                curveToRelative(0f, -1.29f, 0f, -2.58f, 0.07f, -3.86f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4.14f)
                lineTo(8f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = false, 256f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 80f)
                close()
                moveTo(136f, 99.31f)
                verticalLineToRelative(84.35f)
                arcToRelative(95.68f, 95.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 58.17f, -26.17f)
                close()
            }
        }.build()

        return _OrangeSliceFill!!
    }

@Suppress("ObjectPropertyName")
private var _OrangeSliceFill: ImageVector? = null
