package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.AngleDuotone: ImageVector
    get() {
        if (_AngleDuotone != null) {
            return _AngleDuotone!!
        }
        _AngleDuotone = ImageVector.Builder(
            name = "Duotone.AngleDuotone",
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
                moveTo(200f, 200f)
                horizontalLineTo(72f)
                verticalLineTo(72f)
                horizontalLineToRelative(32f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 72f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 32f)
                lineToRelative(0f, 168f)
                lineToRelative(168f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 72f)
                lineTo(72f, 72f)
            }
        }.build()

        return _AngleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _AngleDuotone: ImageVector? = null
