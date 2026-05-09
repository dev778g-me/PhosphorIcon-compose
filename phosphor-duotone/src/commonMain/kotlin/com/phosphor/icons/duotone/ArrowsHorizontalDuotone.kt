package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ArrowsHorizontalDuotone: ImageVector
    get() {
        if (_ArrowsHorizontalDuotone != null) {
            return _ArrowsHorizontalDuotone!!
        }
        _ArrowsHorizontalDuotone = ImageVector.Builder(
            name = "Duotone.ArrowsHorizontalDuotone",
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
                moveTo(200f, 160f)
                lineToRelative(32f, -32f)
                lineToRelative(-32f, -32f)
                lineToRelative(-144f, 0f)
                lineToRelative(-32f, 32f)
                lineToRelative(32f, 32f)
                lineToRelative(144f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 96f)
                lineToRelative(-32f, 32f)
                lineToRelative(32f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 96f)
                lineToRelative(32f, 32f)
                lineToRelative(-32f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 128f)
                lineTo(232f, 128f)
            }
        }.build()

        return _ArrowsHorizontalDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsHorizontalDuotone: ImageVector? = null
