package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.StackMinusDuotone: ImageVector
    get() {
        if (_StackMinusDuotone != null) {
            return _StackMinusDuotone!!
        }
        _StackMinusDuotone = ImageVector.Builder(
            name = "Duotone.StackMinusDuotone",
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
                moveTo(184f, 200f)
                lineTo(232f, 200f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(32f, 80f)
                lineToRelative(96f, 56f)
                lineToRelative(96f, -56f)
                lineToRelative(-96f, -56f)
                lineToRelative(-96f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 128f)
                lineToRelative(96f, 56f)
                lineToRelative(96f, -56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 80f)
                lineToRelative(96f, 56f)
                lineToRelative(96f, -56f)
                lineToRelative(-96f, -56f)
                lineToRelative(-96f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 176f)
                lineToRelative(96f, 56f)
                lineToRelative(16f, -9.33f)
            }
        }.build()

        return _StackMinusDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StackMinusDuotone: ImageVector? = null
