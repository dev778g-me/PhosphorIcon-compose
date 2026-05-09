package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FileCDuotone: ImageVector
    get() {
        if (_FileCDuotone != null) {
            return _FileCDuotone!!
        }
        _FileCDuotone = ImageVector.Builder(
            name = "Duotone.FileCDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(152f, 32f)
                lineToRelative(0f, 56f)
                lineToRelative(56f, 0f)
                lineToRelative(-56f, -56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 200.87f)
                arcTo(22.12f, 22.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 208f)
                curveToRelative(-13.26f, 0f, -24f, -12.54f, -24f, -28f)
                reflectiveCurveToRelative(10.74f, -28f, 24f, -28f)
                arcToRelative(22.12f, 22.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 7.13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 224f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(88f)
                lineTo(152f, 32f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 32f)
                lineToRelative(0f, 56f)
                lineToRelative(56f, 0f)
            }
        }.build()

        return _FileCDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FileCDuotone: ImageVector? = null
