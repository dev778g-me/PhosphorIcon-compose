package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.MaskSadFill: ImageVector
    get() {
        if (_MaskSadFill != null) {
            return _MaskSadFill!!
        }
        _MaskSadFill = ImageVector.Builder(
            name = "Filled.MaskSadFill",
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
                moveTo(66f, 125.33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 114.66f)
                curveToRelative(2.68f, 3f, 8.85f, 5.34f, 14f, 5.34f)
                reflectiveCurveToRelative(11.36f, -2.35f, 14f, -5.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 118f, 125.33f)
                curveTo(112.25f, 131.71f, 101.82f, 136f, 92f, 136f)
                reflectiveCurveTo(71.75f, 131.71f, 66f, 125.33f)
                close()
                moveTo(158.62f, 188.43f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 192f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.42f, -1.34f)
                curveTo(141.07f, 186.34f, 136f, 184f, 128f, 184f)
                reflectiveCurveToRelative(-13.07f, 2.34f, -19.57f, 6.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.86f, -13.32f)
                curveTo(108f, 171.73f, 116.06f, 168f, 128f, 168f)
                reflectiveCurveToRelative(20f, 3.73f, 28.43f, 9.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 158.66f, 188.43f)
                close()
                moveTo(189.92f, 125.33f)
                curveToRelative(-5.71f, 6.38f, -16.14f, 10.67f, -26f, 10.67f)
                reflectiveCurveToRelative(-20.25f, -4.29f, -26f, -10.67f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 150f, 114.66f)
                curveToRelative(2.68f, 3f, 8.85f, 5.34f, 14f, 5.34f)
                reflectiveCurveToRelative(11.36f, -2.35f, 14f, -5.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 190f, 125.33f)
                close()
            }
        }.build()

        return _MaskSadFill!!
    }

@Suppress("ObjectPropertyName")
private var _MaskSadFill: ImageVector? = null
