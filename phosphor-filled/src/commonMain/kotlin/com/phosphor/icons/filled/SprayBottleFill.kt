package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SprayBottleFill: ImageVector
    get() {
        if (_SprayBottleFill != null) {
            return _SprayBottleFill!!
        }
        _SprayBottleFill = ImageVector.Builder(
            name = "Filled.SprayBottleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
                horizontalLineTo(80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 32f)
                verticalLineTo(80f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 80f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24.62f)
                arcToRelative(23.87f, 23.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 18.74f)
                lineTo(87f, 136.15f)
                arcToRelative(39.79f, 39.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15f, 31.23f)
                verticalLineTo(224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(211.47f)
                arcTo(270.88f, 270.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 174f, 80f)
                close()
                moveTo(80f, 32f)
                horizontalLineToRelative(72f)
                arcToRelative(40.08f, 40.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39.2f, 32f)
                horizontalLineTo(80f)
                close()
            }
        }.build()

        return _SprayBottleFill!!
    }

@Suppress("ObjectPropertyName")
private var _SprayBottleFill: ImageVector? = null
