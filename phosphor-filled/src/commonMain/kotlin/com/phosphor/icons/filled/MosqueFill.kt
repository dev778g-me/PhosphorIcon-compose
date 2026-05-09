package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MosqueFill: ImageVector
    get() {
        if (_MosqueFill != null) {
            return _MosqueFill!!
        }
        _MosqueFill = ImageVector.Builder(
            name = "Filled.MosqueFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 128f)
                arcToRelative(23.84f, 23.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 1.38f)
                lineTo(216f, 128f)
                curveToRelative(0f, -41.78f, -31.07f, -62.46f, -53.76f, -77.56f)
                curveTo(148.16f, 41.06f, 136f, 33f, 136f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                curveToRelative(0f, 9f, -12.16f, 17.06f, -26.24f, 26.44f)
                curveTo(71.07f, 65.54f, 40f, 86.22f, 40f, 128f)
                verticalLineToRelative(1.38f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 152f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(72f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(80f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(144f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(248f, 152f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 128f)
                close()
                moveTo(40f, 200f)
                lineTo(24f, 200f)
                lineTo(24f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(232f, 200f)
                lineTo(216f, 200f)
                lineTo(216f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _MosqueFill!!
    }

@Suppress("ObjectPropertyName")
private var _MosqueFill: ImageVector? = null
