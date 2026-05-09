package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CaretLineLeftDuotone: ImageVector
    get() {
        if (_CaretLineLeftDuotone != null) {
            return _CaretLineLeftDuotone!!
        }
        _CaretLineLeftDuotone = ImageVector.Builder(
            name = "Duotone.CaretLineLeftDuotone",
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
                moveTo(192f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(0f, 160f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 208f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(0f, 160f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 48f)
                lineTo(72f, 208f)
            }
        }.build()

        return _CaretLineLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineLeftDuotone: ImageVector? = null
