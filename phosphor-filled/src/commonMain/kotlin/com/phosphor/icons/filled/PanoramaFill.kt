package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PanoramaFill: ImageVector
    get() {
        if (_PanoramaFill != null) {
            return _PanoramaFill!!
        }
        _PanoramaFill = ImageVector.Builder(
            name = "Filled.PanoramaFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(241.75f, 51.32f)
                arcToRelative(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.86f, -2.77f)
                lineToRelative(-3.48f, 0.94f)
                curveTo(205.61f, 54.56f, 170.61f, 64f, 128f, 64f)
                reflectiveCurveTo(50.39f, 54.56f, 31.59f, 49.49f)
                lineToRelative(-3.48f, -0.94f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 64f)
                lineTo(8f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                arcToRelative(16.22f, 16.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.18f, -0.55f)
                lineToRelative(3.18f, -0.86f)
                curveTo(50.13f, 201.49f, 85.17f, 192f, 128f, 192f)
                reflectiveCurveToRelative(77.87f, 9.49f, 96.69f, 14.59f)
                lineToRelative(3.18f, 0.86f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 192f)
                lineTo(248f, 64f)
                arcTo(15.9f, 15.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 241.75f, 51.32f)
                close()
                moveTo(204f, 96f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 204f, 96f)
                close()
                moveTo(128f, 176f)
                curveToRelative(-45f, 0f, -82.72f, 10.23f, -100.87f, 15.14f)
                lineTo(24f, 192f)
                verticalLineToRelative(-39.3f)
                lineToRelative(46.34f, -46.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineTo(152.28f, 177f)
                curveTo(144.49f, 176.35f, 136.37f, 176f, 128f, 176f)
                close()
                moveTo(228.87f, 191.14f)
                arcToRelative(448.7f, 448.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -51f, -11.2f)
                lineToRelative(-35.26f, -35.26f)
                lineTo(157f, 130.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 0f)
                lineToRelative(60.89f, 60.88f)
                close()
            }
        }.build()

        return _PanoramaFill!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaFill: ImageVector? = null
