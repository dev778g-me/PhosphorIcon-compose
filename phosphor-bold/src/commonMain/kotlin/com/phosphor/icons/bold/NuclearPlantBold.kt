package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.NuclearPlantBold: ImageVector
    get() {
        if (_NuclearPlantBold != null) {
            return _NuclearPlantBold!!
        }
        _NuclearPlantBold = ImageVector.Builder(
            name = "Bold.NuclearPlantBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 12f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -47.34f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 52f)
                horizontalLineToRelative(4f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                horizontalLineToRelative(0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 216f)
                lineTo(240f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128.15f, 92f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7.63f)
                curveToRelative(2.37f, 51.77f, 28f, 100f, 37.56f, 116.37f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(39.69f, 216f)
                curveTo(53f, 189.23f, 70.12f, 146.16f, 71.86f, 99.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -7.64f)
                horizontalLineToRelative(48.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7.64f)
                curveToRelative(1.74f, 46.52f, 18.9f, 89.59f, 32.17f, 116.36f)
            }
        }.build()

        return _NuclearPlantBold!!
    }

@Suppress("ObjectPropertyName")
private var _NuclearPlantBold: ImageVector? = null
