package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.GrainsLight: ImageVector
    get() {
        if (_GrainsLight != null) {
            return _GrainsLight!!
        }
        _GrainsLight = ImageVector.Builder(
            name = "Light.GrainsLight",
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
                moveTo(128f, 224f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, -80f)
                verticalLineTo(120f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 224f)
                lineToRelative(-0f, -0f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0f, -0f)
                lineToRelative(-0f, -24f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, -80f)
                lineToRelative(-0f, -0f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0f, -0f)
                lineTo(208f, 144f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 120f)
                verticalLineTo(64f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 80f)
                verticalLineToRelative(56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 120f)
                verticalLineTo(64f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
                verticalLineToRelative(56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(84.05f, 72.57f)
                curveTo(95.62f, 40.19f, 128f, 24f, 128f, 24f)
                reflectiveCurveTo(160.38f, 40.19f, 172f, 72.58f)
            }
        }.build()

        return _GrainsLight!!
    }

@Suppress("ObjectPropertyName")
private var _GrainsLight: ImageVector? = null
