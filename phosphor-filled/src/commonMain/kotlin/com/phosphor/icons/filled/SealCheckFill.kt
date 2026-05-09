package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SealCheckFill: ImageVector
    get() {
        if (_SealCheckFill != null) {
            return _SealCheckFill!!
        }
        _SealCheckFill = ImageVector.Builder(
            name = "Filled.SealCheckFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(225.86f, 102.82f)
                curveToRelative(-3.77f, -3.94f, -7.67f, -8f, -9.14f, -11.57f)
                curveToRelative(-1.36f, -3.27f, -1.44f, -8.69f, -1.52f, -13.94f)
                curveToRelative(-0.15f, -9.76f, -0.31f, -20.82f, -8f, -28.51f)
                reflectiveCurveToRelative(-18.75f, -7.85f, -28.51f, -8f)
                curveToRelative(-5.25f, -0.08f, -10.67f, -0.16f, -13.94f, -1.52f)
                curveToRelative(-3.56f, -1.47f, -7.63f, -5.37f, -11.57f, -9.14f)
                curveTo(146.28f, 23.51f, 138.44f, 16f, 128f, 16f)
                reflectiveCurveToRelative(-18.27f, 7.51f, -25.18f, 14.14f)
                curveToRelative(-3.94f, 3.77f, -8f, 7.67f, -11.57f, 9.14f)
                curveTo(88f, 40.64f, 82.56f, 40.72f, 77.31f, 40.8f)
                curveToRelative(-9.76f, 0.15f, -20.82f, 0.31f, -28.51f, 8f)
                reflectiveCurveTo(41f, 67.55f, 40.8f, 77.31f)
                curveToRelative(-0.08f, 5.25f, -0.16f, 10.67f, -1.52f, 13.94f)
                curveToRelative(-1.47f, 3.56f, -5.37f, 7.63f, -9.14f, 11.57f)
                curveTo(23.51f, 109.72f, 16f, 117.56f, 16f, 128f)
                reflectiveCurveToRelative(7.51f, 18.27f, 14.14f, 25.18f)
                curveToRelative(3.77f, 3.94f, 7.67f, 8f, 9.14f, 11.57f)
                curveToRelative(1.36f, 3.27f, 1.44f, 8.69f, 1.52f, 13.94f)
                curveToRelative(0.15f, 9.76f, 0.31f, 20.82f, 8f, 28.51f)
                reflectiveCurveToRelative(18.75f, 7.85f, 28.51f, 8f)
                curveToRelative(5.25f, 0.08f, 10.67f, 0.16f, 13.94f, 1.52f)
                curveToRelative(3.56f, 1.47f, 7.63f, 5.37f, 11.57f, 9.14f)
                curveTo(109.72f, 232.49f, 117.56f, 240f, 128f, 240f)
                reflectiveCurveToRelative(18.27f, -7.51f, 25.18f, -14.14f)
                curveToRelative(3.94f, -3.77f, 8f, -7.67f, 11.57f, -9.14f)
                curveToRelative(3.27f, -1.36f, 8.69f, -1.44f, 13.94f, -1.52f)
                curveToRelative(9.76f, -0.15f, 20.82f, -0.31f, 28.51f, -8f)
                reflectiveCurveToRelative(7.85f, -18.75f, 8f, -28.51f)
                curveToRelative(0.08f, -5.25f, 0.16f, -10.67f, 1.52f, -13.94f)
                curveToRelative(1.47f, -3.56f, 5.37f, -7.63f, 9.14f, -11.57f)
                curveTo(232.49f, 146.28f, 240f, 138.44f, 240f, 128f)
                reflectiveCurveTo(232.49f, 109.73f, 225.86f, 102.82f)
                close()
                moveTo(173.66f, 109.66f)
                lineTo(117.66f, 165.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(112f, 148.69f)
                lineToRelative(50.34f, -50.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
            }
        }.build()

        return _SealCheckFill!!
    }

@Suppress("ObjectPropertyName")
private var _SealCheckFill: ImageVector? = null
