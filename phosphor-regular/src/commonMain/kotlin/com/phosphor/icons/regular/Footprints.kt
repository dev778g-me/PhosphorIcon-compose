package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Footprints: ImageVector
    get() {
        if (_Footprints != null) {
            return _Footprints!!
        }
        _Footprints = ImageVector.Builder(
            name = "Regular.Footprints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 192f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(12f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 168f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(12f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(50.74f, 136f)
                curveTo(24.54f, 104f, 51.48f, 24f, 76f, 24f)
                reflectiveCurveToRelative(51.46f, 80f, 25.26f, 112f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(154.74f, 160f)
                curveToRelative(-26.2f, -32f, 0.74f, -112f, 25.26f, -112f)
                reflectiveCurveToRelative(51.46f, 80f, 25.26f, 112f)
                close()
            }
        }.build()

        return _Footprints!!
    }

@Suppress("ObjectPropertyName")
private var _Footprints: ImageVector? = null
