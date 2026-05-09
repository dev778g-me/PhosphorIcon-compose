package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SunHorizonFill: ImageVector
    get() {
        if (_SunHorizonFill != null) {
            return _SunHorizonFill!!
        }
        _SunHorizonFill = ImageVector.Builder(
            name = "Filled.SunHorizonFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(16f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(56.45f, 152f)
                arcToRelative(73.54f, 73.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, -8f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                arcToRelative(73.54f, 73.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, 8f)
                lineTo(240f, 152f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 160f)
                close()
                moveTo(208f, 192f)
                lineTo(48f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(208f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(80.84f, 59.58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.32f, -7.16f)
                lineToRelative(-8f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.32f, 7.16f)
                close()
                moveTo(20.42f, 103.16f)
                lineToRelative(16f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.16f, -14.31f)
                lineToRelative(-16f, -8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.16f, 14.31f)
                close()
                moveTo(216f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.57f, -0.84f)
                lineToRelative(16f, -8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.16f, -14.31f)
                lineToRelative(-16f, 8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 112f)
                close()
                moveTo(164.42f, 63.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.74f, -3.58f)
                lineToRelative(8f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.32f, -7.16f)
                lineToRelative(-8f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164.42f, 63.16f)
                close()
            }
        }.build()

        return _SunHorizonFill!!
    }

@Suppress("ObjectPropertyName")
private var _SunHorizonFill: ImageVector? = null
