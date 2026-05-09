package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TennisBallDuotone: ImageVector
    get() {
        if (_TennisBallDuotone != null) {
            return _TennisBallDuotone!!
        }
        _TennisBallDuotone = ImageVector.Builder(
            name = "Duotone.TennisBallDuotone",
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
                moveTo(32f, 128f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.83f, -96f)
                horizontalLineToRelative(0f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 127.83f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(128.17f, 224.17f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.83f, -96f)
                horizontalLineToRelative(0f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128.17f, 224f)
                close()
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
                moveTo(127.83f, 32f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 127.83f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 128.17f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128.17f, 224f)
            }
        }.build()

        return _TennisBallDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TennisBallDuotone: ImageVector? = null
