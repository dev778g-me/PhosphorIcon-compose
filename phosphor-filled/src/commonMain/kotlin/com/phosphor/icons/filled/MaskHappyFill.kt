package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MaskHappyFill: ImageVector
    get() {
        if (_MaskHappyFill != null) {
            return _MaskHappyFill!!
        }
        _MaskHappyFill = ImageVector.Builder(
            name = "Filled.MaskHappyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(217f, 34.8f)
                arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.82f, -1.71f)
                curveTo(188.15f, 38.55f, 159.82f, 47.71f, 128f, 47.71f)
                reflectiveCurveTo(67.84f, 38.55f, 53.79f, 33.09f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                verticalLineToRelative(55.77f)
                curveToRelative(0f, 35.84f, 9.65f, 69.65f, 27.18f, 95.18f)
                curveToRelative(18.16f, 26.46f, 42.6f, 41f, 68.82f, 41f)
                reflectiveCurveToRelative(50.66f, -14.57f, 68.82f, -41f)
                curveTo(214.35f, 173.44f, 224f, 139.63f, 224f, 103.79f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 217f, 34.8f)
                close()
                moveTo(78f, 133.33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 66f, 122.66f)
                curveTo(71.75f, 116.28f, 82.18f, 112f, 92f, 112f)
                reflectiveCurveToRelative(20.25f, 4.28f, 26f, 10.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 106f, 133.33f)
                curveToRelative(-2.68f, -3f, -8.85f, -5.33f, -14f, -5.33f)
                reflectiveCurveTo(80.64f, 130.34f, 78f, 133.33f)
                close()
                moveTo(168.49f, 181.19f)
                arcToRelative(52.9f, 52.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80.9f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 99.72f, 170.8f)
                arcToRelative(36.89f, 36.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56.56f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.17f, 10.39f)
                close()
                moveTo(189.34f, 134f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.3f, -0.63f)
                curveToRelative(-2.68f, -3f, -8.85f, -5.33f, -14f, -5.33f)
                reflectiveCurveToRelative(-11.36f, 2.34f, -14f, 5.33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 138f, 122.66f)
                curveToRelative(5.71f, -6.38f, 16.14f, -10.66f, 26f, -10.66f)
                reflectiveCurveToRelative(20.25f, 4.28f, 26f, 10.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 189.34f, 134f)
                close()
            }
        }.build()

        return _MaskHappyFill!!
    }

@Suppress("ObjectPropertyName")
private var _MaskHappyFill: ImageVector? = null
