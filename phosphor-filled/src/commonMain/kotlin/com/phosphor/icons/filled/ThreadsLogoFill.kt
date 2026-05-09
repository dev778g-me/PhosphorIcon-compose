package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ThreadsLogoFill: ImageVector
    get() {
        if (_ThreadsLogoFill != null) {
            return _ThreadsLogoFill!!
        }
        _ThreadsLogoFill = ImageVector.Builder(
            name = "Filled.ThreadsLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(138.62f, 128f)
                arcToRelative(53.54f, 53.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.1f, 1.63f)
                curveToRelative(-0.57f, 8.21f, -3.34f, 15f, -8.11f, 19.61f)
                arcTo(23.89f, 23.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127f, 156f)
                curveToRelative(-11.87f, 0f, -15f, -7.58f, -15f, -12.07f)
                curveTo(112f, 133f, 125.8f, 128f, 138.62f, 128f)
                close()
                moveTo(224f, 128f)
                curveToRelative(0f, 65.12f, -35.89f, 104f, -96f, 104f)
                reflectiveCurveTo(32f, 193.12f, 32f, 128f)
                reflectiveCurveTo(67.89f, 24f, 128f, 24f)
                reflectiveCurveTo(224f, 62.88f, 224f, 128f)
                close()
                moveTo(72f, 128f)
                curveToRelative(0f, -43.07f, 18.32f, -64f, 56f, -64f)
                curveToRelative(26.34f, 0f, 43f, 10.08f, 50.81f, 30.83f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, -5.66f)
                curveTo(180.9f, 55.14f, 150.9f, 48f, 128f, 48f)
                curveToRelative(-26.1f, 0f, -45.52f, 8.7f, -57.72f, 25.86f)
                curveTo(60.8f, 87.19f, 56f, 105.4f, 56f, 128f)
                reflectiveCurveToRelative(4.8f, 40.81f, 14.28f, 54.14f)
                curveTo(82.48f, 199.3f, 101.9f, 208f, 128f, 208f)
                curveToRelative(24.45f, 0f, 39.82f, -8.8f, 48.41f, -16.18f)
                curveToRelative(10.76f, -9.25f, 17.19f, -21.89f, 17.19f, -33.82f)
                curveToRelative(0f, -14.3f, -6.59f, -26.79f, -18.56f, -35.17f)
                arcToRelative(54.16f, 54.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.77f, -4.5f)
                curveToRelative(-2.09f, -14.65f, -10f, -25.75f, -22.34f, -31.07f)
                curveTo(130.43f, 81f, 112f, 83.93f, 101.21f, 94.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 11.62f)
                curveToRelative(5.43f, -5.14f, 16.79f, -8f, 26.4f, -3.85f)
                arcToRelative(20.05f, 20.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.77f, 10.92f)
                arcToRelative(68.89f, 68.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.76f, -0.85f)
                curveTo(113.53f, 112f, 96f, 125.15f, 96f, 143.93f)
                curveToRelative(0f, 16.27f, 13f, 28.07f, 31f, 28.07f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.75f, -11.29f)
                curveToRelative(4.7f, -4.59f, 10.11f, -12.2f, 12.17f, -24f)
                arcTo(25.55f, 25.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 177.6f, 158f)
                curveToRelative(0f, 13.71f, -15.76f, 34f, -49.6f, 34f)
                curveTo(90.32f, 192f, 72f, 171.07f, 72f, 128f)
                close()
            }
        }.build()

        return _ThreadsLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _ThreadsLogoFill: ImageVector? = null
