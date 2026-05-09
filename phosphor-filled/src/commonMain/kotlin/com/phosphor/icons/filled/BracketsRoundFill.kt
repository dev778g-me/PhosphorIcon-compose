package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BracketsRoundFill: ImageVector
    get() {
        if (_BracketsRoundFill != null) {
            return _BracketsRoundFill!!
        }
        _BracketsRoundFill = ImageVector.Builder(
            name = "Filled.BracketsRoundFill",
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
                moveTo(99.61f, 176.86f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.19f, 14.3f)
                arcTo(71.23f, 71.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 128f)
                arcTo(71.23f, 71.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92.42f, 64.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.18f, 14.3f)
                curveTo(98.37f, 79.78f, 72f, 93.76f, 72f, 128f)
                reflectiveCurveTo(98.48f, 176.28f, 99.61f, 176.86f)
                close()
                moveTo(163.61f, 191.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.16f, -14.32f)
                curveToRelative(1.1f, -0.56f, 27.58f, -14.52f, 27.58f, -48.84f)
                reflectiveCurveToRelative(-26.48f, -48.28f, -27.61f, -48.86f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.19f, -14.3f)
                arcTo(71.23f, 71.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 128f)
                arcTo(71.23f, 71.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 163.58f, 191.16f)
                close()
            }
        }.build()

        return _BracketsRoundFill!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsRoundFill: ImageVector? = null
