package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.DribbbleLogoDuotone: ImageVector
    get() {
        if (_DribbbleLogoDuotone != null) {
            return _DribbbleLogoDuotone!!
        }
        _DribbbleLogoDuotone = ImageVector.Builder(
            name = "Duotone.DribbbleLogoDuotone",
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
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(71f, 205.27f)
                arcTo(159.93f, 159.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 128f)
                curveToRelative(5.39f, 0f, 10.73f, 0.27f, 16f, 0.79f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(188f, 53.09f)
                arcTo(159.69f, 159.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 112f)
                arcToRelative(161.14f, 161.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30.16f, -2.84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(85.93f, 41.69f)
                arcToRelative(159.91f, 159.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79f, 138f)
                arcToRelative(160.45f, 160.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.73f, 38.78f)
            }
        }.build()

        return _DribbbleLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _DribbbleLogoDuotone: ImageVector? = null
