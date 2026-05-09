package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EyesFill: ImageVector
    get() {
        if (_EyesFill != null) {
            return _EyesFill!!
        }
        _EyesFill = ImageVector.Builder(
            name = "Filled.EyesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 32f)
                curveToRelative(-20.61f, 0f, -38.28f, 18.16f, -48f, 45.85f)
                curveTo(118.28f, 50.16f, 100.61f, 32f, 80f, 32f)
                curveToRelative(-31.4f, 0f, -56f, 42.17f, -56f, 96f)
                reflectiveCurveToRelative(24.6f, 96f, 56f, 96f)
                curveToRelative(20.61f, 0f, 38.28f, -18.16f, 48f, -45.85f)
                curveToRelative(9.72f, 27.69f, 27.39f, 45.85f, 48f, 45.85f)
                curveToRelative(31.4f, 0f, 56f, -42.17f, 56f, -96f)
                reflectiveCurveTo(207.4f, 32f, 176f, 32f)
                close()
                moveTo(106.92f, 186.39f)
                curveTo(99.43f, 200.12f, 89.62f, 208f, 80f, 208f)
                reflectiveCurveToRelative(-19.43f, -7.88f, -26.92f, -21.61f)
                arcToRelative(104.81f, 104.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.24f, -29.23f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -58.32f)
                arcTo(104.81f, 104.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53.08f, 69.61f)
                curveTo(60.57f, 55.88f, 70.38f, 48f, 80f, 48f)
                reflectiveCurveToRelative(19.43f, 7.88f, 26.92f, 21.61f)
                curveTo(115.35f, 85.07f, 120f, 105.81f, 120f, 128f)
                reflectiveCurveTo(115.35f, 170.93f, 106.92f, 186.39f)
                close()
                moveTo(202.92f, 186.39f)
                curveTo(195.43f, 200.12f, 185.62f, 208f, 176f, 208f)
                reflectiveCurveToRelative(-19.43f, -7.88f, -26.92f, -21.61f)
                arcToRelative(104.81f, 104.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.24f, -29.23f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -58.32f)
                arcToRelative(104.81f, 104.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.24f, -29.23f)
                curveTo(156.57f, 55.88f, 166.38f, 48f, 176f, 48f)
                reflectiveCurveToRelative(19.43f, 7.88f, 26.92f, 21.61f)
                curveTo(211.35f, 85.07f, 216f, 105.81f, 216f, 128f)
                reflectiveCurveTo(211.35f, 170.93f, 202.92f, 186.39f)
                close()
            }
        }.build()

        return _EyesFill!!
    }

@Suppress("ObjectPropertyName")
private var _EyesFill: ImageVector? = null
