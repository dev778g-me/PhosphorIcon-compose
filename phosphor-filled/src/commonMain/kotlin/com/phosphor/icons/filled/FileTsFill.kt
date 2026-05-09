package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FileTsFill: ImageVector
    get() {
        if (_FileTsFill != null) {
            return _FileTsFill!!
        }
        _FileTsFill = ImageVector.Builder(
            name = "Filled.FileTsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.66f, 82.34f)
                lineToRelative(-56f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineToRelative(76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(164f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                lineTo(168f, 228f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(28f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.66f, 82.34f)
                close()
                moveTo(152f, 88f)
                lineTo(152f, 44f)
                lineToRelative(44f, 44f)
                close()
                moveTo(147.81f, 196.31f)
                arcToRelative(20.82f, 20.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.19f, 15.23f)
                curveTo(133.43f, 215f, 127f, 216f, 121.13f, 216f)
                arcTo(61.14f, 61.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106f, 214f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.3f, -15.41f)
                curveToRelative(4.38f, 1.2f, 15f, 2.7f, 19.55f, -0.36f)
                curveToRelative(0.88f, -0.59f, 1.83f, -1.52f, 2.14f, -3.93f)
                curveToRelative(0.35f, -2.67f, -0.71f, -4.1f, -12.78f, -7.59f)
                curveToRelative(-9.35f, -2.7f, -25f, -7.23f, -23f, -23.11f)
                arcToRelative(20.56f, 20.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, -14.95f)
                curveToRelative(11.84f, -8f, 30.71f, -3.31f, 32.83f, -2.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.07f, 15.48f)
                curveToRelative(-4.49f, -1.17f, -15.23f, -2.56f, -19.83f, 0.56f)
                arcToRelative(4.54f, 4.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 3.67f)
                curveToRelative(-0.12f, 0.9f, -0.14f, 1.09f, 1.11f, 1.9f)
                curveToRelative(2.31f, 1.49f, 6.45f, 2.68f, 10.45f, 3.84f)
                curveTo(133.49f, 174.17f, 150.05f, 179f, 147.81f, 196.31f)
                close()
                moveTo(88f, 152.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.73f, 160f)
                lineTo(68f, 160f)
                verticalLineToRelative(47.73f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60.53f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 208f)
                lineTo(52f, 160f)
                lineTo(40.27f, 160f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 152.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 144f)
                lineTo(80f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 152.53f)
                close()
            }
        }.build()

        return _FileTsFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileTsFill: ImageVector? = null
