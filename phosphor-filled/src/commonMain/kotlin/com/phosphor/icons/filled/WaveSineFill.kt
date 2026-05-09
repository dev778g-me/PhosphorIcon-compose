package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.WaveSineFill: ImageVector
    get() {
        if (_WaveSineFill != null) {
            return _WaveSineFill!!
        }
        _WaveSineFill = ImageVector.Builder(
            name = "Filled.WaveSineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(211.22f, 131.44f)
                curveToRelative(-16.68f, 35f, -31.06f, 50.56f, -46.65f, 50.56f)
                curveToRelative(-19.68f, 0f, -31.39f, -24.56f, -43.79f, -50.56f)
                curveTo(112f, 113f, 101f, 90f, 91.43f, 90f)
                curveToRelative(-3.74f, 0f, -14.37f, 4f, -32.21f, 41.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.44f, -6.88f)
                curveTo(61.46f, 89.59f, 75.84f, 74f, 91.43f, 74f)
                curveToRelative(19.68f, 0f, 31.39f, 24.56f, 43.79f, 50.56f)
                curveTo(144f, 143f, 155f, 166f, 164.57f, 166f)
                curveToRelative(3.74f, 0f, 14.37f, -4f, 32.21f, -41.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.44f, 6.88f)
                close()
            }
        }.build()

        return _WaveSineFill!!
    }

@Suppress("ObjectPropertyName")
private var _WaveSineFill: ImageVector? = null
