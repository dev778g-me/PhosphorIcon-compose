package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CaretLineDownDuotone: ImageVector
    get() {
        if (_CaretLineDownDuotone != null) {
            return _CaretLineDownDuotone!!
        }
        _CaretLineDownDuotone = ImageVector.Builder(
            name = "Duotone.CaretLineDownDuotone",
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
                moveTo(208f, 72f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
                lineToRelative(160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 72f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
                lineToRelative(160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 192f)
                lineTo(208f, 192f)
            }
        }.build()

        return _CaretLineDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineDownDuotone: ImageVector? = null
