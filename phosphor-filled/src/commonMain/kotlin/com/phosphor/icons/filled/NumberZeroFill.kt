package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberZeroFill: ImageVector
    get() {
        if (_NumberZeroFill != null) {
            return _NumberZeroFill!!
        }
        _NumberZeroFill = ImageVector.Builder(
            name = "Filled.NumberZeroFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(157.68f, 88.39f)
                curveTo(164.34f, 98.52f, 168f, 112.59f, 168f, 128f)
                reflectiveCurveToRelative(-3.66f, 29.47f, -10.32f, 39.61f)
                curveTo(150.55f, 178.49f, 140.56f, 184f, 128f, 184f)
                reflectiveCurveToRelative(-22.55f, -5.51f, -29.68f, -16.39f)
                curveTo(91.66f, 157.47f, 88f, 143.41f, 88f, 128f)
                reflectiveCurveToRelative(3.66f, -29.48f, 10.32f, -39.61f)
                curveTo(105.45f, 77.51f, 115.44f, 72f, 128f, 72f)
                reflectiveCurveTo(150.55f, 77.51f, 157.68f, 88.39f)
                close()
                moveTo(216f, 40f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(56f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                lineTo(200f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 40f)
                close()
                moveTo(184f, 128f)
                curveToRelative(0f, -18.49f, -4.6f, -35.68f, -12.94f, -48.39f)
                curveTo(160.92f, 64.16f, 146f, 56f, 128f, 56f)
                reflectiveCurveTo(95.08f, 64.16f, 84.94f, 79.61f)
                curveTo(76.6f, 92.32f, 72f, 109.51f, 72f, 128f)
                reflectiveCurveToRelative(4.6f, 35.68f, 12.94f, 48.39f)
                curveTo(95.08f, 191.84f, 110f, 200f, 128f, 200f)
                reflectiveCurveToRelative(32.92f, -8.16f, 43.06f, -23.61f)
                curveTo(179.4f, 163.68f, 184f, 146.49f, 184f, 128f)
                close()
            }
        }.build()

        return _NumberZeroFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberZeroFill: ImageVector? = null
