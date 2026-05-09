package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChartPieSliceFill: ImageVector
    get() {
        if (_ChartPieSliceFill != null) {
            return _ChartPieSliceFill!!
        }
        _ChartPieSliceFill = ImageVector.Builder(
            name = "Filled.ChartPieSliceFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(100f, 116.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -6.93f)
                verticalLineToRelative(-72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 93.34f, 30f)
                arcTo(104.06f, 104.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.73f, 147f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.52f, 5.81f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, 0.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -1.07f)
                close()
                moveTo(88f, 49.62f)
                verticalLineToRelative(55.26f)
                lineTo(40.12f, 132.51f)
                curveTo(40f, 131f, 40f, 129.48f, 40f, 128f)
                arcTo(88.12f, 88.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 49.62f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.32f, 180.7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.87f, -11f)
                lineTo(120f, 123.83f)
                verticalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                arcToRelative(104.05f, 104.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.74f, 51.48f)
                curveToRelative(0.11f, 0.16f, 0.21f, 0.32f, 0.31f, 0.49f)
                reflectiveCurveToRelative(0.2f, 0.37f, 0.29f, 0.55f)
                arcTo(103.34f, 103.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
            }
        }.build()

        return _ChartPieSliceFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPieSliceFill: ImageVector? = null
