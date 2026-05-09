package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.PanoramaLight: ImageVector
    get() {
        if (_PanoramaLight != null) {
            return _PanoramaLight!!
        }
        _PanoramaLight = ImageVector.Builder(
            name = "Light.PanoramaLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.05f, -7.74f)
                curveTo(43.35f, 60.89f, 81.44f, 72f, 128f, 72f)
                reflectiveCurveTo(212.65f, 60.89f, 230f, 56.27f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 64f)
                verticalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.06f, 7.73f)
                curveTo(212.63f, 195.08f, 174.55f, 184f, 128f, 184f)
                reflectiveCurveTo(43.37f, 195.08f, 26.06f, 199.72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 192f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(204f, 108f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 160.69f)
                lineToRelative(54.34f, -54.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(79.46f, 79.46f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(131.31f, 156f)
                lineTo(157f, 130.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 0f)
                lineToRelative(68.25f, 68.25f)
            }
        }.build()

        return _PanoramaLight!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaLight: ImageVector? = null
